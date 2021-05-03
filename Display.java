import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Display extends JFrame {
    public static JFrame frame = new JFrame("Platformer");
    public static boolean isFullScreen = false;
    public static int w = 1000;
    public static int h = 800;

    static {
        System.setProperty("sun.java2d.opengl", "True");
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("sun.java2d.opengl", "True");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(w, h);
       // frame.setUndecorated(true);
        ImageIcon img = createIcon("Images/Icon.png");
        frame.setIconImage(img.getImage());
        frame.setVisible(true);

        Player.spawnpointsX.add(Player.spawnX);
        Player.spawnpointsX.add(Player.spawnX);
        Player.spawnpointsY.add(Player.spawnY);
        Player.spawnpointsY.add(Player.spawnY);

        Main.fillBarriers();
        Main m = new Main();
        m.startDrawing(frame);
    }

    protected static ImageIcon createIcon(String path) {
        URL imgURL = Display.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
