package com.moglix.EMS.service.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {
	@Autowired
DataSource getMySQLDataSource;
	
	public Connection getConnection() {
		Connection connection=null;
		try {
		
		 connection=getMySQLDataSource.getConnection();
		return connection;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public void closeConnection(Connection connection) {
		
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
