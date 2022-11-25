import java.awt.*;
import javax.swing.*;
import javax.swing.JCheckBox;
import java.awt.event.*;

public class OszillatorPanel extends JPanel
{
    Oszillator core;
    
    JPanel oben;
    JPanel mitte;
    JPanel unten;
    
    JPanel untenLinks;
    JPanel untenMitte;
    JPanel untenRechts;
    
    JLabel ueberLabel;
    JLabel typLabel;
    JLabel frequenzLabel;
    JLabel amplitudeLabel;
    JLabel zeitLabel;
    
    JTextField frequenzFeld;
    JTextField ampluitudeFeld;
    JTextField zeitFeld;
    
    public OszillatorPanel()
    {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbl.setConstraints(this, gbc);
        setLayout(gbl);
        
        JCheckBox dreieckBox = new JCheckBox("dreieck", true);
        JCheckBox sinusBox = new JCheckBox("sinus", false);
        
        dreieckBox.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                sinusBox.setSelected(false);
            }
        });
        
        sinusBox.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                dreieckBox.setSelected(false);
            }
        });
        
        core = new Oszillator();
        
        frequenzFeld = new JTextField("Frequenz in Hz");
        ampluitudeFeld = new JTextField("Amplitude");
        zeitFeld = new JTextField("Länge der Wellenform");
        
        oben = new JPanel();
        mitte = new JPanel();
        unten = new JPanel();
        
        untenLinks = new JPanel();
        untenMitte = new JPanel();
        untenRechts = new JPanel();
        
        ueberLabel = new JLabel("Oszillator");
        ueberLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        
        typLabel = new JLabel("Typ:");
        typLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        frequenzLabel = new JLabel("Frequenz:");
        frequenzLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        amplitudeLabel = new JLabel("Amplitude:");
        amplitudeLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        zeitLabel = new JLabel("Zeit:");
        zeitLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(ueberLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(frequenzLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(frequenzFeld, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(typLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(dreieckBox, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(sinusBox, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(amplitudeLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(ampluitudeFeld, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(zeitLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(zeitFeld, gbc);
    }
    
    
}