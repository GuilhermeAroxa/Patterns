package com.example.decorator;

public class IndividualPermissionDecorator extends PermissionDecorator {
	
	public IndividualPermissionDecorator(Permission permission) {
		super(permission);
	}

	public String givePermission() {
		return customPermission.givePermission()+"\nPermissão Individual Liberada"; 
	}

}
