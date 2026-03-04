public class DatabaseConnection {

    // Step 1: Create single instance
    private static final DatabaseConnection obj = new DatabaseConnection();

    // Step 2: Private constructor
    private DatabaseConnection() {
        System.out.println("DatabaseConnection Created");
    }

    // Step 3: Global access method
    public static DatabaseConnection getInstance() {
        return obj;
    }

    public void connect() {
        System.out.println("Connect to DB");
    }
    public void connected(){
        System.out.println("Connected to DB");

    }
}