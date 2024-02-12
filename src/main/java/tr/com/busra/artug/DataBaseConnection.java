package tr.com.busra.artug;

//Singleton Design
public class DataBaseConnection {

    private static DataBaseConnection instance;
    private String connectionString;

    public static void setInstance(DataBaseConnection instance) {
        DataBaseConnection.instance = instance;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public DataBaseConnection(){
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
    }
    public static DataBaseConnection getInstance(){
        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Veritabanına bağlandı" + connectionString);
    }
    public void disconnect(){
        System.out.println("Veri tabanından çıkıldı");

    }
}
