import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter user input");
        int a = sc.nextInt();
        int b = rand.nextInt(3);

         if (a == 0) {
            System.out.println("rock");
        } else if (a == 2) {
            System.out.println("scissor");
        } else if (a == 1) {
            System.out.println("paper");
        } else if (b == 0) {
            System.out.println("rock");
        } else if (b == 2) {
            System.out.println("scissor");
        } else if (b == 1) {
            System.out.println("paper");
        }
        System.out.println("winner is here");
        if (a == 0 && b == 2) {
            System.out.println("winner is you");
        } else if (a == 2 && b == 1) {
            System.out.println("winner is  you");
        } else if (a == 1 && b == 0) {
            System.out.println("winner is you");
        } else if (a == 2 && b == 0) {
            System.out.println("winner is com");
        } else if (a == 0 && b == 1) {
            System.out.println("winner is com");
        } else if (a == 1 && b == 2) {
            System.out.println("winner is com");
        } else if (a == 0 && b == 0) {
            System.out.println("match is tie");
        } else if (a == 2 && b == 2) {
            System.out.println("match is tie");
        } else if (a == 1 && b == 1) {
            System.out.println("match is tie");

        }
    }
    }
