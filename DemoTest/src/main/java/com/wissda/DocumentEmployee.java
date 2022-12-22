package com.wissda;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class DocumentEmployee {
	
	private String id;
	private String name;
	
	public DocumentEmployee() {
		super();
	}
	
	public DocumentEmployee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DocumentEmployee [id=" + id + ", name=" + name + "]";
	}
	
	

}
