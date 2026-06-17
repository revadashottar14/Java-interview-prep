package day06;

public class DatabaseConnectionProxy implements DatabaseConnection{

    private RealDBConnection realDBConnection;
    private String dbUrl;
    private String loggedInUser;

    public DatabaseConnectionProxy (String dbUrl, String user){
        this.dbUrl = dbUrl;
        this.loggedInUser = user;
    }

    @Override
    public String query(String sql) {
        if(!IsUserAuthorised()){
            return "Access Denied!!!!!";
        }
        System.out.println("Logging User"+ loggedInUser + "authorised");
        if(realDBConnection == null){
            realDBConnection = new RealDBConnection(dbUrl);
        }
        return realDBConnection.query(sql);
    }

    private boolean IsUserAuthorised(){
        return loggedInUser.equals("admin") || loggedInUser.equals("developer");
    }
}
