import java.applet.Applet;
import java.awt.*;

/* <applet code = "table.class" width = "500" height = "500"></applet>  */

public class table extends Applet {
    int table ,limit, x, y;
    String ans;
    Font font;
    public void init () {
        table = 1;
        limit = 10;
        x = y = 30;
        font = new Font ( "Consolas", Font.BOLD, 15 );
        setForeground( Color.CYAN );
        setBackground( Color.BLACK );
    }
    public void paint ( Graphics g ) {
        g.setFont( font );
        if ( table != limit ) {
            for ( int i = table ; i <= limit ; i++ ) {
                for ( int j = 1 ; j <= limit ; j++ ) {
                    g.drawString( (i*j)+"\t" , x, y);
                    x += 20;
                }
                x = 30;
                y += 20;
            }
        }
    }
}