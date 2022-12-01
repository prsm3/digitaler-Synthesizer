import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.util.ArrayList;

public class MixerPanel extends JPanel
{
    Mixer mixer;
    
    JLabel ueberschriftLabel;
    JLabel modusLabel;
    Choice modusAuswahl;
    JButton startButton;
    
    java.util.List liste1;
    java.util.List liste2;
    
    public MixerPanel()
    {
        mixer = new Mixer();
        
        liste1 = new ArrayList();
        liste1 = new ArrayList();
        
        Border aussenlinie = BorderFactory.createLineBorder(Color.black);
        setBorder(aussenlinie);
        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2,2,2,2);
        gbl.setConstraints(this, gbc);
        setLayout(gbl);
        
        ueberschriftLabel = new JLabel("Mixer");
        ueberschriftLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        
        modusLabel = new JLabel("modus: ");
        modusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        startButton = new JButton("START");
        startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                starte();
            }
        });
        
        modusAuswahl = new Choice();
        modusAuswahl.add("addieren");
        modusAuswahl.add("subtrahieren");
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(ueberschriftLabel, gbc);
        // gbc.gridx = 0;
        gbc.gridy = 1;
        add(modusLabel, gbc);
        // gbc.gridx = 0;
        gbc.gridy = 2;
        add(modusAuswahl, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(startButton, gbc);

    }
    
    public void setListe(java.util.List liste, int i)
    {
        if(i==1)
        {
            liste1 = liste;
        }
        if(i==2)
        {
            liste2 = liste;
        }
    }
    
    public void starte()
    {
        mixer.setModus(modusAuswahl.getSelectedItem());
        mixer.starte(liste1, liste2);
        mixer.printListe();
    }
}