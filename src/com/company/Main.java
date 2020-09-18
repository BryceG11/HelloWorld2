package com.company;

public class Main {

    abstract static class MathCalculation
    {
      public abstract void sum(int x, int y);
    }
    static class MyMathCalculation extends MathCalculation
    {
        @Override
        public void sum(int x, int y) {
            System.out.println(x+y);
        }
    }
    static class YourMathCalculation extends MathCalculation{

        @Override
        public void sum(int x, int y) {
            int sum = x + y;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
	    MyMathCalculation myMathCalculation = new MyMathCalculation();
	    myMathCalculation.sum(1,1);
	    YourMathCalculation yourMathCalculation = new YourMathCalculation();
	    yourMathCalculation.sum(2,2);
    }
}
