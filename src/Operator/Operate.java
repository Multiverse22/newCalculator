package Operator;

abstract class Operate {

    abstract int operate(int a, int b);


        //추상화 메서드를 선언 무조건 자식메서드가 int a,int b를 매개변수로 받는 operate메서드를
        //구현하도록 만듬 이렇게하면 연산부메서드를 전부 operate라는 이름명으로 통일할 수 있음
        //abstract로 다형성을 구현(같은 이름의 메서드지만 기능은 다르게)
    ;
}
