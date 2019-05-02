import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class LabelFrame extends JFrame implements MouseMotionListener, KeyListener {

    JLabel[][] labels;

    public LabelFrame() throws HeadlessException {

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 10));
        setTitle("Szálkezelés");

        labels = new JLabel[10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                labels[i][j] = new JLabel("hello");
                labels[i][j].addMouseMotionListener(this);
                labels[i][j].addKeyListener(this);
                labels[i][j].setOpaque(true);
                labels[i][j].setBackground(Color.green);
                add(labels[i][j]);
            }
        }

        setWhite();

        // addMouseMotionListener(this);

        addKeyListener(this);

        setVisible(true);
    }

    private void setWhite() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    labels[i][j].setBackground(Color.white);
                } else if (i % 2 != 0 && j % 2 != 0){
                    labels[i][j].setBackground(Color.white);
                }
            }

        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (e.getSource() instanceof JLabel) {
            ((JLabel) e.getSource()).setBackground(Color.cyan);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        setWhite();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
