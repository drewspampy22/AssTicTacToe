import javax.swing.*;
import java.awt.*;

public class TicTacToeRunner {
    public static void main(String[] args) {
        double dHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double dWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = ((int) (dHeight * .85));
        int width = ((int) (dWidth * .85));
        JFrame frame = new TicTacToeFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
