//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //First assign 4 variables 
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        
        
        System.out.println("Please enter the first number: ");
        number1 = myScanner.nextInt();
        
        System.out.println("Please enter the second number: ");
        number2 = myScanner.nextInt();

    
        System.out.println("Please enter the third number: ");
        number3 = myScanner.nextInt();

        System.out.println("Please enter the fourth number: ");
        number4 = myScanner.nextInt();

        int sum = number1+number2+number3+number4;
        double avg = sum/4.0;
        
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + avg);
        
    }
}


//Paste console output below:
/*
Please enter the first number: 
78
Please enter the second number: 
59
Please enter the third number: 
95
Please enter the fourth number: 
67
The sum of the four numbers is 299

The average of the four numbers is 74.75
*/
