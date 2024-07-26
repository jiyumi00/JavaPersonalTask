package calculator;

import java.util.ArrayList;

//연산 수행 클래스
public class Calculator {
    private ArrayList<Integer> list=new ArrayList<>();
    private ArrayList<Double> circleAreaList=new ArrayList<>();
    //생성자 구현
    public Calculator(){
        list.clear(); // 필드 초기화
        circleAreaList.clear();
    }
    public ArrayList<Integer> getList(){
        return list;
    }
    public void setList(int result){
        list.add(result);
    }

    //리스트 삭제
    public void removeResult(){
        list.remove(0);
    }
    //리스트 조회
    public void inquiryResults(){
        list.forEach(data-> System.out.print(data+" "));
    }

    //사칙 연산
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

    //원의 넓이 계산
    public double calculateCircleArea(int radius){
        final double PI=3.14; // final, 정적변수 더이상 수정이 불가능하기 때문에 사용
        return PI*radius*radius;
    }
    public ArrayList<Double> getCircleAreaList(){
        return circleAreaList;
    }
    public void setCircleAreaList(double circleArea){
        circleAreaList.add(circleArea);
    }

}
