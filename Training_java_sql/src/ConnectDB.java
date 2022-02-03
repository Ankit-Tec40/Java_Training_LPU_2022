import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {
	Connection connection;
	Statement statement;
	
	public ConnectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[DB] Driver Loaded");
			
			String url = "jdbc:mysql://localhost/javaclass";
			String user = "root";
			String password = "pass";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("[DB] Connection Created");
			
			statement = connection.createStatement();
			System.out.println("[DB] Statement Created");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}
	
	
	public int executeSQLStatement(String sql) {
		
		int result = 0;
		
		try {
			// executeUpdate -> for : insert update and delete instructions
			result = statement.executeUpdate(sql);
			System.out.println("[DB] SQL Statement Executed");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return result;
	}
	
	public ResultSet executeSQLStatementOUT(String sql) {
		
		ResultSet rs = null;		
		try {
			// executeUpdate -> for : read
			rs = statement.executeQuery(sql);
			System.out.println("[DB] SQL Statement Executed");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return rs;
	}
	
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("[DB] Connection Closed");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	
	public static void main(String[] args) {
		ConnectDB ob=new ConnectDB();
		try {
			ob.executeSQLStatement("CREATE TABLE student (PersonID int, LastName varchar(255), FirstName varchar(255));");

		} catch (Exception e) {
			System.out.println(e);
		}
		
		//ob.executeSQLStatement("insert into student values(9,\"kumar\",\"Ankit\")");
		System.out.println(ob.executeSQLStatementOUT("select * from student"));


	}
}
