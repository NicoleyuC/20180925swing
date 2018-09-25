import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JButton Exit = new JButton("Exit");
    private JButton Push = new JButton("Push");
    private JButton Down = new JButton("Down");
    private JLabel lb = new JLabel();
    private Container cp;
    private String str = "按鈕次數：";
    private int count = 0;

    public MainFrame(){
        initComp();
    }
    private void initComp(){
        cp = this.getContentPane();
        this.setBounds(50,50,500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(null);

        lb.setBounds(150,100,200,50);
        lb.setText(str + count);
        cp.add(lb);

        Push.setBounds(100,150,100,50);
        Push.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                lb.setText(str + count);
            }
        });
        cp.add(Push);

        Down.setBounds(200,150,100,50);
        Down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                lb.setText(str + count);
            }
        });
        cp.add(Down);

        Exit.setBounds(150,200,100,50);
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(Exit);
    }
}
