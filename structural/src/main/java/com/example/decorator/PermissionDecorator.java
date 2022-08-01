package com.example.decorator;

public class PermissionDecorator implements Permission {

	protected Permission customPermission;
	
	public PermissionDecorator(Permission permission) {
		this.customPermission = permission;
	}
	
	@Override
	public String givePermission() {
		return customPermission.givePermission(); 
	}

}
