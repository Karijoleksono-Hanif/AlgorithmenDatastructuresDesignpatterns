package GUI;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void createGui(){
        System.out.println("Hello GUI!");

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        JLabel label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hello GUI");
        frame.pack();
        frame.setVisible(true);
    }

}
