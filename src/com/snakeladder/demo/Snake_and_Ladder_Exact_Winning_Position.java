package com.snakeladder.demo;

public class Snake_and_Ladder_Exact_Winning_Position {
	
	public static int MAX_POSITION = 100;
 
	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int snake = 1;
		final int LADDER = 2;
		int player = 0;
		
	while (player < MAX_POSITION) {
		int dice = (int) ((Math.random() * 10) % 6) + 1;
		int act = (int) ((Math.random()* 10) % 3);
		
 switch (act) {
	
	case NO_PLAY :
			break;
	case snake :
			int position1 = player - dice;
			
			if(position1 < 0) {
				player = 0;	
			}
			else {
			   player = position1;
				break;
			}
	case LADDER :
			int position2 = player + dice;
			if(position2 <= MAX_POSITION) {
				player = position2;
			}
			break ;		
 }
		
		System.out.println("Player Position " +player);
	
	}
	}
}