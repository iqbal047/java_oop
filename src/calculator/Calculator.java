package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputOperator = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);


        double num1;
        double num2;
        String operator;
        while (true){
            System.out.print("Input first number = ");
            num1 = inputNum1.nextDouble();

            System.out.print("Operator = ");
            operator = inputOperator.next();

            System.out.print("Input second number = ");
            num2 = inputNum2.nextDouble();

            if(operator.equals("+")){
                System.out.println("The sum is = " + (num1 + num2));
            } else if (operator.equals("-")){
                System.out.println("The subtract is = " + (num1 - num2));
            } else if (operator.equals("*")){
                System.out.println("The multiply is = " + (num1 * num2));
            }else if (operator.equals("/")){
                System.out.println("The division value is = " + (num1 / num2));
            }else{
                System.out.println("Please input valid operator");
            }
        }
    }
    }

