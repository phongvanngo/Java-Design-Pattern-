package Flyweight;

import java.util.ArrayList;
import java.util.List;

import Flyweight.Context.Tree;
import Flyweight.Flyweight.TreeType;
import Flyweight.FlyweightFactory.TreeTypeFlyweightFactory;

public class Forest {
    final List<Tree> trees = new ArrayList<Tree>();

    public void planTree(int x,int y, String name,String color,String texture) {
        TreeType treeType = TreeTypeFlyweightFactory.getTreeType(name, texture, color);
        Tree newTree = new Tree(treeType, x, y);
        trees.add(newTree);
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
    
}
