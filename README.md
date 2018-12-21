# InforamationSystem
simple information system for student 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args){
        // our methods


        //building our GUI

        //
        JFrame f = new JFrame();
        f.setBackground(Color.CYAN);
        JLabel lab1 = new JLabel("Sign in to see your result");
        JLabel lab2 = new JLabel("User_name");
        JLabel lab3 = new JLabel("Password");
        JTextField t1 = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton button1 = new JButton("Login As Admin");
        JButton button2 = new JButton("Login As Student");
        JButton button3 = new JButton("Reset");
        JButton button4 = new JButton("Exit");
        Font font = new Font("Arial", Font.BOLD,15);

        lab1.setBounds(120,20,250,50);
        lab1.setFont(font);
        lab1.setForeground(Color.blue);

        lab2.setBounds(40,60,150,50);
        t1.setBounds(120,70,200,25);
        lab3.setBounds(40,105,150,50);
        pass.setBounds(120,115,200,25);

        // our button
        button1.setBounds(100,170,200,35);
        button2.setBounds(100,210,200,35);
        button3.setBounds(100,250,200,35);
        button4.setBounds(100,290,200,35);


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                pass.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(f,"do you want to exit");
                System.exit(0);
            }
        });


        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=t1.getText();
                String password=String.valueOf(pass.getPassword());
                if(name.equals("admin")&&password.equals("admin123")){
                    AdminLogin.main(new String[]{});
                    f.dispose();
                }else{
                    JOptionPane.showMessageDialog(f, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
                    t1.setText("");
                    pass.setText("");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=t1.getText();
                String password=String.valueOf(pass.getPassword());
                if(name.equals("admin")&&password.equals("admin")){
                    StudentLogin.main(new String[]{});
                    f.dispose();
                }else{
                    JOptionPane.showMessageDialog(f, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
                    t1.setText("");
                    pass.setText("");
                }
            }
        });


        //add component to our frame
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.add(t1);
        f.add(pass);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(button4);

    }
}

/////////////////////////////////////////
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin {
    public static void main(String[]args){
        JFrame fra = new JFrame("Admin Login");
        fra.setSize(400,400);
        JLabel label = new JLabel("Admin Login");
        label.setBounds(144,10,200,100);
        Font font = new Font("Arial",Font.BOLD,20);
        label.setFont(font);
        label.setForeground(Color.BLUE);
        JButton bt = new JButton("Add");
        bt.setBounds(150,80,75,35);
        JButton bt1 = new JButton("Delete");
        bt1.setBounds(150,120,75,35);
        JButton bt2 = new JButton("Modify");
        bt2.setBounds(150,160,75,35);
        JButton bt3 = new JButton("Back");
        bt3.setBounds(150,200,75,35);



        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ///String name=t1.getText();
                //String password=String.valueOf(pass.getPassword());
                JOptionPane.showMessageDialog(fra, "Sorry, Username or Password Error", "Login Error!", JOptionPane.ERROR_MESSAGE);
                //t1.setText("");
                //pass.setText("");
            }

        });


        //adding our buttons to frame
        fra.add(bt);
        fra.add(bt1);
        fra.add(bt2);
        fra.add(bt3);
        fra.add(label);

        fra.setLayout(null);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setSize(400,400);
        fra.setVisible(true);
        fra.setForeground(Color.cyan);

    }
}
////////////////////////////////////////////
import javax.swing.*;
import java.awt.*;

