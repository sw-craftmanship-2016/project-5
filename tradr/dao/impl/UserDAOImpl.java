package com.workshop.tradr.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.workshop.tradr.bean.UserRegistration;
import com.workshop.tradr.dao.UserDAO;

public class UserDAOImpl implements UserDAO{
	
	private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private JdbcTemplate jdbcTemplate;

	@Override
	public String insert(UserRegistration userRegistration) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
