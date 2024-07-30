package calculator.operator;

public class MultiplyOperator<T1 extends Number,T2 extends Number> {
    public Number operate(T1 num1,T2 num2){
        if(num1 instanceof Integer && num2 instanceof Integer){
            return num1.intValue()*num2.intValue();
        }else if(num1 instanceof  Double || num2 instanceof Double){
            return num1.doubleValue()*num2.doubleValue();
        }else
            throw new UnsupportedOperationException("지원하지 않는 타입입니다");
    }

}
