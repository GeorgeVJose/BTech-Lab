import java.awt.*;
import java.applet.*;
/*
<applet code="AppletOne" width=350 height=350> </applet>
*/
public class AppletOne extends Applet
{
  public void paint(Graphics g)
  {
    setBackground(Color.red);
    g.setColor(Color.black);
    g.drawString("HELLO WORLD", 20, 20);
  }
}
