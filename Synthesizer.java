public class Synthesizer
{
    Oszillator osz1;
    
    public Synthesizer()
    {
        osz1 = new Oszillator();
        osz1.setFrequenz(10);
        osz1.setAmplitude(1);
        osz1.setZeit(1);
        osz1.starte();
        
        osz1.printListe();
        
    }
}