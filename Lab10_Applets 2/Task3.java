import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 3: «Қосу» және «Өшіру» батырмалары
public class Task3 extends Applet implements ActionListener {
    Button onButton, offButton;
    boolean visible = false;

    public void init() {
        onButton = new Button("Қосу");
        offButton = new Button("Өшіру");
        add(onButton);
        add(offButton);
        onButton.addActionListener(this);
        offButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == onButton) {
            visible = true;
        } else if (e.getSource() == offButton) {
            visible = false;
        }
        repaint();
    }

    public void paint(Graphics g) {
        if (visible) {
            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString("Мәтін пайда болды!", 50, 100);
        }
    }
}
