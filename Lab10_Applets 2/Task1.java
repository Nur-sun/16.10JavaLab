import java.applet.Applet;
import java.awt.*;

// Тапсырма 1: мәтін шығару, орны мен түсін өзгерту
public class Task1 extends Applet {
    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLUE);                       // түсі
        g.drawString("Зертханалық жұмыс №10", 30, 40);  // орны 1

        g.setColor(Color.RED);
        g.drawString("Зертханалық жұмыс №10", 80, 90);  // орны 2

        g.setColor(new Color(0, 150, 0));
        g.drawString("Зертханалық жұмыс №10", 130, 140); // орны 3
    }
}
