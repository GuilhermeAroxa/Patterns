package com.example.bridge.bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		this.color.applyColor();
	}

}
