package org.algorithm.example.test;
import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.*;

import java.io.Serializable;
import java.util.Map;

public class MySQLBinlogReader {

    private String hostname;
    private int port;
    private String username;
    private String password;

    public MySQLBinlogReader(String hostname, int port, String username, String password) {
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public void startReadingBinlog() {
        BinaryLogClient client = new BinaryLogClient(hostname, port, username, password);

        client.registerEventListener(this::handleEvent);

        try {
            client.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleEvent(Event event) {
        EventType eventType = event.getHeader().getEventType();
        switch (eventType) {
            case TABLE_MAP:
                TableMapEventData tableMapEventData = event.getData();
                System.out.println("Table Map Event: " + tableMapEventData);
                break;
            case EXT_WRITE_ROWS:
            case WRITE_ROWS:
                WriteRowsEventData writeRowsEventData = event.getData();
                System.out.println("Write Rows Event: ");
                printRows(writeRowsEventData.getRows());
                break;
            case EXT_UPDATE_ROWS:
            case UPDATE_ROWS:
                UpdateRowsEventData updateRowsEventData = event.getData();
                System.out.println("Update Rows Event: ");
                printUpdatedRows(updateRowsEventData.getRows());
                break;
            case EXT_DELETE_ROWS:
            case DELETE_ROWS:
                DeleteRowsEventData deleteRowsEventData = event.getData();
                System.out.println("Delete Rows Event: ");
                printRows(deleteRowsEventData.getRows());
                break;
            default:
                System.out.println("Other Event: " + event);
        }
    }

    private void printRows(Iterable<Serializable[]> rows) {
        for (Serializable[] row : rows) {
            for (Serializable value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private void printUpdatedRows(Iterable<Map.Entry<Serializable[], Serializable[]>> rows) {
        for (Map.Entry<Serializable[], Serializable[]> row : rows) {
            System.out.print("Before: ");
            for (Serializable value : row.getKey()) {
                System.out.print(value + " ");
            }
            System.out.print(" | After: ");
            for (Serializable value : row.getValue()) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 3306;
        String username = "root";
        String password = "password";

        MySQLBinlogReader binlogReader = new MySQLBinlogReader(hostname, port, username, password);
        binlogReader.startReadingBinlog();
    }
}
