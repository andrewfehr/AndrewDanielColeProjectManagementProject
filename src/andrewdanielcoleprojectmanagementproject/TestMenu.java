/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrewdanielcoleprojectmanagementproject;

import java.io.*;
import java.util.*;

/**
 *
 * @author colem
 */
public class TestMenu extends javax.swing.JFrame {
    MainMenu mainMenu;
    
    private void scanFile()
    {
        Quiz[] qz = new Quiz[10];
        try{
            File file = new File("src/andrewdanielcoleprojectmanagementproject/questions & answers.txt");
            Scanner scan = new Scanner(file);
            
            String question;
            int answer;
            String ansDescription;
            String[] answerOptions = new String[4];
            int numQuestion;
            
            for(int n=0; n<10; n++)
            {
                question = scan.nextLine();
                for(int i=0; i<4; i++)
                {
                    answerOptions[i] = scan.nextLine();
                }
                answer = Integer.parseInt(scan.nextLine());
                ansDescription = scan.nextLine();
                
                numQuestion = n+1;
                
                qz[n] = new Quiz(numQuestion, question, answerOptions, answer, ansDescription);
            }
        }catch(FileNotFoundException e)
        {
            System.out.print(e);
        }
        display(qz[0]);
    }
    
    private void display(Quiz qz) 
    {
        int numQ = qz.getNumQuestion();
        btnQuestion.setText(qz.getQuestion());
        radOptionOne.setText(qz.getAnswerOption(1));
        radOptionTwo.setText(qz.getAnswerOption(2));
        radOptionThree.setText(qz.getAnswerOption(3));
        radOptionFour.setText(qz.getAnswerOption(4));
        prgNumQuestion.setValue((numQ*10));
        lblNumQuestion.setText("Question: " + numQ + "/10");
        
        if(numQ == 10)
        {
            btnNext.setText("Done");
        }
    }
    /**
     * Creates new form TestMenu
     */
    public TestMenu(MainMenu m) {
        initComponents();
        mainMenu = m;
        scanFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupAnswerOptions = new javax.swing.ButtonGroup();
        btnMainMenu = new javax.swing.JButton();
        btnQuestion = new javax.swing.JLabel();
        radOptionOne = new javax.swing.JRadioButton();
        radOptionTwo = new javax.swing.JRadioButton();
        radOptionThree = new javax.swing.JRadioButton();
        radOptionFour = new javax.swing.JRadioButton();
        prgNumQuestion = new javax.swing.JProgressBar();
        lblNumQuestion = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMainMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMainMenu.setText("Back");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnQuestion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnQuestion.setText("Question");

        btngroupAnswerOptions.add(radOptionOne);
        radOptionOne.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radOptionOne.setText("option1");

        btngroupAnswerOptions.add(radOptionTwo);
        radOptionTwo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radOptionTwo.setText("option2");

        btngroupAnswerOptions.add(radOptionThree);
        radOptionThree.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radOptionThree.setText("option3");

        btngroupAnswerOptions.add(radOptionFour);
        radOptionFour.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radOptionFour.setText("option4");

        lblNumQuestion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNumQuestion.setText("Question: 1/10");

        btnNext.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNext.setText("Next");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radOptionFour)
                                    .addComponent(radOptionThree)
                                    .addComponent(radOptionTwo)
                                    .addComponent(radOptionOne))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgNumQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNumQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMainMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radOptionOne)
                .addGap(18, 18, 18)
                .addComponent(radOptionTwo)
                .addGap(18, 18, 18)
                .addComponent(radOptionThree)
                .addGap(18, 18, 18)
                .addComponent(radOptionFour)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMainMenu)
                    .addComponent(btnNext))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNumQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(prgNumQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        mainMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel btnQuestion;
    private javax.swing.ButtonGroup btngroupAnswerOptions;
    private javax.swing.JLabel lblNumQuestion;
    private javax.swing.JProgressBar prgNumQuestion;
    private javax.swing.JRadioButton radOptionFour;
    private javax.swing.JRadioButton radOptionOne;
    private javax.swing.JRadioButton radOptionThree;
    private javax.swing.JRadioButton radOptionTwo;
    // End of variables declaration//GEN-END:variables
}
