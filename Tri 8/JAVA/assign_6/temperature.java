import java.applet.Applet;
import java.awt.*;

/*
    <applet code = "temperature.class" height = "500" width = "500">
        <param name = "temp" value = "30" >
    </applet>
*/

public class temperature extends Applet {
    Font font;
    String temp;
    Double cel, fer;

    public void init() {
        font = new Font("Consolas", Font.BOLD, 20);
        temp = getParameter("temp");
        cel = Double.parseDouble(temp);
        fer = (cel * 1.8) + 32;
    }

    public void paint(Graphics g) {
        g.setFont(font);
        g.drawString("Temp in Celcius: " + cel, 30, 30);
        g.drawString("Temp in Fahrenheit: " + fer, 30, 50);
    }
}
