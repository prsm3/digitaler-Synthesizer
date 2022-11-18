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
    
    public SynthGUI()
    {
        fenster= new JFrame();
        
        oben = new JPanel();
        unten = new JPanel();
        
        linksOben = new JPanel();
        rechtsOben = new JPanel();
        linksUnten = new JPanel();
        rechtsUnten = new JPanel();
        
        //test = new JButton("test");
        //test.setFont(new Font("Arial", Font.PLAIN, 20));
        
        oszkop1 = new Oszilloskop();
        
        rechtsUnten.add(oszkop1);
        //linksOben.add(new JButton("LO"));
        //rechtsOben.add(new JButton("RO"));
        //linksUnten.add(new JButton("LU"));
        
        oben.add(linksOben, BorderLayout.WEST);
        oben.add(rechtsOben, BorderLayout.EAST);
        
        unten.add(linksUnten, BorderLayout.WEST);
        unten.add(rechtsUnten, BorderLayout.EAST);
        
        fenster.add(oben, BorderLayout.NORTH);
        fenster.add(unten, BorderLayout.SOUTH);
        
        fenster.setSize(600,600);
        fenster.setVisible(true);
    }
}