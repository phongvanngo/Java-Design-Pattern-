package Builder.Builder;

public interface IBuilder {
    abstract void reset();
    abstract void addSauce(int n);
    abstract void addMeat(int n);
    abstract void addTomato(int n);
    abstract void addBread(int n);
}
