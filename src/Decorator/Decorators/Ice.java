package Decorator.Decorators;

import Decorator.Base.IMilkTea;
import Decorator.Base.MilkTeaDecorator;

public class Ice extends MilkTeaDecorator {

    public Ice(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 20d + super.cost();
    }
}
