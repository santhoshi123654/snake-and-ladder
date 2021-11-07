package com.snakeladder.demo;

public class Snake_and_Ladder_Winning_Position {

		public static int Max_Position = 100;
		
	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int snake = 1;
		final int LADDER = 2;
		int player = 0;
		
	while (player < Max_Position) {
			int dice = (int) ((Math.random() *10) % 6) + 1;
			int act = (int) ((Math.random()* 10) % 3);
			
	 switch (act) {
		
		case NO_PLAY :
				break;
		case snake :
				int position = player - dice;
				
				if(position < 0) {
					player = 0;	
				}
				else {
				   player = position;
					break;
				}
		case LADDER :
				player = player + dice;
				break ;		
	 }
	 	System.out.println("Player Positin " + player);
	}
		
	}
}
