package com.springbootrestapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springbootrestapplication.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers") 
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
