package com.wissda;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryEmployee extends MongoRepository<DocumentEmployee, String>{

	 public DocumentEmployee findByName(String name);
}
