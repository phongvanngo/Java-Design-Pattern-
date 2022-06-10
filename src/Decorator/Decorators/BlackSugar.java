package Decorator.Decorators;

import Decorator.Base.IMilkTea;
import Decorator.Base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator{

    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        return 1d + super.cost();
    }
    
}
