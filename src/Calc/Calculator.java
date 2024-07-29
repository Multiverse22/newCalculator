package Calc;
import java.util.ArrayList;

import Operator.*;

public abstract class Calculator {
    protected double radius=0;
    static final double PI=3.14;
    //static과 final을 둘다사용하면 객체없이도 어디서나 PI를 3.14 대신사용할 수 있으며
    //PI라는 값의 변경도 불가하므로 다른객체나 메서드에서도 편하게 사용 할 수 있다
    protected char basicOperator;
    //ArrayList<Integer> list=new ArrayList<>(); 방식으로 초기화하지않는이유는 생성자로 초기화를하면
    //매개변수에 따라 다양하게 초기화가 가능하기때문
    protected ArrayList<Integer> list;
    //private으로 선언하지않으면 누군가 list를 비워버리는 메서드로 list를 싹날릴수도있기때문에 getter/setter로만 접근 할 수 있게 private으로 선언해야한다.
    //무한으로 저장할 수 있게 동적 참조형 변수 ArrayList자료형 사용
    protected ArrayList<Double> listCircleArea;
    //연산결과를 저장하는 컬렉션 타입 필드
    //사칙연산 객체선언
    public Calculator(){
        list=new ArrayList<>();
        listCircleArea=new ArrayList<>();

        //초기화가 필요한 객체들 생성과 동시에 초기화

    }

    //원의넓이 필드관련 Getter/Setter
    public boolean emptyList(){
        //Calculator클래스의 list가 비어있는지 확인할때마다 객체.list.isEmpty()메서드를 사용하는건 너무번거로워서 클래스내부에 메서드로 작성
        if(list.isEmpty())
        {
            return true;
        }
        else
            return false;
    }

    public void setOp(char op){
        basicOperator=op;
    }
    //Setter 클래스내부에서만 변경할 수 있게 num1,num2,basicOperator를 전부 private로 변경했지만 Setter 메서드를 사용하면
    //private로 변경하는 의미가 없다. 이부분은 나중에 변경할 예정
    public char getOp(){
        return basicOperator;
    }
    //Getter 하지만 이런 Getter/Setter는 사용하는것을 지양하는것이 좋다. 이유는 TIL에 작성

    //값을 직접 수정하는 것이 아닌 Calculator 클래스 내부에 삭제 메서드를 구현
    //이제 Main메서드에서는 remove메서드를 호출해 가장 먼저들어온 값을 list에서 삭제할 수 있다.
    public void removeResult(){
        list.remove(0);
        System.out.println("삭제완료");
    }
    public void inquiryResults(){
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        for (int k : list) {
            System.out.println(k);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }

}

