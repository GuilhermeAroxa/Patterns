package com.example.adapter;

public class Portuguese {
	private String nif;
	private String firstName;
	private String apelido;
	private String country;
	
	public Portuguese(String nif, String firstName, String apelido, String country) {
		this.nif = nif;
		this.firstName = firstName;
		this.apelido = apelido;
		this.country = country;
	}

	public String getNif() {
		return this.nif;
	}


	public String getFirstName() {
		return this.firstName;
	}

	public String getApelido() {
		return this.apelido;
	}

	public String getCountry() {
		return this.country;
	}
}
