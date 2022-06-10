package Decorator;

import Decorator.Base.MilkTea;
import Decorator.Decorators.BlackSugar;
import Decorator.Decorators.Ice;

public class Client {
    public static void main() {
        var myMilkTea = new Ice( new BlackSugar( new MilkTea())); 
        myMilkTea.cost();
    }
}
