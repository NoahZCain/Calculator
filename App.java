import java.util.Scanner;

public class App{

private static final Scanner inputScanner = new Scanner(System.in);


private static String getString(String prompt)
{
    System.out.println(prompt);
    String userInput = inputScanner.nextLine();
    return userInput;
}

private static double getDouble(String prompt)
{
    System.out.println(prompt);
    Double userNum = inputScanner.nextDouble();
    return userNum;
    
}
public static void main(String[] args) {
   Calculator calc = new Calculator();
    
    double num1 = getDouble("Num 1");
    double num2 = getDouble("Num 2");
    
    System.out.println("the sum is: " +calc.add(num1,num2));
    System.out.println("the difference is: " + calc.subtract(num1, num2));
    System.out.println("the product is: " + calc.divide(num1, num2));
    System.out.println("the quotient is : " + calc.multiply(num1, num2));

    System.out.println("Would you like to continue?");
    String userChoice = inputScanner.nextLine();
    String yes = "Yes";
    String no = "No";
    if(userChoice == yes)
    {
        System.out.println("You pressed Yes");
    }
    else
    {
        if(userChoice == no)
        {
            System.out.println("Goodbye!");
        }
    }
    //String result = String.format("%f + %f = %f" , num1, num2 , num1 + num2);
    //System.out.println(result);
}



}