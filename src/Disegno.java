import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Disegno extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello World", 100, 100);
        g.setColor(Color.RED);

    }

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Change Color Panel with Click");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setFocusable(true);
        panel.setBackground(Color.BLACK);
        frame.add(panel);

         panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Random Colore = new Random();
                int r = Colore.nextInt(256);
                int g = Colore.nextInt(256);
                int b = Colore.nextInt(256);


                panel.setBackground(new Color(r, g, b));




            }
         });
         frame.setVisible(true);


    }
}
