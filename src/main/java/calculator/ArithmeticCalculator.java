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
    @Override
    public ArrayList<Double> getList(){
        return list;
    }

    @Override
    public void setList(double result){
        list.add(result);
    }

    //리스트 삭제
    public void removeResult(){
        list.remove(0);
    }


    //사칙 연산
    @Override
    public double calculate(){ //연산 메서드의 책임 분리
        /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
        switch (operator){
            case '+' :
                AddOperator addOperator=new AddOperator();
                return addOperator.operate(num1,num2);
            case '-':
                SubtractOperator subtractOperator=new SubtractOperator();
                return subtractOperator.operate(num1,num2);
            case '*':
                MultiplyOperator multiplyOperator=new MultiplyOperator();
                return multiplyOperator.operate(num1,num2);
            case '/':
                //num2이 0일때 예외처리
                if(num2==0){
                    throw new ArithmeticException();
                }
                DivideOperator divideOperator=new DivideOperator();
                return divideOperator.operate(num1,num2);

            case '%':
                ModOperator modOperator=new ModOperator();
                return modOperator.operate(num1,num2);
            default:
                throw new IllegalStateException();
        }
    }
    // 필요 없는 메서드이므로 덮어씌움

}
