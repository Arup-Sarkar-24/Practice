package com.mycompany.springjdbc.dao;

import org.springframework.data.repository.CrudRepository;
import com.mycompany.springjdbc.enities.Students;
public interface JdbcTemplate extends CrudRepository<Students, Integer>  {


}
