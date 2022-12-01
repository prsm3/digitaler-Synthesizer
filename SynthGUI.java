import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SynthGUI extends Thread
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
    MixerPanel mixerPanel1;
    
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
        mixerPanel1 = new MixerPanel();
        
        oszPanel1.startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mixerPanel1.setListe(oszPanel1.getListe(), 1);
            }
        });
        
        oszPanel2.startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mixerPanel1.setListe(oszPanel2.getListe(), 2);
            }
        });

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(oszPanel1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(oszPanel2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(mixerPanel1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(oszkop2, gbc);
        
        fenster.add(mainPanel);
        fenster.setSize(700,700);
        fenster.setVisible(true);
    }
}