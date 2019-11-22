/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek8;
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
    CarPark park = new CarPark();
        
        private GridBagConstraints constraints;
	
	private JLabel lblregNo;
	private JLabel lblcolour;
	private JLabel lblmake;
        private JLabel lblmodel;
        private JLabel lblstatus;
	
	private JTextField txtregNo;
	private JTextField txtcolour;
        private JTextField txtmake;
        private JTextField txtmodel;        
	
	private JButton btnAdd;
	private JButton btnRemove;
        
        public Screen()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(new GridBagLayout());
		
		constraints = new GridBagConstraints();
		
		// Set up our components
		initComponents();
		
		// Create layout
		layoutComponents();
        }
        public void initComponents()
        {
            lblregNo = new JLabel("Registration Number: ");
            lblcolour = new JLabel("Colour: ");
            lblmake = new JLabel("Make: ");
            lblmodel = new JLabel("Model: ");
            lblstatus = new JLabel("Car park has 15 empty spaces");
            
            txtregNo = new JTextField();
            txtcolour = new JTextField();
            txtmake = new JTextField();
            txtmodel = new JTextField();
            
            btnAdd = new JButton("Add");
            btnAdd.addActionListener(this);
            btnRemove = new JButton("Remove");
            btnRemove.addActionListener(this);
        }
        public void layoutComponents()
        {
            constraints.gridy = 0;
            constraints.gridx = 0;
            constraints.gridwidth = 1;
            this.add(lblregNo, constraints);
            constraints.gridx = 1;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            this.add(txtregNo, constraints);
            
            constraints.fill = GridBagConstraints.NONE;
            constraints.gridy = 1;
            constraints.gridx = 0;
            this.add(lblcolour, constraints);
            constraints.gridx = 1;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            this.add(txtcolour, constraints);
            
            constraints.fill = GridBagConstraints.NONE;
            constraints.gridy = 2;
            constraints.gridx = 0;
            this.add(lblmake, constraints);
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 1;
            this.add(txtmake, constraints);
            
            constraints.fill = GridBagConstraints.NONE;
            constraints.gridy = 3;
            constraints.gridx = 0;
            this.add(lblmodel, constraints);
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 1;
            this.add(txtmodel, constraints);
            
            constraints.gridy = 4;
            constraints.gridx = 0;
            constraints.gridwidth = 2;
            this.add(lblstatus, constraints);
            
            constraints.fill = GridBagConstraints.NONE;
            constraints.gridy = 5;
            constraints.gridx = 0;
            this.add(btnAdd, constraints);
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridx = 1;
            this.add(btnRemove, constraints);
            
        }
        public void actionPerformed(ActionEvent ev)
        {
            if(ev.getSource().equals(btnAdd))
            {
                String regNo = txtregNo.getText();
                String colour = txtcolour.getText();
                String make = txtmake.getText();
                String model = txtmodel.getText();
                
                if(park.addCar(new Car(regNo, colour, make, model)))
                {
                    JOptionPane.showMessageDialog(null, "Car Added");
                    lblstatus.setText("Car park has "+park.getFreeSpaces()+" empty spaces");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Car park is full");
                }
            }
            else if(ev.getSource().equals(btnRemove))
            {
                String regNo = txtregNo.getText();
                if(park.removeCar(regNo))
                {
                    JOptionPane.showMessageDialog(null, "Car Removed");
                    lblstatus.setText("Car park has "+park.getFreeSpaces()+" empty spaces");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Car not found");
                }                   
            }
        }

        
        
}
