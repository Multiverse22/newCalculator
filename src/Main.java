import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        boolean flag;
        String answer = "";
        ArithmeticCalculator calc= new ArithmeticCalculator();
        CircleCalculator circle= new CircleCalculator();
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
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    char op = sc.next().charAt(0);


                    calc.calculate(num1, num2, op);

                        /*

                        calculator.setA(sc.nextInt());
                        //Calculator클래스의 num1의 setter
                        calculator.setB(sc.nextInt());
                        //Calculator클래스의 num2의 setter
                        calculator.setOp(sc.next().charAt(0));
                        //Calculator클래스의 basicOperator의 setter
                        calculator.calculate();
                        //Calculator클래스의 사칙연산을 실행하는 메서드

                         */


                    //list.add(calculator.Calculate());
                    answer = "";
                    answer = sc.nextLine();
                    flag = calc.emptyList();
                    if (!flag) {
                        //Calculator클래스의 list가 비어있지않을때만 실행
                        System.out.println("삭제하고싶다면 remove 입력,조회하고싶으면 inquiry입력");

                        //이 부분 항상 주의할 것
                        answer = sc.nextLine();
                        if (answer.equals("remove")) {
                            //calculator.list.remove(0); 변수를 직접수정하는것이 아닌 메서드로
                            calc.removeResult();
                        }
                        if (answer.equals("inquiry")) {
                            calc.inquiryResults();
                            //이제 조회기능도 메서드로
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
