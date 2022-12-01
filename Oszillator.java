import java.lang.Math;
import java.util.*;

public class Oszillator
{
    double pi = 3.14159;
    double frequenz;
    double amplitude;
    double zeit;
    List ergebnisListe;
    String modus; //valide Modi: dreieck; sinus

    public Oszillator()
    {
        //Initialisierung eines Oszillatormoduls
        ergebnisListe = new ArrayList();
    }

    public void starte()
    {
        //generiert Sinsuwelle
        if(modus == "sinus")
        {
            for(double i=0; i < zeit; i=i+0.1)
            {
                ergebnisListe.add(amplitude*Math.sin(2*pi*frequenz*i));
            }
        }
        //generiert Dreieckswelle
        else if(modus == "dreieck")
        {
            for(double i=0; i < zeit; i=i+0.1)
            {
                ergebnisListe.add(2*amplitude/pi*Math.asin(Math.sin(2*pi*i*frequenz)));
            }
        }
        //Fehlercatching
        else
        {
            System.out.println("invalider Modus");
        }
    }

    public void printListe()
    {
        //schreibt die Liste auf
        for(int i=0; i < ergebnisListe.size(); i++)
        {
            System.out.println(ergebnisListe.get(i));
        }
    }

    public void loescheListe()
    {
        //Löscht die Liste
        ergebnisListe.clear();
    }

    public List getListe()
    {
        //gibt Ergebnis als Liste aus
        return(ergebnisListe);
    }
    
    public void setFrequenz(double f)
    {
        //Frequenzsetzung
        frequenz = f;
    }
    
    public double getFrequenz()
    {
        //gibt Frequenz aus
        return frequenz;
    }
    
    public void setAmplitude(double a)
    {
        //Amplitudensetzung
        amplitude = a;
    }
    
    public double getAmplitude()
    {
        //gibt Amplitude aus
        return amplitude;
    }
    
    public void setZeit(double z)
    {
        //Zeitsetzung
        zeit = z;
    }
    
    public double getZeit()
    {
        //gibt Zeit aus
        return zeit;
    }
    
    public void setModus(String m)
    {
        //setzt den Modus
        modus = m;
    }
}