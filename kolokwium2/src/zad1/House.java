package zad1;

public class House extends Building {
    private int numberOfRooms;


    public House(int height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {return numberOfRooms;};

    @Override
    public String toString() {
        return "House{" +
                "height=" +super.getHeight() +
                ", color='" + super.getColor() + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
