package basicjunittesting.calculatortest.databaseconnectiontest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import basicJunitproblems.calculator.databaseconnection.DatabaseConnection;

public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    public void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected");
    }

    @Test
    public void testConnectionClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database should be disconnected");
    }
}
