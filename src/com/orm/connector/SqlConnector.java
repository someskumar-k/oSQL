package com.orm.connector;

public class SqlConnector {
	public String excecute_query(String query) {
		return "";
	}
	public static SqlConnector getConnection() {
		return new SqlConnector();
	}
}
