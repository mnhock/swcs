package swcs.gof.creational.factorymethod2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowsButton implements Button {

    @Override
    public void render() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);

        JButton button = new JButton("Say hello world!");
        button.addActionListener(e -> onClick());
        panel.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    @Override
    public void onClick() {
        System.out.println("Hello World!");
    }
}