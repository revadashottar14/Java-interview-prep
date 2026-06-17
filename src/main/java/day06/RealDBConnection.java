package day06;

public class RealDBConnection implements DatabaseConnection{

    private String dbUrl;

    public RealDBConnection(String dbUrl){
        this.dbUrl = dbUrl;
        System.out.println("Real Connection: Connecting to" + dbUrl);
    }

    @Override
    public String query(String sql) {
        System.out.println("Real connection executing" +sql);
        return "Result from "+dbUrl;
    }
}
