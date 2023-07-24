import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    App(String s) {
        super(s);
        label = new JLabel();
        add(label);
        label.setForeground(new Color(74, 85, 162));
        getContentPane().setBackground(new Color(197, 223, 248));
        setLayout(null);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButtons[i] = new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext = new JButton("NEXT");
        btnNext.addActionListener(this);
        btnNext.setBackground(new Color(160, 191, 224));
        btnNext.setForeground(new Color(74, 85, 162));
        add(btnNext);

        btnResult = new JButton("RESULT");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnResult.setBackground(new Color(160, 191, 224));
        btnResult.setForeground(new Color(74, 85, 162));
        add(btnResult);

        setData();

        label.setBounds(30, 40, 450, 20);
        radioButtons[0].setBounds(50, 80, 450, 20);
        radioButtons[0].setBackground(new Color(197, 223, 248));
        radioButtons[0].setForeground(new Color(74, 85, 162));

        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[1].setBackground(new Color(197, 223, 248));
        radioButtons[1].setForeground(new Color(74, 85, 162));

        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[2].setBackground(new Color(197, 223, 248));
        radioButtons[2].setForeground(new Color(74, 85, 162));

        radioButtons[3].setBounds(50, 170, 200, 20);
        radioButtons[3].setBackground(new Color(197, 223, 248));
        radioButtons[3].setForeground(new Color(74, 85, 162));

        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(200, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (check())
                count = count + 1;
            current++;
            setData();
            if (current == 9) {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;
            JOptionPane.showMessageDialog(this, "correct answers= " + count);
            System.exit(0);
        }
    }

    void setData() {
        radioButtons[4].setSelected(true);
        if (current == 0) {
            label.setText("Q1 => What is the full form of HTML? ");
            radioButtons[0].setText("HyperText Markup Language.");// Correct answer
            radioButtons[1].setText("HighText Markup Language.");
            radioButtons[2].setText("Hot Mail.");
            radioButtons[3].setText("None of the above.");

        }
        if (current == 1) {
            label.setText("Q2 => Who is the founder of Python? ");
            radioButtons[0].setText("Jamess William.");
            radioButtons[1].setText("Sunndar Pichai.");
            radioButtons[2].setText("Guido van Rossum.");// Correct answer
            radioButtons[3].setText("None of the above.");

        }
        if (current == 2) {
            label.setText("Q3 => which of them below is NOT a coding language? ");
            radioButtons[0].setText("php.");
            radioButtons[1].setText("python.");
            radioButtons[2].setText("c++.");
            radioButtons[3].setText("pycharm");// Correct answer

        }
        if (current == 3) {
            label.setText("Q4 => What command do you use to output data to the screen? ");
            radioButtons[0].setText("Cin<<");
            radioButtons[1].setText("Cout>>");
            radioButtons[2].setText("Cout<<");// Correct answer
            radioButtons[3].setText("Output>>");

        }
        if (current == 4) {
            label.setText("Q5 => What is FIFO?? ");
            radioButtons[0].setText("First in Few Out");
            radioButtons[1].setText("Few in Few Out");
            radioButtons[2].setText("First in First Out");// Correct answer
            radioButtons[3].setText("None of the above");

        }
        if (current == 5) {
            label.setText("Q6 => Identify the correct extension of the user-defined header file? ");
            radioButtons[0].setText(".cpp");
            radioButtons[1].setText(".py");
            radioButtons[2].setText(".h");// Correct answer
            radioButtons[3].setText(".hf");

        }
        if (current == 6) {
            label.setText("Q7 => C++ uses which approach? ");
            radioButtons[0].setText("Top-Down approach.");
            radioButtons[1].setText("bottom-up approach.");// Correct answer
            radioButtons[2].setText("left-right approach.");
            radioButtons[3].setText("None of the above");

        }
        if (current == 7) {
            label.setText("Q8 => which of the datatype is supported in c++ but not in C? ");
            radioButtons[0].setText("Bool");// Correct answer
            radioButtons[1].setText("int");
            radioButtons[2].setText("String");
            radioButtons[3].setText("None of the above");

        }
        if (current == 8) {
            label.setText("Q9 => Identify The scope resolution operator ");
            radioButtons[0].setText("<<");
            radioButtons[1].setText("||");
            radioButtons[2].setText("::");// Correct answer
            radioButtons[3].setText("None of the above");

        }
        if (current == 9) {
            label.setText("Q1 => what is the size of int datatype in c++? ");
            radioButtons[0].setText("2 byte");
            radioButtons[1].setText("4 byte");// Correct answer
            radioButtons[2].setText("8 byte");
            radioButtons[3].setText("Depends on copiler");

        }
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            radioButtons[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        if (current == 0)
            return (radioButtons[0].isSelected());
        if (current == 1)
            return (radioButtons[2].isSelected());
        if (current == 2)
            return (radioButtons[3].isSelected());
        if (current == 3)
            return (radioButtons[2].isSelected());
        if (current == 4)
            return (radioButtons[2].isSelected());
        if (current == 5)
            return (radioButtons[2].isSelected());
        if (current == 6)
            return (radioButtons[1].isSelected());
        if (current == 7)
            return (radioButtons[0].isSelected());
        if (current == 8)
            return (radioButtons[2].isSelected());
        if (current == 9)
            return (radioButtons[1].isSelected());
        return false;
    }

    public static void main(String s[]) {
        new App("Quiz App");
    }

}