import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        System.out.println("Enter a number between 1 and 5:");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Number: ");
            int num = sc.nextInt();
            System.out.println("1. One");
            System.out.println("2. Two");
            System.out.println("3. Three");
            System.out.println("4. Four");
            System.out.println("5. Five");
            System.out.println("6. Exit");
            switch(num){
                case 1 -> System.out.println("You entered one.");
                    
                case 2 -> System.out.println("You entered two.");
            
                case 3 -> System.out.println("You entered three.");
    
                case 4 -> System.out.println("You entered four.");
                    
                case 5 -> System.out.println("You entered five.");

                default -> System.out.println("Invalid number. Please enter a number between 1 and 5.");
            }
        }
    }
}