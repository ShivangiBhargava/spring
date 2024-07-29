package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	
	public List<Contact> getAllContacts() {
		return contactRepo.findAll();
	}
	
	public Optional<Contact> getContactById(Long id) {
		return contactRepo.findById(id);
	}
	
	public Contact saveContact(Contact contact) {
		return contactRepo.save(contact);
	}
	
	public void deleteContact(Long id) {
		contactRepo.deleteById(id);
	}
}
