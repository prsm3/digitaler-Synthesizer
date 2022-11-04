public class Synthesizer
{
    Oszillator osz1;
    Oszillator osz2;
    Mixer mix1;
    
    public Synthesizer()
    {
        osz1 = new Oszillator();
        osz1.setFrequenz(1);
        osz1.setAmplitude(1);
        osz1.setZeit(1);
        osz1.setModus("sinus");
        osz1.starte();
        osz1.printListe();
        
        osz2 = new Oszillator();
        osz2.setFrequenz(1);
        osz2.setAmplitude(0.3);
        osz2.setZeit(1);
        osz2.setModus("sinus");
        osz2.starte();
        osz2.printListe();
        
        mix1 = new Mixer();
        mix1.setModus("subtrahieren");
        mix1.starte(osz1.getListe(), osz2.getListe());
        mix1.printListe();
        
    }
}