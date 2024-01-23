package fun.turbstructor.workshop.interactor;

import java.util.Scanner;

public class Inserter {
    private static Scanner scanner = new Scanner(System.in);
    public Integer getOperand()
    {
        try
        {
            System.out.print("Enter integer operand: ");

            return Inserter.scanner.nextInt();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public Integer getOperator()
    {
        try
        {
            System.out.println("[Add: 0, Subtract: 1, Multiply: 2, Divide: 3]");
            System.out.print("Enter number for operator: ");

            return Inserter.scanner.nextInt();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
