package zad2;

public class Vector extends ComputerGraphic{
    public Vector(int width, int height, String filaName) {
        super(width, height, filaName);
    }

    @Override
    public void loadFile() {
        System.out.println("Loading "+ super.getFilaName());
    }

    @Override
    public void saveFile() {
        System.out.println("Saving "+ super.getFilaName());
    }
}
