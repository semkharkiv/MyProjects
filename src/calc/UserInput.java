package calc;

import java.util.Scanner;

public class UserInput {
    Scanner scanner=new Scanner(System.in);
    public double inputNumber(String message){
        System.out.println(message);
        double resultNumber= scanner.nextDouble();
    return resultNumber;
    }
public char inputOperation(String message){
    System.out.println(message);
    String resultString=scanner.nextLine();
    return resultString.charAt(0);
}
}
