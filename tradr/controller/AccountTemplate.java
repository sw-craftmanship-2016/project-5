package com.workshop.tradr.controller;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountTemplate implements AccountDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(String loginName,String password, String securityQuestion) {
      String SQL = "insert into customer (CUSTOMER_LOGIN_NAME, CUSTOMER_LOGIN_PASSWORD, SECRET_QUESTION) values (?, ?,?)";
      
      jdbcTemplateObject.update( SQL, loginName, password, securityQuestion);
      //System.out.println("Created Record Name = " + name + " Age = " + age);
      return;
   }

}