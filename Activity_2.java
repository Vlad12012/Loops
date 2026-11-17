import java.util.Scanner;

public class Activity_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i =  input.nextInt();
        int sum= 0;

        while (i>=1){
            sum += i;
            i--;
            
        }
        System.out.println("The sum of all numbers from 1 to the entered number is: " + sum);

        input.close();
    }
    
}
