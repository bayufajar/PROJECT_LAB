package tab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Tab extends JFrame {

    private void init() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {

        }
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("identitas", new bagian1());
        tp.addTab("kondisi", new bagian2());
        tp.addTab("lingkungan", new bagian3());
        tp.addTab("kenyamanan", new bagian4());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        add(tp);

        
          JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);
        JMenu submenu = new JMenu("File");
        JMenu submenu1 = new JMenu("Help");
        JMenuItem item1 = new JMenuItem("save",'A');
        JMenuItem item4 = new JMenuItem("Close",'k');
        JMenuItem visit = new JMenuItem("Visit");
        
      item4.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
          System.exit(0);
      }});
        
      menu.add(submenu);
      submenu.add(item1);
      submenu.addSeparator();
      submenu.add(item4);
      menu.add(submenu1);
      submenu1.add(visit);
      visit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null,"anda bisa mengunjungi : http://oracle.java.com");
            }
        });
        JButton button = new JButton("process");
        button.setSize(80, 40);
        button.setLocation(90, 220);
        button.setBackground(Color.yellow);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane
                        .showMessageDialog(null, "sorry, this is only example of gui. can't function well");
            }
        });
        add(button);

        JButton about = new JButton("about");
        about.setSize(80, 40);
        about.setLocation(200, 220);
        about.setBackground(Color.cyan);
        about.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                tp.addTab("about", new about());
            }

        });
        add(about);

        JPanel bgg = new JPanel();
        bgg.setLocation(10,220);
        bgg.setSize(365,40);
        bgg.setBackground(Color.darkGray);
        bgg.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        add(bgg);
        
        JPanel panel = new JPanel();
        panel.setLocation(0, 0);
        panel.setSize(4000, 3000);
        panel.setBackground(Color.lightGray);
        add(panel);

        tp.setLocation(20, 10);
        tp.setSize(350, 200);
        setBounds(500, 200, 400, 330);
        setTitle("Inventaris Lab");
        setResizable(false);

    }

    public static void main(String[] args) {
        new Tab().init();
    }

}
