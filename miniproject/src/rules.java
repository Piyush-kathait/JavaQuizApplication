import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(197, 223, 248));
        setLayout(null);

        JLabel heading = new JLabel("welcome " + name);
        heading.setBounds(30, 10, 300, 55);
        heading.setFont(new Font("Lumanosimo", Font.BOLD, 25));
        heading.setForeground(new Color(74, 85, 162));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(30, 5, 600, 300);
        rules.setFont(new Font("Lumanosimo", Font.PLAIN, 16));
        rules.setForeground(new Color(74, 85, 162));
        rules.setText(
                "<html>" +
                        "1. All questions are compulsory to attempt"
                        + "<br><br>" +
                        "2. Wrong Answer if no option is selected"
                        + "<br><br>" +
                        "3. Don't use unfair means to solve this quiz" + "<br><br>"
                        +
                        "4. ALL THE BEST!!!" + "<br><br>" +
                        "<html>");
        add(rules);

        start = new JButton("START");
        start.setBounds(60, 240, 80, 30);
        start.setBackground(new Color(160, 191, 224));
        start.setForeground(new Color(74, 85, 162));
        start.addActionListener(this);
        add(start);

        back = new JButton("BACK");
        back.setBounds(440, 240, 80, 30);
        back.setBackground(new Color(160, 191, 224));
        back.setForeground(new Color(74, 85, 162));
        back.addActionListener(this);
        add(back);

        setSize(600, 350);
        setLocation(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new rules("User");

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new App(name);

        } else if (ae.getSource() == back) {
            setVisible(false);
            new QuizApplication();

        }

    }
}
