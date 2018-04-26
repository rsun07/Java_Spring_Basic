package pers.xiaoming.java_spring.jdk_dynamic_proxy.advanced;

import pers.xiaoming.java_spring.Calculator;

public class ChargableCalculatorSeparatedInterfacesImpl implements Calculator, Chargable {
    private Calculator calculator;
    private Chargable charger;

    public ChargableCalculatorSeparatedInterfacesImpl(Calculator calculator, Chargable charger) {
        this.calculator = calculator;
        this.charger = charger;
    }

    @Override
    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    @Override
    public int sub(int a, int b) {
        return calculator.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        return calculator.mul(a, b);
    }

    @Override
    public int div(int a, int b) {
        return calculator.div(a, b);
    }

    @Override
    public void charge() {
        charger.charge();
    }
}
