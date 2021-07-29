package com.bhargavaroyal.javalib.designpattern.behavioral.visitor;

public class Keyboard implements ComputerPart {
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}