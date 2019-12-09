/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek10;

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
public class Screen extends JFrame implements ActionListener {
    
    private GridBagConstraints constraints;

    private JLabel lbltitle;
    private JLabel lblload;
    private JLabel lblreg;
    private JLabel lblweight;
    private JLabel lblentry;
    private JLabel lblfee;
    private JLabel lblloadIn;
    
    private JTextField txtreg;
    private JTextField txtweight;

    private JButton btnAdd;
    private JButton btnRemove;
    
    private Bridge br;
    
    public Screen()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new GridBagLayout());
                br = new Bridge(30000, 20);
		
		constraints = new GridBagConstraints();
		
		// Set up our components
		initComponents();
		
		// Create layout
		layoutComponents();
        }
    public void initComponents()
        {
            lbltitle = new JLabel("Bridge System");
            lblload = new JLabel("Current Load: ");
            lblloadIn = new JLabel("x kg");
            lblreg = new JLabel("Registration");
            lblweight = new JLabel("Weight");
            lblentry = new JLabel("*******");
            lblfee = new JLabel("********");
                        
            txtreg = new JTextField();
            txtweight = new JTextField();
            
            btnAdd = new JButton("Add");
            btnAdd.addActionListener(this);
            btnRemove = new JButton("Remove");
            btnRemove.addActionListener(this);
        }
    public void layoutComponents()
        {
            constraints.gridy = 0;
            constraints.gridx = 0;
            constraints.gridwidth = 2;
            this.add(lbltitle, constraints);
            
            constraints.gridy = 1;
            constraints.gridx = 0;
            constraints.gridwidth = 1;
            this.add(lblload, constraints);
                        
            constraints.gridx = 1;
            this.add(lblloadIn, constraints);
            
            constraints.gridy = 2;
            constraints.gridx = 0;            
            this.add(lblreg, constraints);
            
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridy = 2;
            constraints.gridx = 1;            
            this.add(txtreg, constraints);
            
            
            //constraints.fill = GridBagConstraints.NONE;
            constraints.gridy = 3;
            constraints.gridx = 0;            
            this.add(lblweight, constraints);
            
            constraints.gridx = 1;
            this.add(txtweight, constraints);
            constraints.fill = GridBagConstraints.HORIZONTAL;
            
            constraints.fill = GridBagConstraints.NONE;
            constraints.gridy = 4;
            constraints.gridx = 0;
            this.add(btnAdd, constraints);
            
            constraints.gridx = 1;
            this.add(btnRemove, constraints);
            
            constraints.gridy = 5;
            constraints.gridx = 0;
            constraints.gridwidth = 2;
            this.add(lblentry, constraints);
            
            constraints.gridy = 6;
            this.add(lblfee, constraints);
        }
    @Override
    public void actionPerformed(ActionEvent ev)
        {
            if(ev.getSource().equals(btnAdd))
            {
                String reg = txtreg.getSelectedText();
                int weight = Integer.parseInt(txtweight.getText());
                
                Vehicle veh = null;
                
                if(weight<500)
                {
                    veh = new Motorbike(reg, weight);
                }
                else if(weight>=500 && weight <3500)
                {
                    veh = new Car(reg, weight);
                }
                else
                {
                    veh = new Lorry(reg, weight);
                }
                
                if(br.addVehicle(veh))
                {
                    lblentry.setText("Entry Granted!");
                    lblfee.setText("£"+veh.calcFee());
                    lblload.setText(br.calcTotal()+ "kg");
                }
                else
                {
                    lblentry.setText("Entry Denied!!!");
                    lblfee.setText("-----");
                    
                }
            }
            else if(ev.getSource().equals(btnRemove))
            {
                String reg = txtreg.getText();
                if(br.removeVehicle(reg))
                {
                    lblentry.setText("it has Vanished");
                    lblfee.setText("*****");
                    lblload.setText(br.calcTotal()+ "kg");
                }
            }
        }
            

}
