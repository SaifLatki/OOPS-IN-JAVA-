import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame Frame;

    JTextField text1;

    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton equal,clear, pluse ,minus ,multiply, divivde;
     JLabel lbl;
      JPanel panel;
    void designGUI(){
         Frame = new JFrame();

         b0 = new JButton("0");
         b1 = new JButton("1");
         b2 = new JButton("2");
         b3 = new JButton("3");
         b4 = new JButton("4");
         b5 = new JButton("5");
         b6 = new JButton("6");
         b7 = new JButton("7");
         b8 = new JButton("8");
         b9 = new JButton("9");
         pluse = new JButton("+");
         minus = new JButton("-");
         multiply = new JButton("*");
         divivde = new JButton("/");
         clear = new JButton("c");
         lbl = new JLabel("copyright by MicroSoft");

         text1 = new JTextField(40);
            panel =new JPanel(new GridLayout(4,4));
        Container c = Frame.getContentPane();



        c.add(text1, BorderLayout.NORTH);
        c.add(lbl , BorderLayout.SOUTH);
        c.add(panel, BorderLayout.CENTER);
        panel.add (text1);

        panel.add (b1);
        panel.add (b2);
        panel.add(clear);
        panel.add (b3);
        panel.add (b4);
        panel.add (b5);
        panel.add (pluse);
        panel.add (b6);
        panel.add (b7);
        panel.add (b8);
        panel.add(minus);
        panel.add (b9);
        panel.add(b0);




        panel.add(multiply);
        panel.add(divivde);



        Frame.setSize(250,150);
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    Main(){
        designGUI() ;
    }
    public  static void main(String[]arg){
        Main obj = new Main() ;
    }
    }
