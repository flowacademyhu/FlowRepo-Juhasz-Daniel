import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {

    private List<Integer> numberList = new ArrayList();
    private List<Character> charList = new ArrayList();
    private JTextField result;
    private String actualNumber = "";
    private int number = 0;
    private int finalNumber = 0;

    public Window() throws HeadlessException {

        setTitle("Calculator");
        setLayout(new BorderLayout());
        setSize(1024, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel buttons = center();
        add(buttons, BorderLayout.CENTER);

        result = new JTextField();
        result.setBackground(Color.WHITE);
        result.setForeground(Color.BLACK);
        result.setPreferredSize(new Dimension(1024, 200));
        result.setEditable(false);
        add(result, BorderLayout.NORTH);

        setVisible(true);

    }

    private JPanel center() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4));

        JButton seven = new JButton("7");
        seven.addActionListener((ActionEvent e) -> {
            this.actualNumber += "7";
            this.result.setText(actualNumber);
            System.out.println( actualNumber );
        });
        panel.add(seven);

        JButton eight = new JButton("8");
        eight.addActionListener((ActionEvent e) -> {
            this.actualNumber += "8";
            this.result.setText(actualNumber);
        });
        panel.add(eight);

        JButton nine = new JButton("9");
        nine.addActionListener((ActionEvent e) -> {
            this.actualNumber += "9";
            this.result.setText(actualNumber);
        });
        panel.add(nine);

        /*for (int i = 7; i <= 9; i++) {
            JButton button = new JButton("" + i);
            button.addActionListener((ActionEvent e) -> {
                this.actualNumber += button.getText();
                this.result.setText(actualNumber);
            });
            panel.add(button);
        }*/

        JButton sum = new JButton("+");
        sum.addActionListener((ActionEvent e) -> {
            this.numberList.add(Integer.parseInt(this.actualNumber));
            this.actualNumber = "";
            this.charList.add('+');
            System.out.println(charList.get(0));
        });
        panel.add(sum);

        JButton four = new JButton("4");
        four.addActionListener((ActionEvent e) -> {
            this.actualNumber += "4";
            this.result.setText(actualNumber);
        });
        panel.add(four);

        JButton five = new JButton("5");
        five.addActionListener((ActionEvent e) -> {
            this.actualNumber += "5";
            this.result.setText(actualNumber);
        });
        panel.add(five);

        JButton six = new JButton("6");
        six.addActionListener((ActionEvent e) -> {
            this.actualNumber += "6";
            this.result.setText(actualNumber);
        });
        panel.add(six);

        /*for (int i = 4; i <= 6; i++) {
            JButton button = new JButton("" + i);
            panel.add(button);
        }*/

        JButton minus = new JButton("-");
        minus.addActionListener((ActionEvent e) -> {
            this.numberList.add(Integer.parseInt(this.actualNumber));
            this.actualNumber = "";
            this.charList.add('-');
            System.out.println(charList.get(0));
        });
        panel.add(minus);

        JButton one = new JButton("1");
        one.addActionListener((ActionEvent e) -> {
            this.actualNumber += "1";
            this.result.setText(actualNumber);
        });
        panel.add(one);

        JButton two = new JButton("2");
        two.addActionListener((ActionEvent e) -> {
            this.actualNumber += "2";
            this.result.setText(actualNumber);
        });
        panel.add(two);

        JButton three = new JButton("3");
        three.addActionListener((ActionEvent e) -> {
            this.actualNumber += "3";
            this.result.setText(actualNumber);
        });
        panel.add(three);

        /*for (int i = 1; i <= 3; i++) {
            JButton button = new JButton("" + i);
            panel.add(button);
        }*/

        JButton multi = new JButton("*");
        multi.addActionListener((ActionEvent e) -> {
            this.numberList.add(Integer.parseInt(this.actualNumber));
            this.actualNumber = "";
            this.charList.add('*');
            System.out.println(charList.get(0));
        });
        panel.add(multi);

        JButton clear = new JButton("C");
            clear.addActionListener((ActionEvent e) -> {
                this.numberList.clear();
                this.charList.clear();
                this.finalNumber = 0;
                this. actualNumber = "";
                this.result.setText(actualNumber);
            });
        panel.add(clear);

        JButton point = new JButton(".");
            point.addActionListener((ActionEvent e) -> {
                JOptionPane.showMessageDialog(this, "Not working!");
            });
        panel.add(point);

        JButton doIt = new JButton("=");
        doIt.addActionListener((ActionEvent e) -> {

            if ( numberList.size() == 0) {
                finalNumber = 0;
            } else {

                this.numberList.add(Integer.parseInt(this.actualNumber));

                for (int i = 0; 0 < numberList.size(); i++) {

                    int a = 0;
                    int b = 0;
                    int num = 0;

                    if (numberList.size() == 1 && finalNumber == 0) {
                        finalNumber = numberList.get(0);
                    } else if (numberList.size() > 1 && charList.get(i) == '+') {

                        a = numberList.get(0);
                        b = numberList.get(1);
                        num = a + b;
                        numberList.remove(0);
                        numberList.remove(0);

                    } else if (numberList.size() == 1 && charList.get(i) == '+') {

                        a = numberList.get(0);
                        numberList.remove(0);
                        num += a;

                    } else if (numberList.size() > 1 && charList.get(i) == '-') {

                        a = numberList.get(0);
                        b = numberList.get(1);
                        num = a - b;
                        numberList.remove(0);
                        numberList.remove(0);

                    } else if (numberList.size() == 1 && charList.get(i) == '-') {

                        a = numberList.get(0);
                        numberList.remove(0);
                        num -= a;

                    }
                    finalNumber += num;
                    System.out.println("végeredmény: " + finalNumber);

                }
            }
            numberList.clear();
            charList.clear();
            this.result.setText(Integer.toString(finalNumber));
            this.actualNumber = Integer.toString(finalNumber);
        });
        panel.add(doIt);

        JButton div = new JButton("/");
        div.addActionListener((ActionEvent e) -> {
            this.numberList.add(Integer.parseInt(this.actualNumber));
            this.actualNumber = "";
            this.charList.add('/');
            System.out.println(charList.get(0));
        });
        panel.add(div);



        return panel;

    }

}
