package org.algorithm.example.test;

import com.github.shyiko.mysql.binlog.event.deserialization.EventDeserializer;

import java.util.EnumSet;

public class BinlogReaderTest {
    public static void main(String[] args) {
//        MySQLBinlogReader mySQLBinlogReader = new MySQLBinlogReader("192.168.226.102", 3306, "root", "123456");
//        mySQLBinlogReader.startReadingBinlog();


//        Long t1 = 1719230400000L;
        EnumSet<EventDeserializer.CompatibilityMode> compatibilitySet = EnumSet.noneOf(EventDeserializer.CompatibilityMode.class);
        System.out.println(compatibilitySet.contains(EventDeserializer.CompatibilityMode.DATE_AND_TIME_AS_LONG));
        System.out.println(compatibilitySet.contains(EventDeserializer.CompatibilityMode.DATE_AND_TIME_AS_LONG_MICRO));
        System.out.println(compatibilitySet);
    }
}
