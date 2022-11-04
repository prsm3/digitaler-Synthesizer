import java.util.*;

public class Mixer
{
    List ergebnisListe;
    String modus; //valide Modi: addieren; subtahieren

    public Mixer()
    {
        ergebnisListe = new ArrayList();
    }

    public void starte(List l1, List l2)
    {
        //addiert zwei Oszillatorlisten
        if(modus == "addieren")
        {
            //Größenvergleich
            if(l1.size()>l2.size())
            {
                for(int i = 0; i<l1.size(); i++)
                {
                    ergebnisListe.add((Double)l1.get(i)+(Double)l2.get(i));
                }
            }
            else
            {
                for(int i = 0; i<l2.size(); i++)
                {
                    ergebnisListe.add((Double)l1.get(i)+(Double)l2.get(i));
                }
            }
        }
        //subtrahiert zwei Oszillatorlisten
        if(modus == "subtrahieren")
        {
            //Größenvergleich
            if(l1.size()>l2.size())
            {
                for(int i=0; i < l1.size(); i++)
                {
                    //Sichergehen das die Vorzeichen richtig sind
                    if(Math.abs((Double)l1.get(i))>Math.abs((Double)l2.get(i)))
                    {
                        //ausrechnen des Wertes zum Zeitpunkt i
                        ergebnisListe.add((Double)l1.get(i)-(Double)l2.get(i));
                    }
                    else
                    {
                        //ausrechnen des Wertes zum Zeitpunkt i
                        ergebnisListe.add((Double)l2.get(i)-(Double)l1.get(i));
                    }
                }
            }
            else
            {
                for(int i = 0; i<l2.size(); i++)
                {
                    //Sichergehen das die Vorzeichen richtig sind
                    if(Math.abs((Double)l1.get(i))>Math.abs((Double)l2.get(i))){
                        //ausrechnen des Wertes zum Zeitpunkt i
                        ergebnisListe.add((Double)l1.get(i)-(Double)l2.get(i));
                    }
                    else
                    {
                        //ausrechnen des Wertes zum Zeitpunkt i
                        ergebnisListe.add((Double)l2.get(i)-(Double)l1.get(i));
                    }
                }
            }
        }
    }

    public void setModus(String m)
    {
        modus = m;
    }
    
    public List getListe()
    {
        //gibt Ergebnis als Liste aus
        return(ergebnisListe);
    }
    
    public void printListe()
    {
        //schreibt die Liste auf
        for(int i=0; i < ergebnisListe.size(); i++)
        {
            System.out.println(ergebnisListe.get(i));
        }
    }
}