import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class myBankAccount extends Frame implements ActionListener
{
    static boolean  bool=false;
    
    Label label1,label2,label3,creator;
    static int accno,accno1;
    Choice a,b,c,d;
    Button button1,button2;
    String as="";
    TextField text1,text2;
    boolean first,second;
    TextField asssd,bi;
    Panel panel1,panel2,panel3,panel4,panel5,panel6;
    WindowDemo frame;
    Image img;
   public static void main(String[] args)
    {
        new myBankAccount();
    }
    public myBankAccount()
    {
        setLayout(new GridLayout(15,1));
        label1=new Label("Enter the account no.:",Label.CENTER);
        add(label1);
        a=new Choice();
        b=new Choice();
        c=new Choice();
        d=new Choice();
        int i;
        for(i=0;i<=9;i++)
        {
            a.add(Integer.toString(i));
        }
        for(i=0;i<=9;i++)
        {
            b.add(Integer.toString(i));
        }
        for(i=0;i<=9;i++)
        {
            c.add(Integer.toString(i));
        }
        for(i=0;i<=9;i++)
        {
            d.add(Integer.toString(i));
        }
        add(a);
        add(b);
        add(c);
        add(d);
        panel1=new Panel();
        panel1.add(a);
        panel1.add(b);
        panel1.add(c);
        panel1.add(d);
        button1=new Button("done");
        add(button1);
        panel2=new Panel();
        panel2.add(button1);
        button1.addActionListener(this);
        bi=new TextField(20);
        add(bi);
        panel5=new Panel();
        panel5.add(bi);
        label2=new Label("Enter the Password:",Label.CENTER);
        text1=new TextField(20);
        text1.setEchoChar('*');
        add(text1);
        panel3=new Panel();
        panel3.add(text1);
        text1.addActionListener(this);
        button2=new Button("enter");
        add(button2);
        panel4=new Panel();
        panel4.add(button2);
        button2.addActionListener(this);
        panel6=new Panel();
        asssd=new TextField(20);
        add(asssd);
        panel6.add(asssd);
        add(panel1);
        add(panel2);
        add(panel5);
        add(label2);
        add(panel3);
        add(panel4);
        add(panel6);
        accno1=Integer.parseInt(a.getSelectedItem())*1000+Integer.parseInt(b.getSelectedItem())*100+Integer.parseInt(c.getSelectedItem())*10+Integer.parseInt(d.getSelectedItem());
        frame=new WindowDemo("my frame",this,accno1);
        creator=new Label("made by raj bunsha");
        add(creator);
        setVisible(true);
        setSize(5000,5000);
        frame.setVisible(false);
          frame.setSize(5000,5000);
        addWindowListener(new MyWindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
         {
            System.exit(1);
         } 
        });
   }
   public void actionPerformed(ActionEvent e)
    {
        as=text1.getText();
        if(as.equalsIgnoreCase("raj")&&e.getSource()==button2)
        {
            asssd.setText("Password is valid");
            first=true;
        }
        else if(e.getSource()==button2)
        {
            asssd.setText("Password is invalid");
            first=false;
        }
        if(e.getSource()==button1)
        {
          accno=Integer.parseInt(a.getSelectedItem())*1000+Integer.parseInt(b.getSelectedItem())*100+Integer.parseInt(c.getSelectedItem())*10+Integer.parseInt(d.getSelectedItem());
          second=rajb(accno);
          frame=new WindowDemo("my frame",this,accno);
          
          addWindowListener(new MyWindowAdapter());
          if(second==true)
          {
               bi.setText("valid account no.");
            }
          if(second==false)
          {
               bi.setText("invalid account no.");
          }
        }
        if(first==true&&second==true)
        {
          frame.setVisible(true);
        }
        else
        {
            frame.setVisible(false);
        }
    }
   public static boolean rajb(int accno){
          accno1=accno;
          int bs=0;
          for(int i=4;i>=1;i--)
          {
                bs+=(i*(accno%10));
                accno=accno/10; 
          }
          accno=accno1;
          if(bs%7==0)
          {
               return true;
          }
          else
          {
              return false;
          }
     }
     class WindowDemo extends Frame implements ActionListener
   {
      Label label1,label2,label3;
      TextField text2,text1;
      Button but,but2,transaction,open;
      Panel panel16,panel2;
      String string="";
      myBankAccount shew;
      window3 frame;
      String asd;
      WindowDem111 window;
      WindowDemo(String sh,myBankAccount shew,int accno)
      {
        super(sh);
        transaction=new Button("Transaction");
        panel16=new Panel();
        setLayout(new GridLayout(15,1));
        asd=Integer.toString(accno1);
        label1=new Label("account "+asd+" opened");
        add(label1);
        label2=new Label("Enter the money:-");
        add(label2);
        text2=new TextField(20);
        add(text2);
        but=new Button("Deposit");
        add(but);
        but.addActionListener(this);
        but2=new Button("Withdraw");
        add(but2);
        but2.addActionListener(this);
        add(transaction);
        transaction.addActionListener(this);
        open=new Button("open");
        add(open);
        open.addActionListener(this);
        panel16.add(but);
        panel16.add(but2);
        panel16.add(transaction);
        panel16.add(open);
        add(panel16);
        text1=new TextField(40);
        add(text1);
        setSize(500,500);
        setVisible(false);
        addWindowListener(new MyWindowAdapter());
        frame=new window3("my frame2",this);
        window=new WindowDem111(this);
        window.setSize(300,200);
        window.setLocation(300,300);
        window.setSize(600,600);
        setVisible(false);
        addWindowListener(new MyWindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
         {
            System.exit(1);
         } 
        });
       }
      public void actionPerformed(ActionEvent eve)
       {
        if(but==eve.getSource())
        {
          try
          {
            WindowDem111 a=new WindowDem111(this);
            a.repaint();
            text1.setText("$"+Integer.valueOf(text2.getText())+" Deposited on "+time.main());
            AppendToFileExample1.main(accno1,text1.getText());
          }
          catch(Exception e)
          {
            text1.setText("not possible check only numbers allowed");   
          }
        }
        if(but2==eve.getSource())
        {
            try
          {
            text1.setText("$"+Integer.valueOf(text2.getText())+" WithDrawn on "+time.main());
            AppendToFileExample1.main(accno1,text1.getText());
          }
          catch(Exception e)
          {
            text1.setText("not possible check only numbers allowed");   
          }
        }
        if(transaction==eve.getSource())
        {
            frame.setVisible(true);
        }
        if(open==eve.getSource())
        {
            bool=!bool;
            window.setVisible(bool);
        }
       }
       class WindowDem111 extends Window
        {
       Label label1;
       String kant[]=new String[file_reader.totallines(accno1)];
       WindowDem111(WindowDemo shw)
       {
        super(shw);
        setLayout(new FlowLayout());
        //System.out.println(file_reader.totallines(accno1));
        for(int i=0;i<file_reader.totallines(accno1);i++){
          kant[i]=file_reader.main(accno1,i);
          kant[i]=MorseToEnglish.toEnglish(kant[i]);
        }
       }
       public void paint(Graphics g)
       {
        int width=getSize().width;
        int height=getSize().height;
        g.drawRect(0,0,--width,--height);
        g.setFont(new Font("TimesRoman",Font.PLAIN,30));
        g.drawString("Bank account details:",30,30);
        g.setFont(new Font("TimesRoman",Font.PLAIN,10));
        for(int i=0;i<file_reader.totallines(accno1);i++){
        g.drawString(kant[i],50,50+i*10);
        }
       }
      }
      class window3 extends Frame implements ActionListener
      {
        WindowDemo raj;
        Label labe,kla,ola;
        Button button1;
        Choice a1,b1,c1,d1;
        Panel panel12;
        TextField text21;
        window3(String sf,WindowDemo raj)
        {
            super(sf);
            setLayout(new GridLayout(15,1));
            labe=new Label("your accno. is "+asd+"");
            add(labe);
            kla=new Label("Enter other bank account");
            add(kla);
            a1=new Choice();
            b1=new Choice();
            c1=new Choice();
            d1=new Choice();
             int i; 
             for(i=0;i<=9;i++)
             {
                a1.add(Integer.toString(i));
             }
             for(i=0;i<=9;i++)
             {
                b1.add(Integer.toString(i));
             }
             for(i=0;i<=9;i++)
             {
                c1.add(Integer.toString(i));
             }
             for(i=0;i<=9;i++)
             {
               d1.add(Integer.toString(i));
              }
              add(a1);
             add(b1);
              add(c1);  
              add(d1);
              panel12=new Panel();
             panel12.add(a1);
                panel12.add(b1);
              panel12.add(c1);
               panel12.add(d1);
               add(panel12);
              ola=new Label("the amount to be transacted");
              add(ola);
              text21=new TextField(20);
              add(text21);
               button1=new Button("done");
              add(button1);
              button1.addActionListener(this);
              setSize(500,500);
             addWindowListener(new MyWindowAdapter()
           {
            @Override
            public void windowClosing(WindowEvent e)
            {
            System.exit(1);
            } 
           });
        }
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                if(e.getSource()==button1)
             {
               text21.setText("$"+Integer.parseInt(text21.getText())+" sent to account "+a1.getSelectedItem()+""+b1.getSelectedItem()+""+c1.getSelectedItem()+""+d1.getSelectedItem()+"");
              }
            }
            catch(Exception vde)
            {
                text21.setText("invalid");
            }
        } 
      }
       class MyWindowAdapter extends WindowAdapter
      {    
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
      }
    }
    class MyWindowAdapter extends WindowAdapter
    {    
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}
