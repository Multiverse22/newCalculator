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
        ArithmeticCalculator arithcalc= new ArithmeticCalculator<Double>();
        int tmp=0;
        while (true) {

            System.out.println("1.사칙연산계산기 2.원의넓이 계산기 0.종료하기 ");
            tmp = sc.nextInt();

            if (tmp == 1)
                while (true) {

                    //사칙연산계산기
                    System.out.println("첫 번째 숫자를 입력하세요: ");
                    double num1 = sc.nextDouble();
                    System.out.println("두 번째 숫자를 입력하세요: ");
                    double num2 = sc.nextDouble();
                    System.out.println("원하시는 사칙연산 기호를 입력하세요");
                    char op = sc.next().charAt(0);






                    arithcalc.calculate(num1, num2, op);
                    sc.nextLine();
                    //버퍼비우기
                    flag = arithcalc.emptyList();
                    //Calculator클래스의 list가 비어있지않을때만 실행
                    if (!flag) {

                        arithcalc.printR();
                        //System.out.println("삭제하고싶다면 remove 입력,조회하고싶으면 inquiry입력");
                        //System.out.println("현 입력값보다 높은값만을 보고싶으시면 ishigh입력");
                        answer = sc.nextLine();
                        arithcalc.ifRIH(answer);
                    }
                    arithcalc.printExit();
                    //System.out.println("더 계산하시고 싶으시면
                    //아무거나 입력 (공백포함) (exit 입력시 종료 가능)");
                    answer = sc.nextLine();
                    if (answer.equals("exit")) {
                        System.out.println("계산 종료");
                        break;

                    }
                }
            else if (tmp == 2)
                while (true) {
                    System.out.println("반지름을 입력 : ");
                    double radius = sc.nextDouble();
                    sc.nextLine();

                    circle.calculateCircleArea(radius);
                    flag= circle.emptyList();
                    if (!flag) {

                        circle.printR();
                        //System.out.println("삭제하고싶다면 remove 입력,조회하고싶으면 inquiry입력");
                        //System.out.println("현 입력값보다 높은값만을 보고싶으시면 ishigh입력");
                        answer = sc.nextLine();
                        circle.ifRIH(answer);
                    }
                    circle.printExit();
                    //System.out.println("더 계산하시고 싶으시면
                    //아무거나 입력 (공백포함) (exit 입력시 종료 가능)");
                    answer = sc.nextLine();
                    if (answer.equals("exit")) {
                        System.out.println("계산 종료");
                        break;

                    }
                }
            else if (tmp == 0)
                break;
            else
                System.out.println("잘못된 입력입니다 1,2 둘 중 한가지를 선택해주세요");


        }
        System.out.println("프로그램 종료");
    }
}
