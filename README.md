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
