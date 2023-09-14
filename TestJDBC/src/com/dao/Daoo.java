package com.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Daoo implements Dao {
	JdbcTemplate jt;

	@Autowired
	public Daoo(DataSource ds) {
		jt = new JdbcTemplate(ds);
	}

}
