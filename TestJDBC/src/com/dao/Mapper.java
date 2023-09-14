package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.models.PharmacyRecord;

public class Mapper implements RowMapper<PharmacyRecord> {
	public PharmacyRecord mapRow(ResultSet rs, int i) throws SQLException {
		PharmacyRecord mc = new PharmacyRecord();
		return mc;

	}

}