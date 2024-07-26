package Calc;
import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    //변수타입에 주의

    public CircleCalculator() {
        //객체 생성자
        listCircleArea=new ArrayList<>();
        //동시에 리스트 초기화
        //선언은 protected 제어자로 이미 선언되어있다.
    }
    public void calculateCircleArea(Double radius){
        listCircleArea.add(PI*radius*radius);
    }

    @Override
    public void inquiryResults(){
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        //기존 inquiryResults()메서드는 int k였지만 여기선 Double k
        for (Double k : listCircleArea) {
            System.out.println(k);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }

}
