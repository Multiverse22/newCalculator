import java.util.Scanner;
import Calc.*;
public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        boolean flag;
        String answer = "";
        CircleCalculator circle= new CircleCalculator();
        ArithmeticCalculator Arithcalc= new ArithmeticCalculator<Double>();
        int tmp;
        while (true) {
            System.out.println("1.사칙연산계산기 2.원의넓이 계산기 0.종료하기 ");
            tmp = sc.nextInt();

            if (tmp == 1)
                while (true) {

                    //사칙연산계산기
                    System.out.println("첫 번째 숫자를 입력하세요: ");
                    //String buffer=sc.nextLine();
                    System.out.println("두 번째 숫자를 입력하세요: ");
                    //System.out.println(num1+","+num2);
                    System.out.println("원하시는 사칙연산 기호를 입력하세요");
                    Double num1 = sc.nextDouble();
                    Double num2 = sc.nextDouble();
                    char op = sc.next().charAt(0);



                    Arithcalc.calculate(num1, num2, op);
                    answer = "";
                    answer = sc.nextLine();
                    //버퍼비우기
                    flag = Arithcalc.emptyList();
                    if (!flag) {
                        //Calculator클래스의 list가 비어있지않을때만 실행
                        System.out.println("삭제하고싶다면 remove 입력,조회하고싶으면 inquiry입력");
                        System.out.println("현 입력값보다 높은값만을 보고싶으시면 ishigh입력");

                        //이 부분 항상 주의할 것
                        answer = sc.nextLine();
                        if (answer.equals("remove"))
                            //calculator.list.remove(0); 변수를 직접수정하는것이 아닌 메서드로
                            Arithcalc.removeResult();

                        if (answer.equals("inquiry"))
                            Arithcalc.inquiryResults();
                            //이제 조회기능도 메서드로

                        if (answer.equals("ishigh"))
                        {
                            Arithcalc.Temp();
                        }
                    }

                    System.out.println("더 계산하시고 싶으시면 아무거나 입력 (공백포함) (exit 입력시 종료 가능)");
                    answer = sc.nextLine();
                    if (answer.equals("exit")) {
                        System.out.println("계산 종료");
                        break;

                    }
                }
            else if (tmp == 2)
                while (true) {
                    System.out.println("반지름을 입력 : ");
                    Double radius = sc.nextDouble();
                    sc.nextLine();
                    circle.calculateCircleArea(radius);
                    //System.out.println(calculator.getRadius());
                    //Getter메서드 구현
                    circle.inquiryResults();
                    System.out.println("더 계산하고싶으시면 exit를 제외한 아무거나 입력");
                    answer = sc.nextLine();
                    if (answer.equals("exit")) {
                        break;
                    }
                }
            else if (tmp == 0)
            {
                break;
            }
            else
            {
                System.out.println("잘못된 입력입니다 1,2 둘 중 한가지를 선택해주세요");
            }

        }
        System.out.println("프로그램 종료");
    }
}
