package com.sunBase.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sunBase.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

    public Optional<Customer> findByEmail(String email);
    public Optional<Customer> findByUuid(String uuid);

  
    @Query("SELECT c FROM Customer c WHERE " +
    	       "(LOWER(c.first_name) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
    	       "LOWER(c.last_name) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
    	       "LOWER(c.city) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
    	       "LOWER(c.phone) LIKE LOWER(CONCAT('%', :searchTerm, '%'))) AND " +
    	       "(COALESCE(:city, '') = '' OR LOWER(c.city) = LOWER(:city)) AND " +
    	       "(COALESCE(:state, '') = '' OR LOWER(c.state) = LOWER(:state)) AND " +
    	       "(COALESCE(:email, '') = '' OR LOWER(c.email) = LOWER(:email))")
    	Page<Customer> filterAndSearchCustomers(
    	    @Param("searchTerm") String searchTerm,
    	    @Param("city") String city,
    	    @Param("state") String state,
    	    @Param("email") String email,
    	    Pageable pageable
    	);
    
    
    
}
