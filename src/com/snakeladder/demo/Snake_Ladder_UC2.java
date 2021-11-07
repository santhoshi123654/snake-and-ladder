package com.snakeladder.demo;

public class Snake_Ladder_UC2 {

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Game ");
		int player=0;
		System.out.println("player initial position :" +player);
		
		int dice=(int)(Math.random()* 10)%6 +1;
		System.out.println("The Dice is Rolled " +dice);
		
	}	
	
	
}
  