import java.applet.Applet;
import java.awt.*;

// Тапсырма 4: шеңбер, тікбұрыш, үшбұрыш (әрқайсысы әр түсті)
public class Task4 extends Applet {
    public void paint(Graphics g) {
        // Шеңбер
        g.setColor(Color.RED);
        g.fillOval(30, 30, 100, 100);

        // Тікбұрыш
        g.setColor(Color.GREEN);
        g.fillRect(160, 30, 120, 80);

        // Үшбұрыш
        g.setColor(Color.BLUE);
        int[] x = {340, 290, 390};
        int[] y = {30, 130, 130};
        g.fillPolygon(x, y, 3);
    }
}
