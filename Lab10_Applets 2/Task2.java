import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 2: батырманы басқанда «Сәлем, Java!» шығады
public class Task2 extends Applet implements ActionListener {
    Button button;
    String message = "";

    public void init() {
        button = new Button("Басыңыз");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Сәлем, Java!";
        repaint();
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString(message, 50, 100);
    }
}
