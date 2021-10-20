package ru.mirea.task8.image;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageOut extends JPanel {

    private static final long serialVersionUID = 1L;

    private BufferedImage image;

    public static final int WIDTH = 1500;
    public static final int HEIGHT = 900;

    public static void main(String avg[]) throws IOException {
        ImageOut abc = new ImageOut();

    }

    public ImageOut() {
        try {
            JFrame frame = new JFrame();
            image = ImageIO.read(new File(
                    "C:\\Users\\maniv\\OneDrive\\Desktop\\Для стола\\space.jpg"));

            frame.setSize(WIDTH, HEIGHT);
            frame.setVisible(true);
            frame.getContentPane().add(this);
            this.setBackground(Color.BLACK);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the
        // parameters
    }

}
