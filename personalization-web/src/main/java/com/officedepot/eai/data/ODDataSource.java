package com.officedepot.eai.data;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.ibm.as400.access.AS400JDBCDataSource;


@ConfigurationProperties("as400.datasource")
public class ODDataSource {
	
	private String serverName;
	private String naming; 
	private String userName;
	private String password; 
	private String driver;
	
	
	@Bean
	public DataSource dataSource() {
		AS400JDBCDataSource dataSource = new AS400JDBCDataSource(); 
		dataSource.setServerName(serverName);
		dataSource.setNaming(naming);
		dataSource.setUser(userName);
		dataSource.setPassword(password);
		return dataSource;
	}


	public String getServerName() {
		return serverName;
	}


	public void setServerName(String serverName) {
		this.serverName = serverName;
	}


	public String getNaming() {
		return naming;
	}


	public void setNaming(String naming) {
		this.naming = naming;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDriver() {
		return driver;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	 
	
}
