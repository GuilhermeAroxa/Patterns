package com.example.demo.chainOfResponsibility;

public class Group extends Handler{

	@Override
	public void handleRequest(Permission permission) {
		if ( permission.getPermissionType().equals(PermissionType.GROUP) ) {
			System.out.println("O grupo tem permissão para: " + permission.getPermissionDescription());
		} else {
			sucessor.handleRequest(permission);
		}
	}

}
