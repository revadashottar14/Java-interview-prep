package day05;

public class SingletonDemo {
    public static void main(String[]args){
        DatabaseConnectionPool pool1 = DatabaseConnectionPool.getInstance();
        pool1.connect("jdbc:mysql://localhost:3306/payment_db");
        DatabaseConnectionPool pool2 = DatabaseConnectionPool.getInstance();
        pool2.connect("jdbc:mysql://localhost:3306/payment_db");
        System.out.println("pool1 == pool2 "+(pool1==pool2));

    }
}
