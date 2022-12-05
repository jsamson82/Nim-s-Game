package NimsGame;
import java.util.Scanner;
public class Game {
    private int pieces;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Scanner sc = new Scanner(System.in);

    //Sets up the game with a random amount of pieces between 10 and 50
    //Sets up the players so they can be accessed
    public Game(Player p1, Player p2){
        pieces = 0;
        pieces = (int)((Math.random()*40+10)); //To Do: Grab a random value between 10 and 50
        this.p1 = p1;
        this.p2 = p2;
    }

    //Allows a player to take a specific amount of pieces.
    //Adds the amount of pieces taken to the user's score.
    public int takePiece(){
        System.out.println("There are "+ pieces+" remaining!");
        System.out.println(currentPlayer.getName() + ", how many pieces would you like to take?");
        int take;
        take = sc.nextInt();//I did this
       //TO DO: Grab the user amount of pieces and repeat if it not allowed.
        while (!isLegal(take)){//I did this
            System.out.println("-----------------------");
            System.out.println("That number is either more than the allowed amount or less than 1!");
            System.out.println("There are "+ pieces+" remaining!");
            System.out.println(currentPlayer.getName() + ", how many pieces would you like to take?");
            take = sc.nextInt();
        }
            currentPlayer.adjustScore(take);
            pieces= pieces-take;//I did this
        //TO DO: Adjust the pieces
        System.out.println("-----------------------");
        return take;
    }

    
    //**TO DO**//
    public Player getNextPlayer(){
    //Changes which players turn it is and returns the current player.
       if(currentPlayer == p1){//I did this through
        currentPlayer = p2;
       }
       else{
        currentPlayer = p1;
       }//this
        return currentPlayer;
    }

    //Checks whether or not the user's requested move is allowed or not.
    public boolean isLegal(int x){
        if(((x<= pieces/2)&&(x>0))||(x==1)){//I did this
            return true;
        }
        else{
         return false;//Change appropriately   
        }
        //TO DO//I did
    }


    //DO NOT CHANGE
    public boolean isComplete(){

        if (pieces == 0){ return true;}
        return false;
    }

    //DO NOT CHANGE
    public void setFirstPlayer(Player p){
        currentPlayer = p;
    }
}
