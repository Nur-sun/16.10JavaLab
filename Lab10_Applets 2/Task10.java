import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 10: аты-жөні мен жасын енгізу формасы
public class Task10 extends Applet implements ActionListener {
    TextField nameField, ageField;
    Button submitButton;
    String line1 = "", line2 = "";

    public void init() {
        nameField = new TextField(20);
        ageField = new TextField(5);
        submitButton = new Button("Жіберу");
        add(new Label("Аты-жөні:"));
        add(nameField);
        add(new Label("Жасы:"));
        add(ageField);
        add(submitButton);
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String age = ageField.getText().trim();
        if (name.isEmpty() || age.isEmpty()) {
            line1 = "Барлық өрісті толтырыңыз!";
            line2 = "";
        } else {
            line1 = "Аты-жөні: " + name;
            line2 = "Жасы: " + age;
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString(line1, 50, 130);
        g.drawString(line2, 50, 155);
    }
}
