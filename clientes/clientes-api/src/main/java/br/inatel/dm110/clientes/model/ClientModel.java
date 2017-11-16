package br.inatel.dm110.clientes.model;

import java.io.Serializable;

public class ClientModel implements Serializable {

	private static final long serialVersionUID = 8926260435868988766L;
	
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
