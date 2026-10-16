import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Запускает любой апплет в обычном окне (замена appletviewer)
// Использование: java RunApplet Task1
public class RunApplet {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Использование: java RunApplet Task1");
            return;
        }
        Applet applet = (Applet) Class.forName(args[0])
                .getDeclaredConstructor().newInstance();

        Frame frame = new Frame(args[0]);
        frame.setLayout(new BorderLayout());
        frame.add(applet, BorderLayout.CENTER);
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                applet.stop();
                applet.destroy();
                frame.dispose();
                System.exit(0);
            }
        });

        applet.init();
        frame.setVisible(true);
        applet.start();
    }
}
