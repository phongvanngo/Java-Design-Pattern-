package Decorator.Base;

public abstract class MilkTeaDecorator implements IMilkTea {
    private IMilkTea milkTea;

    public MilkTeaDecorator(IMilkTea inner) {
        milkTea = inner;
    }

    @Override
    public double cost() {
        return milkTea.cost();
    };
}
