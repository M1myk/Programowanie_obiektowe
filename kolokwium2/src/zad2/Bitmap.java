package zad2;

import javax.swing.*;
import java.awt.*;

public class Bitmap extends ComputerGraphic {


    public Bitmap(int width, int height, String filaName) {
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
