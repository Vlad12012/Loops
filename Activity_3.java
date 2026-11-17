import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 100;
        int min = 10;
        char Choice;

        do{
            System.out.print("Enter a number: ");
            int i = input.nextInt();

            if (i>max){
                max = i;
            }

            if (i<min){
                min = i;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            Choice = input.next().charAt(0);

        }while (Choice == 'y' || Choice == 'Y');{
            System.out.println("The maximum number entered is: " + max);
            System.out.println("The minimum number entered is: " + min);
        }
        
    }
}
