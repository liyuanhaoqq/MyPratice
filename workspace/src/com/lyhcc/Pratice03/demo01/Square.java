package com.lyhcc.Pratice03.demo01;

public class Square implements Shape{

	private double edge;

	
	public Square() {
	}

	public Square(double edge) {
		this.edge = edge;
	}

	@Override
	public double area() {
		
		return edge*edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	
}
