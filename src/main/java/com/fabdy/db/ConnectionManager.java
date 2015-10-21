package com.fabdy.db;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class ConnectionManager {
	private Connection conn;
	BoneCPConfig config = new BoneCPConfig();;
	BoneCP connectionPool;
	static ConnectionManager manager;
	private ConnectionManager(String username, String password, String url, String database) throws Exception {
		BoneCPConfig config = new BoneCPConfig();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			config.setJdbcUrl("jdbc:mysql://" + url + ":3306/" + database);
			config.setUsername(username);
			config.setPassword(password);
			config.setIdleConnectionTestPeriodInSeconds(50);
			config.setConnectionTestStatement("SELECT 1");
			config.setPartitionCount(1);
			config.setMaxConnectionsPerPartition(2);
			config.setMinConnectionsPerPartition(1);
			config.setIdleMaxAgeInSeconds(55);
			config.setAcquireRetryAttempts(25);
			config.setAcquireRetryDelay(30, TimeUnit.SECONDS);
			connectionPool = new BoneCP(config);
		} catch (ClassNotFoundException e) {
			throw new Exception(e);
		}
	}
	
	public Connection getConnection() throws Exception {
		try {
			conn = connectionPool.getConnection();
		} catch(SQLException e) {
			throw new Exception(e);
		}
		return conn;
	}
	
	public static ConnectionManager getInstance(String username, String password, String url, String database) throws Exception {
		synchronized (new Object()) {
			if(manager == null) {
				return new ConnectionManager(username, password, url, database);
			}
			return manager;
		}
	}
}
