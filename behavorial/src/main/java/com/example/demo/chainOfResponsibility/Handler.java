package com.example.demo.chainOfResponsibility;

public abstract class Handler {
	
	protected Handler sucessor;

	public void setSucessor(Handler sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void handleRequest(Permission permission);
}
