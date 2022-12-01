import java.awt.*;
import javax.swing.*;
import javax.swing.JCheckBox;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.Border;

public class OszillatorPanel extends JPanel
{
    Oszillator core;
    
    // JPanel oben;
    // JPanel mitte;
    // JPanel unten;
    
    // JPanel untenLinks;
    // JPanel untenMitte;
    // JPanel untenRechts;
    
    JLabel ueberLabel;
    JLabel typLabel;
    JLabel frequenzLabel;
    JLabel amplitudeLabel;
    JLabel zeitLabel;
    
    JTextField frequenzFeld;
    JTextField ampluitudeFeld;
    JTextField zeitFeld;
    Choice wellentyp;
    
    JButton startButton;
    
    public OszillatorPanel()
    {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);
        gbl.setConstraints(this, gbc);
        setLayout(gbl);
        
        Border aussenlinie = BorderFactory.createLineBorder(Color.black);
        setBorder(aussenlinie);
        
        // JCheckBox dreieckBox = new JCheckBox("dreieck", true);
        // JCheckBox sinusBox = new JCheckBox("sinus", false);
        wellentyp = new Choice();
        wellentyp.add("sinus");
        wellentyp.add("dreieck");
        
        core = new Oszillator();
        
        frequenzFeld = new JTextField("Frequenz in Hz");
        ampluitudeFeld = new JTextField("Amplitude");
        zeitFeld = new JTextField("Länge der Wellenform");
        
        // oben = new JPanel();
        // mitte = new JPanel();
        // unten = new JPanel();
        
        // untenLinks = new JPanel();
        // untenMitte = new JPanel();
        // untenRechts = new JPanel();
        
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
        
        startButton = new JButton("START");
        startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                starte();
            }
        });
        
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
        add(wellentyp, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(startButton, gbc);
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
    
    public java.util.List getListe()
    {
        return core.getListe();
    }
    
    public java.util.List starte()
    {
        core.setAmplitude(Double.valueOf(ampluitudeFeld.getText()));
        core.setZeit(Double.valueOf(zeitFeld.getText()));
        core.setFrequenz(Double.valueOf(frequenzFeld.getText()));
        core.setModus(wellentyp.getSelectedItem());
        core.starte();
        core.printListe();
        return core.getListe();
    }
}