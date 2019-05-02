import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {

    public static final String TITLE = "Calculator";

    public Grid() throws HeadlessException {

        setTitle(TITLE);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        List buttons = new List();

        JTextField result = new JTextField();
        result.setBounds(0,0,1000, 11000);
        add(result, BorderLayout.NORTH);

        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");

        for (int i = 7; i <= 9; i++) {
            JButton button = new JButton("" + i);
            this.add(button, BorderLayout.CENTER);
        }

        for (int i = 4; i <= 6; i++) {
            JButton button = new JButton("" + i);
            this.add(button, BorderLayout.CENTER);
        }

        for (int i = 1; i <= 3; i++) {
            JButton button = new JButton("" + i);
            this.add(button, BorderLayout.CENTER);
        }

        this.setSize(1024, 768);
        this.setLayout(new GridLayout(0, 3));
        this.setVisible(true);

    }

}
