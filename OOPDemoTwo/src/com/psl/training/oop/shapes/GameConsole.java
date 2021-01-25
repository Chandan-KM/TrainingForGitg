package com.psl.training.oop.shapes;

import com.psl.training.oop.canvas.Shape;
public class GameConsole {
	static public void drawShape(Shape s) {
		s.draw();
		
	}
	public static void main(String[] args) {
		GameConsole.drawShape(new Circle());
	}

}
