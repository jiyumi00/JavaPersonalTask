package calculator;

import calculator.operator.*;

import java.util.ArrayList;

public class ArithmeticCalculator<T1 extends Number,T2 extends Number> extends Calculator{

    private T1 num1;
    private T2 num2;
    private OperatorType operator;
    private ArrayList<Number> list=new ArrayList<>();


    public void setInput(T1 num1,T2 num2,char operator){
        this.num1=num1;
        this.num2=num2;
        this.operator= OperatorType.fromChar(operator);
    }
    //리스트 조회
    @Override
    public ArrayList<Number> getList(){
        return list;
    }

    @Override
    public void setList(Number result){
        list.add(result);
    }

    //리스트 삭제
    public void removeResult(){
        list.remove(0);
    }


    //사칙 연산
    @Override
    public Number calculate(){ //연산 메서드의 책임 분리
        /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */

        switch (operator){
            case ADD :
                AddOperator<T1,T2> addOperator=new AddOperator<>();
                return addOperator.operate(num1,num2);
            case SUBTRACT:
                SubtractOperator<T1,T2> subtractOperator=new SubtractOperator<>();
                return subtractOperator.operate(num1,num2);
            case MULTIPLY:
                MultiplyOperator<T1,T2> multiplyOperator=new MultiplyOperator<>();
                return multiplyOperator.operate(num1,num2);
            case DIVIDE:
                //num2이 0일때 예외처리
                if(num2.doubleValue()==0){
                    throw new ArithmeticException();
                }
                DivideOperator<T1,T2> divideOperator=new DivideOperator<>();
                return divideOperator.operate(num1,num2);

            case MOD:
                ModOperator<T1,T2> modOperator=new ModOperator<>();
                return modOperator.operate(num1,num2);
            default:
                throw new IllegalStateException();
        }
    }
    // 필요 없는 메서드이므로 덮어씌움

}
