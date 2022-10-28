import java.applet.Applet;
import java.awt.*;

/*
    <applet code = "username.class" width = "500" height = "500" >
        <param name = "username" value = "Python">
    </applet>
*/

public class username extends Applet {
    String user, msg;
    int len;
    Font font;
    public void init() {
        font = new Font ( "Consolas", Font.BOLD, 20 );
        user = getParameter( "username" );
        msg = "Hello "+user+" !!";
        len = user.length();
    }    
    public void paint ( Graphics g ) {
        g.drawString ( msg , 30, 30 );
        g.setColor( Color.BLUE );
        g.drawString( "Length: "+len , 30, 50);
    }
}