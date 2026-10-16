import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 9: мәтін енгізіп, «Көрсету» батырмасымен экранға шығару
public class Task9 extends Applet implements ActionListener {
    TextField textField;
    Button showButton;
    String shownText = "";

    public void init() {
        textField = new TextField(20);
        showButton = new Button("Көрсету");
        add(new Label("Мәтін:"));
        add(textField);
        add(showButton);
        showButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        shownText = textField.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString(shownText, 50, 120);
    }
}
