package Operator;

public class OperatorType<T> {
    public enum Op {
        ADD {
            @Override
            public <T extends Number> double apply(T a, T b) {
                return a.doubleValue() + b.doubleValue();
            }
            /*
            @Override
            public int apply(int a,int b){
            return a + b;
            }
            기존 제네릭을 활용하기 전 enum코드
             */


        },
        SUB{
            @Override
            public <T extends Number>double apply(T a, T b) {
                return a.doubleValue() - b.doubleValue();
            }

        },
        MUL{
            @Override
            public <T extends Number>double apply(T a, T b) {
                return a.doubleValue() * b.doubleValue();
            }

        },
        DIV{
            @Override
            public <T extends Number>double apply(T a, T b) {
                if(b.doubleValue() == 0)
                    throw new ArithmeticException("분모에 0은 안돼!!!!! 사형!!!!!!!!!!!!");
                return a.doubleValue() / b.doubleValue();

            }

        },
        Mod{
            @Override
            public <T extends Number>double apply(T a, T b) {
                if(b.doubleValue() == 0)
                    throw new ArithmeticException("분모에 0은 안돼!!!!! 사형!!!!!!!!!!!!");
                return a.doubleValue() % b.doubleValue();
            }

        };
        public abstract <T extends Number> double apply(T a, T b);
    }
}
