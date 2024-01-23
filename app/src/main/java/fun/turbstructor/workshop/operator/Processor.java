package fun.turbstructor.workshop.operator;

public class Processor {
    private static enum Operator{ ADD, SUBTRACT, MULTIPLY, DIVIDE }
    
    private Integer process(Integer[] operands, Integer operator)
    {
        if(operator == Operator.ADD.ordinal())              return Adder.add(operands[0], operands[1]);
        else if(operator == Operator.SUBTRACT.ordinal())    return Subtractor.subtract(operands[0], operands[1]);
        else if(operator == Operator.MULTIPLY.ordinal())    return Multiplier.multiply(operands[0], operands[1]);
        else if(operator == Operator.DIVIDE.ordinal())      return Divider.divide(operands[0], operands[1]);
        else return null;
    }

    public void getResult(Integer[] operands, Integer operator)
    {
        Character[] operatorLetters = new Character[]{'+', '-', '*', '/'};

        Integer result = process(operands, operator);
        System.out.printf("%d %c %d = %d\n", operands[0], operatorLetters[operator], operands[1], result);
    }
}
