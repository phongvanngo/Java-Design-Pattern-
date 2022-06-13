package Flyweight.FlyweightFactory;

import java.util.ArrayList;
import java.util.List;

import Flyweight.Flyweight.TreeType;

public class TreeTypeFlyweightFactory {
     final static List<TreeType> cache_tree_type = new ArrayList<TreeType>() {

     };

     public static TreeType getTreeType(String name, String texture, String color) {
          for (TreeType treeType : cache_tree_type) {
               if (isEqual(name, texture, color, treeType)) {
                    return treeType;
               }
          }
          System.out.println("------ Create New Tree Type add store cache -----");
          TreeType new_tree_type =  new TreeType(color, texture, name);
          cache_tree_type.add(new_tree_type);
          return new_tree_type;
     };

     private static boolean isEqual(String name, String texture, String color, TreeType treeType) {
          if (name != treeType.getName())
               return false;
          if (color != treeType.getColor())
               return false;
          if (texture != treeType.getTexture())
               return false;
          return true;
     };

}
