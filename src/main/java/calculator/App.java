package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Calculator 인스턴스 생성
        Calculator calculator=new Calculator();
        int result=0;
        //연산 결과 저장 배열 생성
        int n=10;
        int results[]=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        int index=0;


        while(true){
            //1. 숫자입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1=sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2=sc.nextInt();

            //2. 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator=sc.next().charAt(0);

            //3. 연산 후 결과값 출력 -> Calculator클래스의 calculate메소드
            try{
                result=calculator.calculate(num1,num2,operator);
                System.out.println("결과: "+result);
            }catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다");
                continue;
            }catch(IllegalStateException e){
                System.out.println("연산자 형식이 맞지 않습니다");
                continue;
            }

            //6. 10개 초과하는 경우, 가장 먼저 저장된 결과 삭제, 새로운 연산 결과 저장
            if(index>n-1){
                for(int i=1;i<index;i++) {
                    results[i -1] = results[i];
                }
                results[n-1]=result;
            }
            //5.연산 결과 10개 저장할 수 있는 배열 생성 및 결과 저장
            else{
                results[index]=result;
                index++;
            }

            //7. 연산 결과 고정되지 않고 무한히 저장
            calculator.setList(result);

            //remove입력 받으면 가장 먼저 저장된 결과 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove=sc.next();
            if(remove.equals("remove")){
                list.remove(0);
            }

            //8. 저장된 연산 결과 전부 출력
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry=sc.next();
            if(inquiry.equals("inquiry")){
                // 배열 출력
                System.out.print("배열 : ");
                for(int num:results){
                    System.out.print(num+" ");
                }
                System.out.println();
                //ArrayList 출력
                System.out.print("ArrayList: ");
                list.forEach(data-> System.out.print(data+" "));
                System.out.println();
            }


            //4. 반복문 사용 (exit 입력 시 종료)
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit=sc.next();
            if(exit.equals("exit")) break;
        }



    }
}
