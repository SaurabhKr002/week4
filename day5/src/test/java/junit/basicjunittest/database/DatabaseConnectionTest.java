package junit.basicjunittest.database;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
        assertTrue(db.isConnected(), "Database connection should be established before each test");
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database connection should be closed after each test");
    }

    @Test
    void testConnection() {
        assertTrue(db.isConnected(), "Database should be connected");
    }

    @Test
    void testQueryExecution() {
        assertTrue(db.executeQuery("SELECT * FROM users"), "Query should execute successfully");
    }
}
