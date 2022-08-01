package com.example.decorator;

public class SimplePermission implements Permission {

	@Override
	public String givePermission() {
		return "Permissão Simples Permitida";
	}

}
