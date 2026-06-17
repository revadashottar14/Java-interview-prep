package day05;

import javax.xml.crypto.Data;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private DatabaseConnectionPool() {
        System.out.println("Creating Database Connection Instance......");}
        public static synchronized DatabaseConnectionPool getInstance() {
            if(instance == null){
                instance = new DatabaseConnectionPool();
            }
            return instance;
        }
        public void connect(String dbUrl){
            System.out.println("Connected to"+dbUrl);
        }
}
