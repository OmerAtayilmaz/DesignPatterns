public class DBConnection {

    public static volatile DBConnection dbConnection;
    private String s;
    private DBConnection(String s){
        this.s = s;
    }

    public static DBConnection getInstance(String s){
        DBConnection result = dbConnection;
        if(result == null){
            synchronized (DBConnection.class){
                if(result == null)
                    result = new DBConnection(s);
            }
        }


        return result;
    }


}
