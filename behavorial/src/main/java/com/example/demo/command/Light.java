package com.example.demo.command;

public class Light {

	private Boolean isOn = false;
	
	public void toggle() {
		if (!isOn) {
			isOn = true;
			System.out.println("Lus acesa");
		} else {
			isOn = false;
			System.out.println("Lus apagada");
		}
	}
	
	public void on() {
		isOn = true;
		System.out.println("Lus acesa");
	}
	
	public void off() {
		isOn = false;
		System.out.println("Lus apagada");
	}
}
