package Flyweight.Context;

import Flyweight.Flyweight.TreeType;

public class Tree {
    TreeType treeType;
    int x, y;

    public Tree(TreeType treeType, int x, int y) {
        this.treeType = treeType;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        treeType.draw();
        System.out.println("coors: " + x + " : " + y);
    }

}
