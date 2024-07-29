package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{

    private int num1,num2;
    private char operator;
    private ArrayList<Double> list=new ArrayList<>();
    public void setInput(int num1,int num2,char operator){
        this.num1=num1;
        this.num2=num2;
        this.operator=operator;
    }
    //리스트 조회
    public ArrayList<Double> getList(){
        return list;
    }

    public void setList(double result){
        list.add(result);
    }

    //리스트 삭제
    public void removeResult(){
        list.remove(0);
    }


    //사칙 연산
    @Override
    public double calculate(){
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
    // 필요 없는 메서드이므로 덮어씌움

}
