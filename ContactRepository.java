package com.example.demo;
import org.springframework.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository  extends JpaRepository<Contact, Long>{
	

}
