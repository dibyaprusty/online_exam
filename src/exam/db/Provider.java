package exam.db;
import java.sql.*;

public class Provider 
{
	public static Connection getOracleConnection()
	{
		Connection con=null;
	
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Guru_16");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static Connection getMysqlConnection()
	{
		Connection con=null;
	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) 
	{
		Connection con_ora=Provider.getOracleConnection();
		Connection con_mysql=Provider.getMysqlConnection();
		
		System.out.println(con_ora);
		System.out.println(con_mysql);
		
	}
}


/* How to set the class path in eclipse
 * ------------------------------------
 * JRE System Library (in Project)-> Right Click -> Build Path -> Configure  Build Path -> Libraries -> Select classPath -> Add External Jar File -> browse the jar file -> apply and close
 * 
 * Note:-
 * Check for the JAR files in referenced libraries.
 */
