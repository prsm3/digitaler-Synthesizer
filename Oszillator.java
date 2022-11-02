import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Oszillator
{
    double pi = 3.14159;
    double frequenz;
    double amplitude;
    double zeit;
    List ergebnisListe;

    public Oszillator()
    {
        ergebnisListe = new ArrayList();
    }

    public void starte()
    {
        //Standard Oszillator
        //100 Ergebnisse pro Zeiteinheit
        for(double i=0; i < zeit; i=i+0.001)
        {
            ergebnisListe.add(amplitude*Math.sin(2*pi*frequenz*i));
        }
    }

    public void printListe()
    {
        for(int i=0; i < ergebnisListe.size(); i++)
        {
            System.out.println(ergebnisListe.get(i));
        }
    }

    public void loescheListe()
    {
        ergebnisListe.clear();
    }

    public List getListe()
    {
        //gibt Ergebnis als Liste aus
        return(ergebnisListe);
    }
    
    public void setFrequenz(double f)
    {
        //langweilige Frequenzsetzung
        frequenz = f;
    }
    
    public double getFrequenz()
    {
        //gibt Frequenz aus
        return frequenz;
    }
    
    public void setAmplitude(double a)
    {
        //langweilige Amplitudensetzung
        amplitude = a;
    }
    
    public double getAmplitude()
    {
        //gibt Frequenz aus
        return amplitude;
    }
    
    public void setZeit(double z)
    {
        //langweilige Zeitsetzung
        zeit = z;
    }
    
    public double getZeit()
    {
        //gibt Frequenz aus
        return zeit;
    }
}