import java.applet.Applet;
import java.awt.*;

/* <applet code = "smileyFace.class" width = "500" height = "500" ></applet> */

public class smileyFace extends Applet {
    Font f1;
    public void init () {
        f1 = new Font( "Consolas", Font.BOLD, 20 );
    }
    public void paint ( Graphics g ) {
        g.setFont( f1 );
        g.setColor( Color.RED );
        g.drawString( "Keep Smiling !!" , 30, 30);
        g.setColor( Color.yellow );
        g.drawOval(80, 70, 150, 150);
        g.fillOval( 80 , 70, 150, 150);
        g.setColor(Color.black);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.drawArc(130, 180, 50, 20, 180, 180);

    }
}
