import java.awt.*;
import java.awt.event.*;

 class sample extends Frame implements ActionListener,ItemListener,MouseListener,MouseMotionListener
   {
     Label l1,l2,l3;

     TextField t1,t2,t3;

     Button b1,b2;

     List l;	

     TextArea ta;	


     sample()
	{
 
          setLayout(null);

	  setVisible(true);
	  setSize(600,600);
	  setBackground(Color.cyan);

	  l1=new Label("UserName");
	  l2=new Label("Password");
	  l3=new Label("Confirm Password");


	  t1=new TextField(10);
	  t2=new TextField(10);
	  t3=new TextField(10);

	  t2.setEchoChar('*');
	  t3.setEchoChar('*');

	  Panel p=new Panel(new GridLayout(3,2));

	  p.add(l1);
	  p.add(t1);

	  p.add(l2);
	  p.add(t2);

	  p.add(l3);
	  p.add(t3);

	  add(p);
	  p.setBounds(470,90,340,100);	

	  b1=new Button("Submit");
	  b2=new Button("Exit");
	
	  b1.setBackground(Color.green);
	  Panel bp=new Panel(new GridLayout(1,2));

	  bp.add(b1);
	  bp.add(b2);

	  bp.setBounds(470,220,170,40);

	  add(bp);

	  Label lh=new Label(" Enter your credentials");
	  
          add(lh);
	  lh.setBounds(470,50,440,20);
  	  
          t1.setBackground(Color.cyan);

	  b1.addActionListener(this);
	  b2.addActionListener(this);

	// List

		l=new List();
		l.add("Java");
		l.add("Java script");
		l.add("servlets");
		l.add("jsp");
		l.add("Python");

		add(l);

		l.setBounds(190,150,120,70);

		l.addItemListener(this);

		addMouseListener(this);

		addMouseMotionListener(this);


	// TextArea

	      ta=new TextArea();
		
	      add(ta);

   	      ta.setBounds(490,350,250,80);

	      ta.setBackground(Color.cyan);

	     Checkbox ch1=new Checkbox("Browsing ");
	     Checkbox ch2=new Checkbox("Music");
	     Checkbox ch3=new Checkbox("Reading ");
	     Checkbox ch4=new Checkbox("Programming ");

    	     Panel chpan=new Panel(new GridLayout(1,4)); 

		chpan.add(ch1);
		chpan.add(ch2);
		chpan.add(ch3);
		chpan.add(ch4);

		add(chpan);

		chpan.setBounds(230,320,280,520);


		CheckboxGroup cbg=new CheckboxGroup();		
	
		Checkbox m=new Checkbox("Male",cbg,false);
		Checkbox f=new Checkbox("Female",cbg,true);
		Checkbox o=new Checkbox("others",cbg,false);

		Panel rpan=new Panel(new GridLayout(1,3));

		rpan.add(m);
		rpan.add(f);
		rpan.add(o);

		add(rpan);
		rpan.setBounds(130,320,180,60);
			
		
  
	}

	public void actionPerformed(ActionEvent d)	// method of ActionListener
	{

		if(d.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		
		if(d.getActionCommand().equals("Submit"))
		{

			if(t2.getText().equalsIgnoreCase(t3.getText()))
			{
	 	 		System.out.println("password confirmed");
			}
			else
			{	
				System.out.println("password not confirmed");
			}
	
    		}
		
	}

	public void itemStateChanged(ItemEvent f)
	{
		String s=l.getSelectedItem();
		System.out.println(""+s);
	}

	public void mouseExited(MouseEvent m)
	{
//	   setBackground(Color.cyan);
	}

	public void mouseEntered(MouseEvent m)
	{
	 // setBackground(Color.yellow);
	}

	public void mouseReleased(MouseEvent m)
	{}

	public void mousePressed(MouseEvent m)
	{}

	public void mouseClicked(MouseEvent m)
	{
	
	}

	public void mouseMoved(MouseEvent mm){}

	public void mouseDragged(MouseEvent mm)
	{
		Graphics g=getGraphics();
		
		g.setColor(Color.BLUE);
		
		g.fillOval(mm.getX(),mm.getY(),30,30);
	
	}



    }

 class demoframe1
  {
    public static void main(String args[])
	{
	   sample obj=new sample();
	}
   }    



	



	
