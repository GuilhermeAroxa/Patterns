package com.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class PersonClient {
	
	public List<Person> getPersons(){
		
		List<Person> persons = new ArrayList<>();
		Person brazilian = new Brazilian("837164561", "Guilherme", "Arôxa", "Brasil");
		persons.add(brazilian);
		
		Portuguese portuguese = new Portuguese("1117164561", "Tomás", "Mendes", "Portugal");
		persons.add(new PortugueseAdapter(portuguese));
		
		return persons;
	}
}
