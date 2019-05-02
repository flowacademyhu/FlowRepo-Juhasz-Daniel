import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Window extends JFrame implements KeyListener, MouseListener, MouseMotionListener {

        int x = 150;
        int y = 50;

        private JButton button;

        private Random random;

        public Window() throws HeadlessException {

           setTitle("A window");
           setSize(400, 400);
           setResizable(false);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLayout(null);

           this.button = new JButton("ok");
           button.setBounds(x, y, 150, 50);
           add(button);

            setVisible(true);

           button.addKeyListener(this);
           addMouseListener(this);
           addMouseMotionListener(this);
           button.addMouseMotionListener(this);

           random = new Random(1);





        }

    @Override
    public void keyTyped(KeyEvent e) {



    }

    @Override
    public void keyPressed(KeyEvent e) {

            char b = e.getKeyChar();
            if(b == 'w') {
                y-=10;
            } else if (b == 's') {
                y+=10;
                if (y + button.getHeight() > this.getHeight()) {
                    this.setSize(getWidth(), y + button.getHeight());
                }
            } else if (b == 'a') {
                x-=10;

            } else if (b == 'd') {
                x+=10;
                if (x + button.getWidth() > this.getWidth()) {
                    this.setSize(x + button.getWidth(), getHeight());
                }
            }
            this.button.setLocation(x,y);

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());
        int x = e.getX();
        int y = e.getY();
        button.setLocation(x, y-32);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        if (mx >= x && mx <= x + button.getWidth()) {
            if (my - 32 >= y && my - 32 <= y + button.getHeight()) {
                x = random.nextInt(this.getWidth() - button.getWidth());
                y = random.nextInt(this.getHeight() - button.getHeight());
                System.out.println(x);
                System.out.println(y);
                button.setLocation(x, y);
            }
        }

    }
}
