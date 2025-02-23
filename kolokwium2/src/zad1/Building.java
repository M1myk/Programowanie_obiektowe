package zad1;

public class Building {
    private int height;
    private String color;

    public Building(int height, String color)
    {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Building{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
