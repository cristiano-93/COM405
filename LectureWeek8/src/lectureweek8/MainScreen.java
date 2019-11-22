/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureweek8;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristiano
 */
public class MainScreen extends JFrame implements ActionListener
{
    private JLabel lblTitle;
    private JLabel lblStudentID;
    private JLabel lblStudentName;
    
    private JTextField txtStudentID;
    private JTextField txtStudentName;
    
    private JButton btnAdd;
    private JButton btnRemove;
    
    private GridBagConstraints constraints;
    private Classroom room;
    
    
    public MainScreen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        
        constraints = new GridBagConstraints();
        room = new Classroom();
        
        //Set up components
        initComponents();
        
        //create layout
        layoutComponents();
                
    }
    
    public void initComponents()
    {
        lblTitle = new JLabel("Room Managment System");
        lblStudentID = new JLabel("Student ID: ");
        lblStudentName = new JLabel("Student Name: ");
        txtStudentID = new JTextField();
        txtStudentName = new JTextField();
        btnAdd = new JButton("Add Student");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove Student");
        btnRemove.addActionListener(this);
    }
    public void layoutComponents()
    {
        
        constraints.gridy=1;
        constraints.gridx=0;
        constraints.gridwidth=1;
        this.add(txtStudentID, constraints);
        //missing a lot of code fr building the window
    }
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnAdd))
        {
            JOptionPane.showMessageDialog(null,"YAY");
        }
        else if (ev.getSource().equals(btnRemove))
        {
            
        }
    }
}
