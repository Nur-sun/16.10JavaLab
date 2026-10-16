import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Тапсырма 7: секундтарды санайтын таймер («Бастау» / «Тоқтату»)
public class Task7 extends Applet implements ActionListener, Runnable {
    Button startButton, stopButton;
    Thread thread;
    volatile boolean running = false;
    int seconds = 0;

    public void init() {
        startButton = new Button("Бастау");
        stopButton = new Button("Тоқтату");
        add(startButton);
        add(stopButton);
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton && !running) {
            running = true;
            thread = new Thread(this);
            thread.start();
        } else if (e.getSource() == stopButton) {
            running = false;
        }
    }

    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                return;
            }
            if (running) {
                seconds++;
                repaint();
            }
        }
    }

    public void stop() {      // апплет тоқтағанда таймерді де тоқтатамыз
        running = false;
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 28));
        g.drawString("Секунд: " + seconds, 50, 100);
    }
}
