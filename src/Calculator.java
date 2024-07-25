import java.util.ArrayList;

public class Calculator {
    private int num1=0,num2=0;
    //직접 접근 금지
    private double radius=0;
    static final double PI=3.14;
    //static과 final을 둘다사용하면 객체없이도 어디서나 PI를 3.14 대신사용할 수 있으며
    //PI라는 값의 변경도 불가하므로 다른객체나 메서드에서도 편하게 사용 할 수 있다
    private char basicOperator;
    //ArrayList<Integer> list=new ArrayList<>(); 방식으로 초기화하지않는이유는 생성자로 초기화를하면
    //매개변수에 따라 다양하게 초기화가 가능하기때문
    private ArrayList<Integer> list;
    //private으로 선언하지않으면 누군가 list를 비워버리는 메서드로 list를 싹날릴수도있기때문에 getter/setter로만 접근 할 수 있게 private으로 선언해야한다.
    private ArrayList<Double> listCircleArea;
    //연산결과를 저장하는 컬렉션 타입 필드
    public Calculator(){
        this.list=new ArrayList<>();
        this.listCircleArea=new ArrayList<>();

    }
    public void calculateCircleArea(){
        double circleArea=PI*(radius*radius);
        listCircleArea.add(circleArea);

    }
    //원의넓이 필드관련 Getter/Setter
    public void setRadius(double radius){
        this.radius=radius;
    }
    public Double getRadius(){
        return this.radius;
    }
    public boolean emptyListCircleArea(){
        //Calculator클래스의 list가 비어있는지 확인할때마다 객체.list.isEmpty()메서드를 사용하는건 너무번거로워서 클래스내부에 메서드로 작성
        if(list.isEmpty())
        {
            return true;
        }
        else
            return false;
    }
    public boolean emptyList(){
        //Calculator클래스의 list가 비어있는지 확인할때마다 객체.list.isEmpty()메서드를 사용하는건 너무번거로워서 클래스내부에 메서드로 작성
        if(list.isEmpty())
        {
            return true;
        }
        else
            return false;
    }

    public void setA(int a){
        num1=a;
    }
    public void setB(int b){
        num2=b;
    }
    public void setOp(char op){
        basicOperator=op;
    }
    //Setter 클래스내부에서만 변경할 수 있게 num1,num2,basicOperator를 전부 private로 변경했지만 Setter 메서드를 사용하면
    //private로 변경하는 의미가 없다. 이부분은 나중에 변경할 예정
    public int getA(){
        return num1;
    }
    public int getB(){
        return num2;
    }
    public char getOp(){
        return basicOperator;
    }
    //Getter 하지만 이런 Getter/Setter는 사용하는것을 지양하는것이 좋다. 이유는 TIL에 작성

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public void opError(char op){
        System.out.println("잘못된 사칙연산기호 " + op + "를 입력하셨습니다 + - * / 기호중에서 다시 시도하십시오");
    }
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
    public void removeCircleArea(){
        listCircleArea.remove(0);
        System.out.println("삭제완료");

    }
    public void inquiryCircleArea() {
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        for (Double p : listCircleArea) {
            System.out.println(p);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }
    public void calculate(int a,int b,char op)
    {
        this.setA(a);
        this.setB(b);
        this.setOp(op);
        //당장에는 int반환값을 반환할 일이 없으니 void형식으로 변경
        //4칙연산을 수행하는 메서드를 불러와 계산하는 계산메서드Calculate()
        //List list=new List();
        int result = 0;
        boolean flag = true;
        switch (basicOperator) {
            case '/':
                result = div(num1,num2);
                break;
            case '*':
                result = mul(num1,num2);
                break;
            case '+':
                result = add(num1,num2);
                break;
            case '-':
                result = sub(num1,num2);
                break;
            default:
                System.out.println("잘못된 사칙연산기호 " + basicOperator + "를 입력하셨습니다 + - * / 기호중에서 다시 시도하십시오");
                flag=false;
                break;
        }
        if(flag)
            System.out.println("결과값은" + result + "입니다");
        //리스트에 저장함
        if(flag)
            //사칙연산 기호중 아무것도 해당되지않는 result는 0이되는데 이경우에만 리스트에 넣지말자
            //그냥 result가 0일때 리스트에 추가하지않으면 사칙연산후 결과값이 0일때도 리스트에 넣지않기때문에 이런식으로 구현
            list.add(result);
        //return result;
    }
}

