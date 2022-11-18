import java.awt.*;

class Oszilloskop extends Canvas
{
    public Oszilloskop()
    {
        setBackground(Color.GRAY);
        setSize(300,300);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(75, 75, 150, 75);
    }
}
