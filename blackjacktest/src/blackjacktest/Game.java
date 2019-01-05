package blackjacktest;

import java.util.Scanner;


public class Game {
    Player player = new Player();
    Dealer dealer = new Dealer();
    private int dealerStop = 17;
    public static int blackJack = 21;
    
    boolean playing = true;
    
    public void play(){

       while(playing){
    	   boolean play = true;
    	   while (play) {
    		  
    	   Scanner scanner = new Scanner(System.in);
    	   String choice = "";
           dealer.dealHands(player);
           showHiddenHand();

           takePlayerTurn();
           Hand playersHand = player.getHand();

           if(playersHand.isBlackjack()){
        	   System.out.println("Blackjack! You win");
        	   System.out.println("");
           }
           else if(playersHand.bust() == false){
               takeDealerTurn();

               if(isDraw() == true){
                   Draw();
               }
               else if(hasWon() == true){
                   Win();
               } 
               else{
                   System.out.println("You've lost!");
                   System.out.println("");
                   try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
               }
           }
           else {
        	   System.out.println("You've lost!");
        	   System.out.println("");
        	   try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
           }
           while (true) {
        	   System.out.println("Would you like to play again? (y)es or (n)o");
           		choice = scanner.nextLine();
           		if(choice.equals("n")) {
           			System.out.println("Thank you for playing!");
           			playing = false;
           			}
           		else if(choice.equals("y")) {
           			player.getHand().clear();
           			dealer.getHand().clear();
           			break;
           			}
           		else
           			System.out.println("Invalid input. Try again");
           			continue;
           	}
    	   }	
       }
    }

    public void takePlayerTurn(){
        Scanner scanner = new Scanner(System.in);
        String move = "";

        int score = player.getHand().getScore();
        printPlayerHand();

        while (score < blackJack){
            System.out.println("Enter your next move (h)it (s)tand");

            move = scanner.nextLine();

            if (move.equals("h")) {
            	try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                player.getHand().add(dealer.dealCard());
            }
            else if (move.equals("s")) {
            	try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("_______________________");
                break;
            }
            
            score = player.getHand().getScore();
            printPlayerHand();
        }
    }

    public void takeDealerTurn(){
        printDealerHand();

        int value = dealer.getHand().getScore();

        if(value > dealerStop){
        	try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            printDealerHand();
        }

        while (value < dealerStop){
            dealer.getHand().add(dealer.dealCard());
            value = dealer.getHand().getScore();
            System.out.println("Dealer hit");
            try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            printDealerHand();
        }

    }

    public void showHiddenHand(){
        System.out.println("Dealer's hand : " + dealer.getHand().hiddenHand());
        System.out.println("------------------------");
    }

    public void printDealerHand(){
            System.out.println("Dealer's hand : " + dealer.getHand().toString());
            System.out.println("Dealer's score: " + dealer.getHand().getScore());
            System.out.println("------------------------");
    }

    public void printPlayerHand(){
        System.out.println(player.getName() + "'s hand : " + player.getHand().toString());
        System.out.println(player.getName() + "'s score: " + player.getHand().getScore());
        System.out.println("_______________________");
    }

    public boolean isDraw(){
        boolean draw = false;

        int playerScore = player.getHand().getScore();
        int dealerScore = dealer.getHand().getScore();

        if (playerScore <= blackJack && dealerScore <= blackJack && playerScore == dealerScore) {
            draw = true;
        }
        else if( playerScore > blackJack && dealerScore > blackJack){
            draw = true;
        }

        return draw;
    }

    public boolean hasWon(){
        boolean win = false;

        int playerScore = player.getHand().getScore();
        int dealerScore = dealer.getHand().getScore();

        if (playerScore <= blackJack && dealerScore <= blackJack && playerScore > dealerScore) {
            win = true;
        }
        else if( playerScore <= blackJack && dealerScore > blackJack){
            win = true;
        }

        return win;
    }


    public void Win(){
        System.out.println("You've won!");
    }

    public void Draw(){
        System.out.println("Its a draw! You loose.");
    }

    public static void main(String[] args){
       Game game = new Game();
       game.play();
    }
}
