
import java.util.Random;
import java.util.Scanner;

     class guess_the_number{
       private  int User_input;
        private int Random_input;
          private int num_of_guess;

         public guess_the_number(){
             Random Rand = new Random();
             Random_input = Rand.nextInt(0,100);
             num_of_guess = 0;
         } public void setUser_input(){
             Scanner scanner = new Scanner(System.in);
             User_input = scanner.nextInt();
             num_of_guess++;
         } public boolean get_Is_correct_number() {
         if(User_input==Random_input){
             System.out.println("guess is correct"+num_of_guess);
             return true;
         } else if(User_input<Random_input){
                 System.out.println("your guess is too low something is high");
             } else {
             System.out.println("your guess is too hing something is low");
         }
         return false;
         }  public int getNum_of_guess(){
             return num_of_guess;
         }public void setNum_of_guess(int n){
             num_of_guess = n;
         }

     } public class Guess_the_numbers {
    public static void main(String[] args) {
        guess_the_number game = new guess_the_number();
          boolean guess_is_correct = false;
          while(!guess_is_correct){
              game.setUser_input();
              guess_is_correct = game.get_Is_correct_number();
          }
    }
}

