

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection connect() {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:datalogs.db");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e+ "");
		}
		
		return conn;
	}
}
