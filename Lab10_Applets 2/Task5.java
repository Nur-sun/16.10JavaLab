import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 5: Choice мәзірінен түс таңдағанда фон өзгереді
public class Task5 extends Applet implements ItemListener {
    Choice colorChoice;

    public void init() {
        colorChoice = new Choice();
        colorChoice.add("Ақ");
        colorChoice.add("Қызыл");
        colorChoice.add("Жасыл");
        colorChoice.add("Көк");
        colorChoice.add("Сары");
        add(new Label("Түсті таңдаңыз:"));
        add(colorChoice);
        colorChoice.addItemListener(this);
        setBackground(Color.WHITE);
    }

    public void itemStateChanged(ItemEvent e) {
        switch (colorChoice.getSelectedItem()) {
            case "Қызыл": setBackground(Color.RED);    break;
            case "Жасыл": setBackground(Color.GREEN);  break;
            case "Көк":   setBackground(Color.BLUE);   break;
            case "Сары":  setBackground(Color.YELLOW); break;
            default:      setBackground(Color.WHITE);
        }
        repaint();
    }
}
