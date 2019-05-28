package com.auxolabs.general;

public class ComplexNumber
{
    double real;
    double imaginary;
    ComplexNumber(double real, double imaginary)
    {
        this.real= real;
        this.imaginary=imaginary;
    }
    public double getReal()
    {
        return real;
    }
    public double getImaginary()
    {
        return imaginary;
    }
    public void add(double real, double imaginary)
    {
        this.imaginary = imaginary + imaginary;
        this.real= real + real;
    }
    public void add(ComplexNumber complexNumber)
    {
        this.real = real + complexNumber.real;
    }
    public void subtract(double real, double imaginary)
    {
        this.imaginary = imaginary - imaginary;
        this.real= real - real;
    }
    public void subtract(ComplexNumber complexNumber)
    {
        this.imaginary = imaginary - complexNumber.imaginary;
    }
    public static void main(String[] args)
    {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real=" + one.getReal());
        System.out.println("one.imaginary=" + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real=" + one.getReal());
        System.out.println("one.imaginary=" + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real=" + number.getReal());
        System.out.println("number.imaginary=" + number.getImaginary());
    }
}
