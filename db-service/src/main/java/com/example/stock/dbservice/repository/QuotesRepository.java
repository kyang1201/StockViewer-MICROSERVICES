package com.example.stock.dbservice.repository;

import java.util.List;

import com.example.stock.dbservice.model.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuotesRepository extends JpaRepository<Quote, Integer>{

	List<Quote> findByUserName(String username);

}