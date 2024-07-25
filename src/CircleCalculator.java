import java.util.Scanner;
import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    private double radius=0;
    //변수타입에 주의
    public CircleCalculator() {
        listCircleArea=new ArrayList<>();
    }

    @Override
    public void inquiryResults(){
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        for (Double k : listCircleArea) {
            System.out.println(k);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }

}
