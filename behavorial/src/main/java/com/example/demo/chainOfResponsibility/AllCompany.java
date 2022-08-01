package com.example.demo.chainOfResponsibility;

public class AllCompany extends Handler {
	@Override
	public void handleRequest(Permission permission) {
		System.out.println("A empresa toda tem direito a todas as permissões, incluindo: " + permission.getPermissionDescription());
	}
}
