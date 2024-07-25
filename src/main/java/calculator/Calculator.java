package calculator;

import java.util.ArrayList;

//연산 수행 클래스
public class Calculator {
    private ArrayList<Integer> list=new ArrayList<>();

    public ArrayList<Integer> getList(){
        return list;
    }


    public int calculate(int num1,int num2,char operator){
        /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
        switch (operator){
            case '+' :
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                //num2이 0일때 예외처리
                if(num2==0){
                    throw new ArithmeticException();
                }
                return num1/num2;
            default:
                throw new IllegalStateException();
        }
    }

}
