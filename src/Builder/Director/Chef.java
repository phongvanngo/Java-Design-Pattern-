package Builder.Director;

import Builder.Builder.IBuilder;

public class Chef {
    public void makeBeefHamburger(IBuilder builder) {
        builder.reset();
        builder.addBread(12);
        builder.addBread(34);
        builder.addTomato(12);
        builder.addSauce(34);
    }

    public void makeChickenHamburger(IBuilder builder) {
        builder.reset();
        builder.addBread(12);
        builder.addBread(34);
        builder.addTomato(12);
        builder.addSauce(34);
    }
}
