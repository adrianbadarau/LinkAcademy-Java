package elementele_clasei;

/**
 * Created by adrian on 01.01.2015.
 */
public class Calculator {
    char operator;
    double operand1;
    double operand2;
    public Calculator(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 =operand2;
        this.operator=operator;
    }
    public static double calculate(double operand1, double operand2, char operator){
        double rez = 0;
        switch (operator){
            case '+':
                rez =  operand1+operand2;
                break;
            case '-':
                rez = operand1-operand2;
                break;
            case '*':
                rez =  operand1*operand2;
                break;
            case '/':
                rez =  operand1/operand2;
                break;
        }
        return rez;
    }

}
