package com.bhargavaroyal.javalib.designpattern.behavioral.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}