package com.snakeladder.demo;

public class Snake_Ladder_UC3 {

	public final static int  NO_PLAY = 0;
	public final static int LADDER =1;
	public final static int SNAKE=2;
	
public static void main(String[] args) {
	
		int PLAYER_POSITION = 0;
		int diceNum =(int)((Math.random()* 10) % 6) + 1;
		
		int act = (int) ((Math.random()* 10) % 3);
		
		switch(act) {
		
		case NO_PLAY:
			break;
		case SNAKE:
			PLAYER_POSITION= PLAYER_POSITION - diceNum;
			break;
		case LADDER:
			PLAYER_POSITION=PLAYER_POSITION + diceNum;
		}
		
		System.out.println("Player Position " +PLAYER_POSITION);
		
	}

}