public class AddingStudent {
    public static void main(String[] args){
        JFrame f = new JFrame();
        Font font = new Font("Arial",Font.BOLD,12);
        //building our labels
        JLabel infLabel = new JLabel("write down your information");
        infLabel.setBounds(120,10,250,40);
        infLabel.setFont(font);
        infLabel.setForeground(Color.red);
        JLabel lab = new JLabel("First Name");
        // setting our attributes to label
        lab.setBounds(20,40,100,40);
        JLabel lab1 = new JLabel("Last Name");
        // setting our attributes to label
        lab1.setBounds(20,80,100,40);
        JLabel lab2 = new JLabel("College");
        // setting our attributes to label
        lab2.setBounds(20,120,100,40);
        JLabel lab3 = new JLabel("Age");
        // setting our attributes to label
        lab3.setBounds(20,160,100,40);
        JLabel lab4 = new JLabel("Email");
        // setting our attributes to label
        lab4.setBounds(20,200,100,40);
        JLabel lab5 = new JLabel("Address");
        // setting our attributes to label
        lab5.setBounds(20,240,100,40);
        JButton button = new JButton("Save");
        button.setBounds(140,280,75,35);
        // setting our attributes to label
        JButton button1 = new JButton("Back");
        // setting our attributes to label
        button1.setBounds(140,330,75,35);

        // building our textFiled
        JTextField t1 = new JTextField();
        t1.setBounds(120,45,200,20);
        JTextField t2 = new JTextField();
        t2.setBounds(120,85,200,20);
        JTextField t3 = new JTextField();
        t3.setBounds(120,125,200,20);
        JTextField t4 = new JTextField();
        t4.setBounds(120,165,200,20);
        JTextField t5 = new JTextField();
        t5.setBounds(120,205,200,20);
        JTextField t6 = new JTextField();
        t6.setBounds(120,245,200,20);

        //adding our component
        f.add(infLabel);
        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.add(lab4);
        f.add(lab5);
        f.add(button);
        f.add(button1);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        //setting our attributes to frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }
}
///////////////////////////////////////////////
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentLogin {
    public static void main(String[] args){
        JFrame f2 = new JFrame();
        f2.setSize(300,300);
        Font font = new Font("arial",Font.BOLD,20);


        JLabel Studentlabel = new JLabel("Student Information");
        // setting our attributes
        Studentlabel.setBounds(135,7,200,50);
        Studentlabel.setFont(font);
        Studentlabel.setForeground(Color.BLUE);
        JLabel label1 = new JLabel("Name");
        // setting our attributes
        label1.setBounds(20,30,50,50);
        JLabel label11 = new JLabel("Mohamed abdelhamid ");
        // setting our attributes
        JLabel label2 = new JLabel("College");
        // setting our attributes
        label2.setBounds(20,53,50,50);
        JLabel label22 = new JLabel("Faculty of engineering ");
        // setting our attributes
        JLabel label3 = new JLabel("Student Degree");
        // setting our attributes
        label3.setBounds(135,70,200,50);
        label3.setFont(font);
        label3.setForeground(Color.red);
        JLabel label4 = new JLabel("Mathematics");
        JLabel label44 = new JLabel();
        // setting our attributes
        label4.setBounds(20,90,100,50);
        JLabel label5 = new JLabel("Control");
        // setting our attributes
        label5.setBounds(20,110,100,50);
        JLabel label55 = new JLabel();
        JLabel label6 = new JLabel("programming");
        // setting our attributes
        label6.setBounds(20,130,100,50);
        JLabel label66 = new JLabel();
        JLabel label7 = new JLabel("logic");
        JLabel label77 = new JLabel();
        // setting our attributes
        label7.setBounds(20,150,100,50);
        JLabel label8 = new JLabel("Electronics");
        // setting our attributes
        label8.setBounds(20,170,100,50);
        JLabel label88 = new JLabel();
        JLabel label9 = new JLabel("Marketing");
        // setting our attributes
        label9.setBounds(20,190,100,50);
        JLabel label99 = new JLabel();
        JButton button1 = new JButton("Back");
        // setting our attributes
        button1.setBounds(120,240,75,50);
        JButton button2 = new JButton("Exit");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // setting our attributes
        button2.setBounds(195,240,75,50);
        // adding our component
        f2.add(label1);
        f2.add(label2);
        f2.add(label3);
        f2.add(label4);
        f2.add(label5);
        f2.add(label6);
        f2.add(label7);
        f2.add(label8);
        f2.add(label9);
        f2.add(label11);
        f2.add(label22);
        f2.add(Studentlabel);
        f2.add(button1);
        f2.add(button2);

        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLayout(null);
        f2.setSize(400,400);
        f2.setVisible(true);


    }
}

