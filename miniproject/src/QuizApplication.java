import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QuizApplication extends JFrame implements ActionListener {
    JButton rules, back;
    JLabel heading, name;
    JTextField fname;

    QuizApplication() {
        getContentPane().setBackground(new Color(197, 223, 248));
        setLayout(null);

        heading = new JLabel("Quiz UP");
        heading.setBounds(200, 50, 300, 55);
        heading.setFont(new Font("Lumanosimo", Font.BOLD, 40));
        heading.setForeground(new Color(74, 85, 162));
        add(heading);

        name = new JLabel("Enter your name");
        name.setBounds(200, 150, 300, 40);
        name.setFont(new Font("Lumanosimo", 0, 20));
        name.setForeground(new Color(120, 149, 203));
        add(name);

        fname = new JTextField();
        fname.setBounds(200, 200, 200, 25);
        fname.setBackground(new Color(197, 223, 248));
        fname.setFont(new Font("Lumanosimo", 0, 15));
        add(fname);

        rules = new JButton("RULES");
        rules.setBounds(60, 240, 80, 30);
        rules.setBackground(new Color(160, 191, 224));
        rules.setForeground(new Color(74, 85, 162));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("BACK");
        back.setBounds(440, 240, 80, 30);
        back.setBackground(new Color(160, 191, 224));
        back.setForeground(new Color(74, 85, 162));
        back.addActionListener(this);
        add(back);

        setVisible(true);
        setSize(600, 350);
        setLocation(250, 100);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = fname.getText();
            setVisible(false);
            new rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new QuizApplication();
    }

}
