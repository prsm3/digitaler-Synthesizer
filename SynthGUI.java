import java.awt.*;
import javax.swing.*;

public class SynthGUI
{
    JFrame fenster;
    
    JPanel oben;
    JPanel unten;
    
    JPanel linksOben;
    JPanel rechtsOben;
    JPanel linksUnten;
    JPanel rechtsUnten;

    JButton test;
    Oszilloskop oszkop1;
    Oszilloskop oszkop2;
    Oszilloskop oszkop3;
    OszillatorPanel oszPanel1;
    OszillatorPanel oszPanel2;
    
    public SynthGUI()
    {
        JPanel mainPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3,3,3,3);
        gbl.setConstraints(mainPanel, gbc);
        mainPanel.setLayout(gbl);
        
        fenster = new JFrame();
        
        oben = new JPanel();
        unten = new JPanel();
        
        linksOben = new JPanel();
        rechtsOben = new JPanel();
        linksUnten = new JPanel();
        rechtsUnten = new JPanel();
        
        // test = new JButton("test");
        // test.setFont(new Font("Arial", Font.PLAIN, 20));
        
        oszkop1 = new Oszilloskop();
        oszkop2 = new Oszilloskop();
        oszkop3 = new Oszilloskop();
        oszPanel1 = new OszillatorPanel();
        oszPanel2 = new OszillatorPanel();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(oszPanel1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(oszPanel2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(oszkop1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(oszkop2, gbc);
        
        fenster.add(mainPanel);
        fenster.setSize(700,700);
        fenster.setVisible(true);
    }
}