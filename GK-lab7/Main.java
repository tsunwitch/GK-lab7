import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Painting and Texturing");
        Lab7 panel = new Lab7();
        window.setContentPane(panel);
        window.setJMenuBar( panel.getMenuBar() );
        window.pack();
        window.setResizable(false);
        window.setLocation(50,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}