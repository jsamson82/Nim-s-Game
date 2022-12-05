package NimsGame;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        //TO DO: Create Player 1
        Player p1 = new Player(sc.next());//I did this

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        //TO DO: Create Player 2
        Player p2 = new Player(sc.next());//I did this
        String again = "Literally any string";
        Player currentPlayer;
        
        //Runs the game
        while (!again.equals("q")){
            //Generates the game
            //TO DO: Create "game"
            Game game = new Game(p1, p2);//I did this
            //TO DO: Set the a random player as the current player
            if (Math.random()>0.5){//i did this 
                currentPlayer = p1;
            }
            else{
                currentPlayer = p2;
            }//to this
            
            //This is the loop in which the game will be played
            while(!game.isComplete()){
               //TO DO
                
                game.setFirstPlayer(currentPlayer);//I did this
                game.takePiece();
                currentPlayer = game.getNextPlayer();//to this
                
            }
            
                System.out.println(currentPlayer.getName()+ " Won!!");
            System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
            System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            currentPlayer.resetScore(0);
            currentPlayer = game.getNextPlayer();
            currentPlayer.resetScore(0);
            again = sc.next();
            System.out.println("-----------------------");
        }
        System.out.println("Thank you for playing!");
    }
}
