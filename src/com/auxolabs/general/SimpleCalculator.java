package com.auxolabs.general;

public class SimpleCalculator
{
    double firstNumber;
    double secondNumber;
    public double getFirstNumber()
    {
     return firstNumber;
    }
    public double getSecondNumber()
    {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult()
    {
        double res = firstNumber + secondNumber;
        return res;
    }
    public double getSubtractionResult()
    {
        double res1 = firstNumber - secondNumber;
        return res1;
    }
    public double getMultiplicationResult()
    {
        double res2 = firstNumber*secondNumber;
        return res2;
    }
    public double getdivisionResult()
    {
        if(secondNumber!=0)
        {
            double res3 = firstNumber / secondNumber;
            return res3;
        }
        return 0;
    }
    public static void main(String[] args)
    {
     SimpleCalculator calculate = new SimpleCalculator();
     calculate.setFirstNumber(2.2);
     calculate.setSecondNumber(1.2);
     System.out.println("add:"+ calculate.getAdditionResult());
     System.out.println("sub:"+ calculate.getSubtractionResult());
     System.out.println("mul:"+ calculate.getMultiplicationResult());
     System.out.println("div:"+calculate.getdivisionResult());
    }
}
