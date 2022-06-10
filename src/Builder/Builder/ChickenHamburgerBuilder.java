package Builder.Builder;

import Builder.Product.ChickenHamburger;

public class ChickenHamburgerBuilder implements IBuilder {

    ChickenHamburger hamburger;

    @Override
    public void reset() {

        hamburger = new ChickenHamburger();

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

    public ChickenHamburger getResults() {
        return this.hamburger;
    }

}
