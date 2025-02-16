package junit.basicjunittest.database;

class DatabaseConnection {
    private boolean connected;

    void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    boolean isConnected() {
        return connected;
    }

    boolean executeQuery(String query) {
        return connected && query != null && !query.isEmpty();
    }
}
