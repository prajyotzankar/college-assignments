import java.applet.Applet;
import java.awt.*;

/*
    <applet code = "temp.class" height = "500" width = "500">
        <param name = "temp" value = "36" >
    </applet>
*/

public class temp extends Applet {
    Font font;
    String temp;
    Double cel, fer;

    public void init() {
        font = new Font("Consolas", Font.BOLD, 20);
        temp = getParameter("temp");
        cel = Double.parseDouble(temp);
        fer = (cel * 1.8) + 32;
    }

    TextField t1;
    public void init(){
        t1 = new TextField(10);
        t2 = new TextField(10);

        add(t1);
        add(t2);

        t1.setText("0");
        t2.setText("0");
    }

    public void paint(Graphics g) {
        g.setFont(font);
        g.drawString("Temp in Celcius: " + cel, 30, 30);
        g.drawString("Temp in Fahrenheit: " + fer, 30, 50);
    }
}
