package First;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 7/25/18.
 */
public class SampleGui implements ActionListener{
        private JButton button1;
        private JButton button2;
        private JPanel panel1;
        JTextField textField1;
        JTextField textField2;
        JTextField textField3;
        JLabel label;

        SampleGui() {
            JFrame frame = new JFrame("Second app");
            button1 = new JButton("Add");
            button2 = new JButton("Subtract");
            textField1 = new JTextField();
            textField2  =new JTextField();
            textField3  =new JTextField();
            label = new JLabel("Numbers");
            frame.setLayout(null);
            frame.setSize(500, 500);
            frame.add(button1);
            frame.add(button2);
            frame.add(label);
            frame.add(textField1);
            frame.add(textField2);
            frame.add(textField3);
            label.setBounds(120, 100, 90, 30);
            textField1.setBounds(120, 150, 90, 30);
            textField2.setBounds(120, 200, 90, 30);
            textField3.setBounds(120, 250, 90, 30);
            button1.setBounds(120, 300, 70, 30);
            button2.setBounds(200, 300, 100, 30);
            button1.addActionListener(this);
            button2.addActionListener(this);
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {if (e.getSource() == button1){
                int i1=Integer.parseInt(textField1.getText());
                int i2=Integer.parseInt(textField2.getText());
                int i3=i1+i2;
                textField3.setText(String.valueOf(i3));

            }
            if (e.getSource() == button2){
                int i1=Integer.parseInt(textField1.getText());
                int i2=Integer.parseInt(textField2.getText());
                int i3=i1-i2;
                textField3.setText(String.valueOf(i3));
            }

        }

        public static void main(String[] args) {
            new SampleGui();
        }

    }

