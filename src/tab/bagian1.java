package tab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.*;

class bagian1 extends JPanel {

    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JTextField txt4;
    public JComboBox cmb1;
    public JRadioButton rd1;
    public JRadioButton rd2;
    public JRadioButton rd3;
    public JButton button1;

    public bagian1() {

        txt1 = new JTextField(15);
        txt1.setLocation(120, 10);
        txt1.setSize(txt1.getPreferredSize());

        label1 = new JLabel("Lab : ");
        label1.setLocation(10, 15);
        label1.setSize(label1.getPreferredSize());

        txt2 = new JTextField(15);
        txt2.setLocation(120, 40);
        txt2.setSize(txt1.getPreferredSize());

        label2 = new JLabel("Alamat Ruang : ");
        label2.setLocation(10, 45);
        label2.setSize(label2.getPreferredSize());

        txt3 = new JTextField(15);
        txt3.setLocation(120, 70);
        txt3.setSize(txt3.getPreferredSize());

        label3 = new JLabel("Panjang : ");
        label3.setLocation(10, 75);
        label3.setSize(label3.getPreferredSize());

        txt4 = new JTextField(15);
        txt4.setLocation(120, 100);
        txt4.setSize(txt3.getPreferredSize());

        label4 = new JLabel("Lebar : ");
        label4.setLocation(10, 105);
        label4.setSize(label4.getPreferredSize());

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(txt1);
        add(txt2);
        add(txt3);
        add(txt4);
        setLayout(null);
        setBackground(Color.yellow);
        setBorder(BorderFactory.createRaisedSoftBevelBorder());
    }

}
