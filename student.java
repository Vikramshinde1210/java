import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class student extends JAppplet implements ActionListener{
JButton jb1,jb2;
JTextField jt;
public void init()
{
Container c=getContentPane();
jb1=new JButton();
jb1.setActionCommand("button 1");
jb1.addActionListener(this);
c.add(jb1);
jb2=new JButton();
jb2.setActionCommand("button 2");
jb2.addActionListener(this);
c.add(jb2);
jt=new jTextField(20);
c.add(jt);
void actionPerformed(ActionEvent ae)
{
jt.setText(ae.getActionCommand());
}

}
}