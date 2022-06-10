package Builder;

import Builder.Builder.BeefHamburgreBuilder;
import Builder.Director.Chef;
import Builder.Product.BeefHamburger;

public class Client {
    public static void main() {
        BeefHamburgreBuilder hamburgerBuilder = new BeefHamburgreBuilder();
        Chef chef = new Chef();
        chef.makeBeefHamburger(hamburgerBuilder);
        BeefHamburger beefHamburger = hamburgerBuilder.getResults();

        System.out.println(
                beefHamburger.toString());
    }   
}
