package _19Interfaces;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() ); //_19Interfaces.AdvancedArithmetic
//        System.out.println("I implemented: " + myCalculator.getClass().getName()); //_19Interfaces.Calculator
        System.out.println(sum);
    }
}
