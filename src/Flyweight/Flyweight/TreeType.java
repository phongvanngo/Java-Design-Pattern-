package Flyweight.Flyweight;

public class TreeType {
    String color;
    String texture;
    String name;

    public TreeType(String color, String texture, String name) {
        this.color = color;
        this.texture = texture;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    public String getName() {
        return name;
    }

    public void draw() {
        System.out.print("TreeType: " + this.name + " " + this.color + " " + this.texture + " ");
    }
}
