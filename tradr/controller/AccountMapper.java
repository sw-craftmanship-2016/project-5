package com.workshop.tradr.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AccountMapper implements RowMapper<NewUser> {
   public NewUser mapRow(ResultSet rs, int rowNum) throws SQLException {
      NewUser newuser = new NewUser();
      newuser.setLoginName(rs.getString("loginName"));
      newuser.setPassword(rs.getString("password"));
      newuser.setSecurityQuestion(rs.getString("securityQuestion"));
      return newuser;
   }
}