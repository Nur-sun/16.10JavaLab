import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

// Тапсырма 8: тінтуір шерткенде әр түсті шеңбер салу
public class Task8 extends Applet implements MouseListener {
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Color> colors = new ArrayList<>();
    Random random = new Random();

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        points.add(e.getPoint());
        colors.add(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void paint(Graphics g) {
        int r = 20;
        for (int i = 0; i < points.size(); i++) {
            g.setColor(colors.get(i));
            Point p = points.get(i);
            g.fillOval(p.x - r, p.y - r, 2 * r, 2 * r);
        }
    }
}
