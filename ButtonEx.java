/*<applet code=ButtonEx.class width=500 height=500>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonEx extends Applet implements ActionListener
{
String msg;
Button b1,b2,b3;
public void init()
{
b1=new Button("YES");
b2=new Button("NO");
b3=new Button("EXIT");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("YES"))
{
msg="you pressed YES";
}
else if(str.equals("NO"))
{
msg="you pressed NO";
}
else
{
msg="you pressed EXIT";
}
repaint();

}
public void paint(Graphics g)
{
g.drawString(msg,50,200);
}
}
