package zad2;

public abstract class ComputerGraphic {
    private int width;
    private int height;
    private String filaName;

    public abstract void loadFile();
    public abstract void saveFile();

    public ComputerGraphic(int width, int height, String filaName)
    {
        this.width = width;
        this.height = height;
        this.filaName = filaName;
    }

    public String getFilaName() {
        return filaName;
    }
}
