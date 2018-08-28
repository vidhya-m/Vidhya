package First;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 7/25/18.
 */
public class Sampleform implements ActionListener{
    private JButton button1;
    private JPanel panel1;
    JTextField textField;
    JLabel label;

    Sampleform(){
        JFrame frame=new JFrame("First app");
        button1=new JButton("click");
        textField=new JTextField();
        label=new JLabel("First name");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(label);
        frame.add(textField);
        button1.setBounds(120,200,70,30);
        button1.addActionListener(this);
        textField.setBounds(120,150,90,30);
        label.setBounds(120,100,90,30);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1)
        textField.setText("Vidhya");
        JOptionPane.showMessageDialog(null,"Hello");
    }

    public static void main(String[] args) {
            new Sampleform();
        }

}
