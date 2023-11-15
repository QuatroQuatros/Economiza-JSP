package Helpers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static ConnectionManager instance = null;
    private Connection conn;

    private final String SID = "ORCL";
    private final String url = "jdbc:oracle:thin:@//oracle.fiap.com.br:1521/" + SID;
    private final String username = "RM98748";
    private final String password = "091203";
    
    private ConnectionManager() {
    	
    }
    
    
    public static ConnectionManager getInstance() {
        if (instance == null) {
            synchronized (ConnectionManager.class) {
                if (instance == null) {
                    instance = new ConnectionManager();
                }
            }
        }
        return instance;
    }
    
    public Connection getConnection() {
    	try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    	return conn;
    }


	public void closeConnection() {
		
	}
}
