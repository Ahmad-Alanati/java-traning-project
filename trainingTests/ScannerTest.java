package trainingTests;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner ScannerObject = new Scanner(System.in);
        String name;
        boolean yesOrNo;
        int number1;
        double number2;

        System.out.print("enter a name: ");
        name = ScannerObject.nextLine();
        System.out.print("enter a your age: ");
        number1 = ScannerObject.nextInt();
        System.out.print("is it true or false: ");
        yesOrNo = ScannerObject.nextBoolean();
        System.out.print("enter a double number: ");
        number2 = ScannerObject.nextDouble();

        System.out.println("your name is: "+name);
        System.out.println("your age is: "+number1);
        System.out.println("is it right or wrong: "+yesOrNo);
        System.out.println("a double number: "+number2);
    }
}
