package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation {
    public static void main(String[] args) {
        String path = "src/ru/mirea/task8/animation/gif/frame-";
        for (int fr = 0; fr < 30; fr++){
            framlist.add(new ImageIcon(path + fr + ".gif").getImage());
        }
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 30; i++) {
                image1 = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(35);
                }
                catch (InterruptedException a)
                {
                    a.printStackTrace();
                }
            }
        }
    }
}
