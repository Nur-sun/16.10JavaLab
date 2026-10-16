import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 6: екі санды қосу
public class Task6 extends Applet implements ActionListener {
    TextField field1, field2;
    Button addButton;
    String result = "";

    public void init() {
        field1 = new TextField(8);
        field2 = new TextField(8);
        addButton = new Button("Қосу");
        add(new Label("1-сан:"));
        add(field1);
        add(new Label("2-сан:"));
        add(field2);
        add(addButton);
        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(field1.getText().trim());
            double b = Double.parseDouble(field2.getText().trim());
            double sum = a + b;
            if (sum == (long) sum) {
                result = "Қосынды: " + (long) sum;
            } else {
                result = "Қосынды: " + sum;
            }
        } catch (NumberFormatException ex) {
            result = "Қате: сан енгізіңіз!";
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(result, 50, 120);
    }
}
