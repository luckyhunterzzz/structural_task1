package com.company;

public class IntsCalculator implements Ints {
    Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.POW)
                .result();
    }
    @Override
    public int div(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result();
    }
}
