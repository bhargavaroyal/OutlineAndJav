package com.bhargavaroyal.javalib.designpattern.structural.facade;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}