import java.util.*;

public class number_guessing{
    Scanner sc = new Scanner(System.in);

    public  void start_game(){
        int chance = 5;
        //int random = (int)(Math.random() * (max - min + 1)) + min;
        int number_to_guess = (int) (Math.random() * (1005)) + 1;
        System.out.println("Welcome to the Number Guessing Game!");

        
        

        System.out.println("you have only five tries");
        while(chance>0){
        System.out.println("enter a number between 1 to 100");
        
        int number = sc.nextInt();
        if(number>100 || number<1){
            System.out.println("Invalid input! please enter a number between 1 to 100");
            break;
        }
        else if(number==number_to_guess){
            System.out.println("congratulations! you guessed the correct number");
            break;
        }
        else if(number>number_to_guess){
            System.out.println("your guess is too high");
        }
        else{
            System.out.println("your guess is too low");
        }
        chance--;
        
        System.out.println("you have "+chance+" tries left");
        
       }
         if(chance==0){
          System.out.println("sorry! you have used all your tries. the correct number was "+number_to_guess);
         }
        
        


    }
    public static void main(String[] args) {
        number_guessing ng = new number_guessing();
        System.out.println("Starting the Number Guessing Game...");
        ng.start_game();
        while(true){
            System.out.println("Game Over. Thanks for playing! do you want to play again? (yes/no)");
            String play_again = ng.sc.nextLine();
            if(play_again == "yes"){
                ng.start_game();
            }
            else if(play_again == "no"){
                System.out.println("Thank you for playing!");
                break;
            }
            else{
                System.out.println("Invalid input! please enter yes or no");
            

        }
        
        
    }
    
    
}