package com.bhargavaroyal.javalib.oopsconcepts.dependencyinversion.good;

import java.sql.Connection;

/**
 * Datasource interface
 *
 */
public interface DataSource {
	void createConnection(DatabaseConfig config);
	Connection getConnection();
	
}
