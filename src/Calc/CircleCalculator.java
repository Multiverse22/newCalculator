package Calc;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CircleCalculator extends Calculator {
    //변수타입에 주의

    public CircleCalculator() {
        //객체 생성자
        listCircleArea=new ArrayList<>();
        //동시에 리스트 초기화
        //선언은 protected 제어자로 이미 선언되어있다.
    }
    @Override
    protected ArrayList<Double> getList(){
        return listCircleArea;
    }
    @Override
    public void Temp(){
        ArrayList<Double> list=getList();
        Stream<Double> stream=list.stream();
        double numberA=getRadius();

        System.out.println("------------현재 입력받은 값(Radius:"+numberA+") 보다 높은값들은:-----------");
        stream.filter( e-> e>numberA).forEach(System.out::println);
        System.out.println("------------현재 입력받은 값(Radius:"+numberA+") 보다 높은값들은:-----------");
    }
}
