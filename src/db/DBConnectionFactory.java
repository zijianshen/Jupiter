package db;

import db.mongodb.MongoDBConnection;
import db.sql.MySQLConnection;

public class DBConnectionFactory {
	private static final String DEFAULT_DB = "mongodb";

	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			return new MySQLConnection();
		case "mongodb":
			return new MongoDBConnection();
		default:
			throw new IllegalArgumentException("Invalid db" + db);
		}
	}

	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}
}
