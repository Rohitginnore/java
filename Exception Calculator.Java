 class invalidInput extends Exception{
    @Override
    public String toString() {
        return "Your input is invalid";
    }
} class TooLarge extends Exception{
    @Override
    public String toString() {
        return "Your input is too large";
    }
 } class maxMultiplication extends Exception{
    @Override
    public String toString() {
        return "Your Multiplication input is high";
    }
}  class Divide extends Exception{
    public String toString(){
        return "you cannot divide by 0!";
    }
}    public class Calculator {
    public static void validInput(int a , int b) throws TooLarge{
        if(a>10000||b>100000){
            throw new TooLarge();
        }
    } public static void Addition() throws TooLarge{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        validInput(a,b);
        int c = a+b;
        System.out.println("Result is:- "+c);
    } public static void Subtraction() throws TooLarge{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        validInput(a,b);
        int c = a-b;
        System.out.println("Result is:- "+c);
    } public static void Multiplication() throws TooLarge , maxMultiplication{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        validInput(a,b);
        int c = a*b;
        if(c>7000){
            throw new maxMultiplication();
        }
        System.out.println("Result is:- "+c);
    } public static void Division() throws TooLarge, Divide{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        validInput(a,b);
        if(b==0){
            throw new Divide();
        }
        int c = a/b;
        System.out.println("Result is:- "+c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice = sc.nextInt();
        try{
            switch (choice){
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                default:
                    throw new invalidInput();
            }
        } catch (invalidInput|maxMultiplication|TooLarge|Divide e){
            System.out.println(e);
        }
    }
}