package zad2;

public class TestComputerGraphics {
    public static void main(String[] args)
    {
        Bitmap bitmap = new Bitmap(20,50, "Bitmam.exe");
        bitmap.loadFile();
        bitmap.saveFile();

        Vector vector = new Vector(30,40, "Vector.kz");
        vector.loadFile();
        vector.saveFile();
    }
}
