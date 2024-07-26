package Operator;

public class OperatorType {
    public enum Op {
        ADD('+'),
        SUB('-'),
        MUL('*'),
        DIV('/'),
        Mod('%');

        private final char operator;

        Op(char op) {
            this.operator = op;
        }
        public char getOp(){
            return operator;
        }

    }
}
