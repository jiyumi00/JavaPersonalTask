package calculator;

public enum OperatorType {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    private char operator;
    private char getOperator(){
        return operator;
    };
    OperatorType(char operator) {
        this.operator=operator;
    }

    public static OperatorType fromChar(char operator){
        for(OperatorType operatorType:values()){
            if(operatorType.getOperator()==operator){
                return operatorType;
            }
        }
        throw new IllegalStateException();
    }





}
