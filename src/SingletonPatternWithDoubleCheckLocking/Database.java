package SingletonPatternWithDoubleCheckLocking;

public class Database {
    private static volatile Database instance = null;
    private String dbUrl;
    private String username;
    private String password;
    private String region;
    private Database(){
        System.out.println("Connected to DB Successfully!");
    }
    public static Database dbConnection(){
            if(instance==null){
                synchronized (Database.class){
                    if(instance==null)instance = new Database();
                }
            }

        return instance;
    }
}
