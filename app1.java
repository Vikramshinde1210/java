/*<applet code=app1.class width=500 height=500>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class app1 extends Applet implements ActionListener
{
String msg;
Button b1,b2,b3;
Label l1;
public void init()
{
b1=new Button("YES");
b2=new Button("NO");
b3=new Button("EXIT");
l1=new Label("hello");
add(b1);
add(b2);
add(b3);
add(l1);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("YES"))
{
b1.setLabel("1");
}
else if(str.equals("NO"))
{
b1.setLabel("2");
}
else
{
b1.setLabel("3");
}
repaint();

}

}
