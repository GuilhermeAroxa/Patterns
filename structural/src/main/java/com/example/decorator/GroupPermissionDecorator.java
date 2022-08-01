package com.example.decorator;

public class GroupPermissionDecorator extends PermissionDecorator {
	
	public GroupPermissionDecorator(Permission permission) {
		super(permission);
	}

	public String givePermission() {
		return customPermission.givePermission()+"\nPermissão em Grupo Liberada"; 
	}
}
