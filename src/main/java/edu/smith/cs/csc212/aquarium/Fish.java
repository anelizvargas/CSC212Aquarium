package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	// every fish has a x which is an int
	int x;
	int y;
	Color color; 
	boolean isLittle;
	boolean isLeft;
	//every fish has a destination: (x,y)
	int destX;
	int destY;
	
	public Fish(Color c, int startX, int startY, boolean isLittle, boolean isLeft) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.isLeft = isLeft;
		
		this.destX = 450;
		this.destY = 450;
	}
	
	public void swim() {
		if (this.y < this.destY) {
			this.y += 1;
		}
	}
	
	public void draw(Graphics2D g) {
		this.swim();
		// fish face left and are small
		// smallFacingRight, facingLeft, and facingRight
		if (isLittle == true && isLeft == true) {
			DrawFish.smallFacingLeft(g,  this.color,  this.x,  this.y);
		}
		else if (isLittle == true && isLeft == false) {
			DrawFish.smallFacingRight(g,  this.color,  this.x,  this.y);
		}
		else if (isLittle == false && isLeft == true) {
			DrawFish.facingLeft(g,  this.color,  this.x,  this.y);
		}
		else if (isLittle == false && isLeft == false) {
			DrawFish.facingRight(g,  this.color,  this.x,  this.y);
		}
	}
}
