package com.psl.training.oop.canvas;

public abstract class Shape {
	public abstract void draw();
	public static void main(String[] args) {
		
		
		//Shape shape1=new Shape();
		Shape shape2=new Triangle();
		Shape shape3=new Circle();
		Shape shape4=new Square();
		}

}
class Triangle extends Shape{
	public void draw() {
		System.out.println("This is Triangle");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("This is Circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("This is Square");
	}
}
