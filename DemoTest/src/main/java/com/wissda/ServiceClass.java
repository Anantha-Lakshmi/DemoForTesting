package com.wissda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	@Autowired
	private RepositoryEmployee repo;

	public ResponseEntity<DocumentEmployee> getEmployeeByName(String name) {
		DocumentEmployee emp=repo.findByName(name);
		return new ResponseEntity<DocumentEmployee>(emp,HttpStatus.OK);
	}

}
