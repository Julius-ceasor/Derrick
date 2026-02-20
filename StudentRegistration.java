/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentregistration;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame {
    private JTextField txtRegID, txtName, txtFaculty, txtProject, txtContact, txtEmail;
    private JButton btnRegister, btnClear, btnExit;

    public StudentRegistration() {
        setTitle("VUE Innovation & Technology Exhibition Registration");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10));

        // Labels and TextFields
        add(new JLabel("Registration ID:"));
        txtRegID = new JTextField();
        add(txtRegID);

        add(new JLabel("Student Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Faculty:"));
        txtFaculty = new JTextField();
        add(txtFaculty);

        add(new JLabel("Project Title:"));
        txtProject = new JTextField();
        add(txtProject);

        add(new JLabel("Contact Number:"));
        txtContact = new JTextField();
        add(txtContact);

        add(new JLabel("Email Address:"));
        txtEmail = new JTextField();
        add(txtEmail);

        // Buttons
        btnRegister = new JButton("Register");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");

        add(btnRegister);
        add(btnClear);
        add(btnExit);

        // Button Actions
        btnClear.addActionListener(e -> {
            txtRegID.setText("");
            txtName.setText("");
            txtFaculty.setText("");
            txtProject.setText("");
            txtContact.setText("");
            txtEmail.setText("");
        });

        btnExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}