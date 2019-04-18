import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

    public static final String TITLE = "Calculator";

    public Window() throws HeadlessException {

        setTitle(TITLE);

        JTextField field1 = textField1();
        JTextField field2 = textField2();

        JRadioButton a = radioButton1();
        JRadioButton b = radioButton2();
        JRadioButton c = radioButton3();
        JRadioButton d = radioButton4();

        ButtonGroup group = new ButtonGroup();
        group.add(a);
        group.add(b);
        group.add(c);
        group.add(d);

        this.setSize(1500, 1500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(400, 600, 300, 100);
        add(resultLabel);


        JButton button = new JButton("Press");
        button.setBounds(750, 600, 300, 100);
        button.addActionListener((ActionEvent e) -> {
            try {
                if (a.isSelected()) {
                    int num = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
                    resultLabel.setText(String.valueOf(num));
                } else if (b.isSelected()) {
                    int num = Integer.parseInt(field1.getText()) - Integer.parseInt(field2.getText());
                    resultLabel.setText(String.valueOf(num));
                } else if (c.isSelected()) {
                    int num = Integer.parseInt(field1.getText()) * Integer.parseInt(field2.getText());
                    resultLabel.setText(String.valueOf(num));
                } else if (d.isSelected()) {
                    double num = (double) Integer.parseInt(field1.getText()) / (double) Integer.parseInt(field2.getText());
                    resultLabel.setText(String.valueOf(num));
                }
            } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(this, "Számot adj meg!");
            }
            });

        add(button);

    }

    private JTextField textField1() {

        JTextField field = new JTextField();
        field.setBounds(500, 200, 200, 50);
        field.setBackground(Color.WHITE);
        field.setForeground(Color.BLACK);

        add(field);

        return field;

    }

    private JTextField textField2() {

        JTextField field = new JTextField();
        field.setBounds(1000, 200, 200, 50);
        field.setBackground(Color.WHITE);
        field.setForeground(Color.BLACK);

        add(field);

        return field;
    }

    private JRadioButton radioButton1() {

        JRadioButton button = new JRadioButton("+");
        button.setBounds(750, 100, 100,100);

        add(button);

        return button;

    }

    private JRadioButton radioButton2() {

        JRadioButton button = new JRadioButton("-");
        button.setBounds(750, 200, 100, 100);

        add(button);

        return button;
    }

    private JRadioButton radioButton3() {

        JRadioButton button = new JRadioButton("*");
        button.setBounds(750, 300, 100, 100);

        add(button);

        return button;
    }

    private JRadioButton radioButton4() {

        JRadioButton button = new JRadioButton("/");
        button.setBounds(750, 400, 100, 100);

        add(button);

        return button;
    }

    private void resultLabel(int a) {

        JLabel label = new JLabel("" + a);
        label.setBounds(400, 600, 300, 100);

        add(label);

    }
}
