import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {

    public Border() throws HeadlessException {

        JFrame frame = new JFrame();

        JPanel panel1 = new JPanel();

        setSize(1000, 600);
        setVisible(true);
        setLayout(new BorderLayout());

        setTitle("Calculator");

        JTextField result = new JTextField();

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

        add(nine, BorderLayout.CENTER);


    }

}
