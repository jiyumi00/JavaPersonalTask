package calculator;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //숫자입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1=sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2=sc.nextInt();

        //사칙연산 기호 입력
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator=sc.next().charAt(0);



    }
}
