package com.simplilearn.phase3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3.model.EProduct;

@Repository
public class EProductDAO {

	@Autowired
	JdbcTemplate template;

	public List<EProduct> getProducts() {
		
		return template.query("select * from eproduct_14082021", new RowMapper<EProduct> () {
			
			public EProduct mapRow(ResultSet rs, int row) throws SQLException {
				EProduct e  = new EProduct();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPrice(rs.getBigDecimal(3));
				return e;
			}
		});

	}

}
