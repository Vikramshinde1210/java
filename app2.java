import java.applet.*; 
import java.awt.*;
import java.util.Date;
<applet code=app2.class width=300 height=300></applet>
public class app2 extends Applet 
{ 
public void paint(Graphics g) 
{ 
Date dt = new Date(); 
super.showStatus("Today is" + dt); 
} 
} 