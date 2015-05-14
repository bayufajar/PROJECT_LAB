/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tab;

import java.awt.Color;
import javax.swing.*;

public class about extends JPanel {

    private JTextArea txt1;

    public about() {
        txt1 = new JTextArea(7, 20);
        txt1.setSize(txt1.getPreferredSize());
        txt1.setText("Nama Kelompok : \n1. Bayu Fajar Pratama \n2. Rizky Ade Mahendra \n3. Soveatin Kuntur \n4. M. Sawalludin putra Jaya");
        txt1.setEditable(false);
        add(txt1);
        setBackground(Color.MAGENTA);
        setBorder(BorderFactory.createRaisedSoftBevelBorder());
    }
}
