package day06;

public class ProxyDemo {
    public static void main(String[] args) {

        System.out.println("=== Authorized User (admin) ===");
        DatabaseConnection db1 = new DatabaseConnectionProxy("jdbc:mysql://localhost:3306/payment", "admin");
        System.out.println(db1.query("SELECT * FROM transactions"));
        System.out.println(db1.query("SELECT * FROM users"));  // No new connection needed

        System.out.println("\n=== Unauthorized User (guest) ===");
        DatabaseConnection db2 = new DatabaseConnectionProxy("jdbc:mysql://localhost:3306/payment", "guest");
        System.out.println(db2.query("SELECT * FROM transactions"));

        System.out.println("\n=== Another Authorized User (developer) ===");
        DatabaseConnection db3 = new DatabaseConnectionProxy("jdbc:mysql://localhost:3306/payment", "developer");
        System.out.println(db3.query("DELETE FROM transactions"));  // Risky query
    }
}