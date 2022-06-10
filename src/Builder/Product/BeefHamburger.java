package Builder.Product;

public class BeefHamburger {
    int meat;
    int tomato;
    int sauce;
    int bread;

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setSauce(int sauce) {
        this.sauce = sauce;
    }

    public void setBread(int bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d %d", this.bread, this.meat, this.sauce, this.tomato);
    }

}
