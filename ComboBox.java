import javax.swing.*;
public class ComboBox 
{
    JFrame f;
    ComboBox()
	{
	f=new JFrame("ComboBox");
	String C[]={"india","canada","usa","newyork"};
	JComboBox cb=new JComboBox(C);
	f.setBounds(60,90,90,80);
	f.add(cb);
	f.setLayout(null);
	f.setSize(400,500);
	f.setVisible(true);
	}
 public static void main(String args[])
	{
	new ComboBox();
	}
}