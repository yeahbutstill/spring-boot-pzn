package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.singleton.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    void testSingleton() {
        var database1 = Database.getDatabase();
        var database2 = Database.getDatabase();

        Assertions.assertSame(database1, database2);
    }
}
