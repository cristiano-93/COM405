/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek3;
import java.util.Scanner;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cristiano
 */
public class Screen extends JFrame implements ActionListener
{
    private GridBagConstraints constraints;
	
    private JLabel lblSpeed;
    private JLabel lblMaxSpeed;
    private JLabel lblRefuel;
    private JLabel lblTitle;
    
    private JTextField txtSpeed;
    private JTextField txtMaxSpeed;
    private JTextField txtRefuel;
    
    private JButton btnAccelerate;
    private JButton btnBrake;
    private JButton btnRefuel;
    
    public Screen()
    {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        
        constraints = new GridBagConstraints();
        
        initComponents();
        
        layoutComponents();
    }
    public void initComponents()
    {
        lblTitle = new JLabel ("Car details: ");
        lblSpeed = new JLabel("Current Speed: ");
        lblMaxSpeed = new JLabel("Max Speed: ");
        lblRefuel = new JLabel("Fuel Level: ");
          
        //txtSpeed = new JTextField();
        //txtMaxSpeed = new JTextField();
        //txtRefuel = new JTextField();
           
        btnAccelerate = new JButton("Accelerate");
        btnAccelerate.addActionListener(this);
        btnBrake = new JButton("Brake");
        btnBrake.addActionListener(this);
        btnRefuel = new JButton("Refuel");
        btnRefuel.addActionListener(this);
    }
    public void layoutComponents()
    {
        constraints.gridy=0;
        constraints.gridx=0;
        constraints.gridwidth=2;
        this.add(lblTitle, constraints);
        
        constraints.gridwidth=1;
        constraints.gridy=1;
        this.add(lblSpeed, constraints);
        
        constraints.gridy=2;
        this.add(lblMaxSpeed, constraints);
        
        constraints.gridy=3;
        this.add(lblRefuel, constraints);
        
        constraints.gridy=4;
        this.add(btnAccelerate,constraints);
        
        constraints.gridy=5;
        this.add(btnBrake, constraints);
        
        constraints.gridy=6;
        this.add(btnRefuel, constraints);
        
    }
     public void actionPerformed(ActionEvent ev)
        {
            if(ev.getSource().equals(btnAccelerate))
            {
                
            }
        }
    
}
