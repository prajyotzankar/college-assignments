import java.applet.Applet; 
import java.awt.*;

/* <applet code = "traffic.class" height = "500" width = "500" > </applet> */

public class traffic extends Applet {
    public void paint ( Graphics g ) {
        g.setColor( Color.BLACK );
        g.drawRect( 50, 50, 60, 140);
        g.fillRect( 50, 50, 60, 140);
        g.drawRect( 65, 190, 30, 70);
        g.fillRect( 65, 190, 30, 70);
        g.setColor( Color.RED );
        g.drawOval( 65, 60, 30, 30);
        g.fillOval( 65, 60, 30, 30);
        g.setColor( Color.YELLOW );
        g.drawOval( 65, 100, 30, 30);
        g.fillOval( 65, 100, 30, 30);
        g.setColor( Color.GREEN );
        g.drawOval( 65, 140, 30, 30);
        g.fillOval( 65, 140, 30, 30);
    }
}
