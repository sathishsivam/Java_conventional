import java.awt.*;
import java.awt.event.*;

 class simple extends Frame implements ItemListener,ActionListener
 {
    Choice ch;

    MenuBar mb;
    Menu m,m_1;
    MenuItem m1,m2,m3,m4,m11,m12,m13,m14;

     simple()
	{
	  setLayout(null);
	  setVisible(true);
	  setSize(600,600);

	  ch=new Choice();
	  ch.add("Java");
	  ch.add("servlet");
	  ch.add("Jsp");
	  ch.add("struts");
	  ch.add("Hibernate");
	  ch.add("SpringMVC");
	  add(ch);

	  ch.setBounds(100,120,120,90);

	  ch.addItemListener(this);

	  mb=new MenuBar();

          m=new Menu("Admin");

	  m1=new MenuItem("Registration");
	  m2=new MenuItem("Payment");
	  m3=new MenuItem("Items");
	  m4=new MenuItem("Exit");

	  m.add(m1);
	  m.add(m2);
	  m.add(m3);
	  m.add(m4);

          m_1=new Menu("User");

	  m11=new MenuItem("Registration");
	  m12=new MenuItem("Payment");
	  m13=new MenuItem("Items");
	  m14=new MenuItem("Exit");

	  m_1.add(m11);
	  m_1.add(m12);
	  m_1.add(m13);
	  m_1.add(m14);


	  mb.add(m);

	  mb.add(m_1);

	  setMenuBar(mb); // this method is used to add the menubar to frame.

	 m4.addActionListener(this);
	 m1.addActionListener(this);

	}

	public void itemStateChanged(ItemEvent d)
	{
		System.out.println(""+ch.getSelectedItem());
	}

	public void actionPerformed(ActionEvent s)
	 {
	   if(s.getActionCommand().equals("Exit"))
		{
	           System.exit(0);
		}

	   if(s.getActionCommand().equals("Registration"))
		{
	 		new sample();
		}
          }

  }


public class demoframe2
 {
    public static void main(String args[])
	{
	   simple obj=new simple();
	}
 }



 