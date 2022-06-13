package Flyweight;

public class Client {
    static Forest forest = new Forest();
    public static void main() {
        // create Forest;
        forest.planTree(1, 2, "hoa", "red", "gai");
        forest.planTree(1, 3, "hoa", "red", "gai");
        forest.planTree(1, 4, "cay", "red", "gai");
        forest.planTree(1, 5, "cay", "red", "gai");
        forest.planTree(1, 6, "hoa", "red", "gai");
        forest.drawForest();
    }
    
    
}
