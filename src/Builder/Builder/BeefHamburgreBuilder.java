package Builder.Builder;

import Builder.Product.BeefHamburger;

public class BeefHamburgreBuilder implements IBuilder {

    BeefHamburger hamburger;

    @Override
    public void reset() {
        hamburger = new BeefHamburger();
    }

    @Override
    public void addBread(int n) {
        hamburger.setBread(n);
    }

    @Override
    public void addMeat(int n) {
        hamburger.setMeat(n);

    }

    @Override
    public void addSauce(int n) {
        hamburger.setSauce(n);

    }

    @Override
    public void addTomato(int n) {
        hamburger.setTomato(n);

    }

    public BeefHamburger getResults() {
        return this.hamburger;
    }

}
