import java.util.Scanner;
import java.util.ArrayList;
public class Recursion extends Concatenation {
    public void test(){
        { 
            String[][] Characters = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},{"1","2","3","4","5","6","7","8","9","0"},{"~","!","@","#","$","%","^","&","*","-","?"}};
        
            
            
            System.out.println();
            System.out.println("Welcome to password generator! You will choose how long you want your passcode and what characters you want in it and let the generator do the rest.");
            System.out.println();

            System.out.println("How many characters long do you want the password?");
            Scanner sc = new Scanner(System.in);
            String charNum = sc.nextLine();
            int c=Integer.parseInt(charNum);
          
            System.out.println();
            System.out.println("How many upper case letters do you want in the password?");
            String upperCase = sc.nextLine();
            int u=Integer.parseInt(upperCase);  
              while(u>c){
                System.out.println();
                System.out.println("You inputed more characters than your desired length. How many upper case letters do you want in the password?");
                upperCase = sc.nextLine();
                u=Integer.parseInt(upperCase);
              }
        
              for(int i = 0; i<u; i++){
                toImpliment.add(Characters[1][(int) (Math.random()*(26))]);
              }
            
            //System.out.println(toImpliment);
        
            System.out.println();
            System.out.println("How many lower case letters do you want in the password?");
            String lowerCase = sc.nextLine();
            int lu=Integer.parseInt(lowerCase);
            int l=Integer.parseInt(lowerCase)+ u;  
              while(l>c){
                System.out.println();
                System.out.println("You inputed more total characters than your desired length. How many lower case letters do you want in the password?");
                lowerCase = sc.nextLine();
                l=Integer.parseInt(lowerCase)+ u;
              }
              for(int i = 0; i<lu; i++){
                toImpliment.add(Characters[0][(int) (Math.random()*(26))]);
              }
            //System.out.println(toImpliment);
            System.out.println();
            System.out.println("How many numbers do you want in the password?");
            String nums = sc.nextLine();
            int nu =Integer.parseInt(nums);
            int n= Integer.parseInt(nums) + l;
              while(n>c){
                System.out.println();
                System.out.println("You inputed more total characters than your desired length. How many numbers do you want in the password?");
                nums = sc.nextLine();
                n=Integer.parseInt(nums)+ l;
              }
              for(int i = 0; i<nu; i++){
                toImpliment.add(Characters[2][(int) (Math.random()*(10))]);
              }
            //System.out.println(toImpliment);
            System.out.println();
            System.out.println("How many miscellaneous characters do you want in the password?");
            String miscChar = sc.nextLine();
            int mu = Integer.parseInt(miscChar);
            int m= Integer.parseInt(miscChar) + n;
              while(m>c){
                System.out.println();
                System.out.println("You inputed more total characters than your desired length. How many miscellaneous characters do you want in the password?");
                miscChar = sc.nextLine();
              
                m=Integer.parseInt(miscChar)+ n;
              }
              for(int i = 0; i<mu; i++){
                toImpliment.add(Characters[3][(int) (Math.random()*(11))]);
              }
            //System.out.println(toImpliment);
            System.out.println();
            System.out.println("The remaining characters(if any) will be filled by random characters");
            //System.out.println(m);
              for(int i = 0; i<(c-m); i++){
                int nRow= (int)(Math.random()*(3));
                int nCol= (int) (Math.random()*Characters[nRow].length);
                toImpliment.add(Characters[nRow][nCol]);
              }
            //System.out.println(toImpliment);
        
            
            String password="";
           
              while(password.length()<(c)){//length of string password
                int index = (int) (Math.random() * toImpliment.size());
                password += toImpliment.get(index);
                toImpliment.remove(index);
              }

        
        
            Recursion rs = new Recursion();  
            String resultantSting1 = rs.reverseString(password);
            System.out.println();  
            System.out.println("The password is " + resultantSting1);
            System.out.println();
            System.out.println("Your password has been created using recursion.");
            System.out.println("_________________________________________________________________________________");
          } 
    }
    
   
//recursive function to reverse a string      
public String reverseString(String str)  
{  
//checks if the string is empty   
if(str.isEmpty())  
{  
//if the above condition is true returns the same string      
return str;  
}   
else   
{  
return reverseString(str.substring(1))+str.charAt(0);  
}   

}


}
