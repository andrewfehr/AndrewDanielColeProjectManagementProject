/*
December 17th 2021 Andrew, Cole, Daniel
Test Menu Window for the Project Management Project
It tests the user with ten multiple choice questions so that she can test her knowledge of SDLC
 */
package andrewdanielcoleprojectmanagementproject;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author colem
 */
public class TestMenu extends javax.swing.JFrame {
    MainMenu mainMenu;
    private TestResult testResult;
    public static int numQuestion; 
    public static Quiz[] qz = new Quiz[10]; //Array of the Quiz object, length = 10
    
    /**
     * This method scans the file that contains questions and answers, and save them in the Quiz Array.
     */
    private void scanFile()
    {
        try{
            InputStream file = StudyMenu.class.getResourceAsStream("questions & answers.txt"); //find the file
            Scanner scan = new Scanner(file); //Scanner object that will scan the file
            
            String question; 
            int answer;
            String[] answerOptions = new String[4]; //String array that will contain the answer options of MC questions
            
            for(int n=0; n<10; n++) //loop 10 times since the test will have 10 questions
            {
                question = scan.nextLine(); //scan question
                for(int i=0; i<4; i++) //loop 4 times since a question will have 4 multiple choice options
                {
                    answerOptions[i] = scan.nextLine(); //scan answer options
                }
                answer = Integer.parseInt(scan.nextLine()); //scan the correct answer
                
                qz[n] = new Quiz(n+1, question, answerOptions.clone(), answer); //instantiate new Quiz object and save it in qz array.
            }
        }catch(Exception e) //if the program cannot find the file
        {
            JOptionPane.showMessageDialog(null, "Error: quiz questions file not found"); //print the error
        }
    }
    
    /**
     * This method displays a question and answer options on the JFrame.
     */
    public void display() 
    {
        int numQ = qz[numQuestion].getNumQuestion(); //numQ is numQuestion+1. It's because numQuestion is the index of qz array (0~9), while numQ is the actual question number(1~10)
        btnQuestion.setText(numQ + ". " + qz[numQuestion].getQuestion());  // display the question number and the question
        radOptionOne.setText(qz[numQuestion].getAnswerOption(1)); //display the answer option 1 of the question
        radOptionTwo.setText(qz[numQuestion].getAnswerOption(2)); //display the answer option 2 of the question
        radOptionThree.setText(qz[numQuestion].getAnswerOption(3)); //display the answer option 3 of the question
        radOptionFour.setText(qz[numQuestion].getAnswerOption(4)); //display the answer option 4 of the question
        prgNumQuestion.setValue((numQ*10)); //setValue of the progress bar so that the user can see the progress percentage easily
        lblNumQuestion.setText("Question: " + numQ + "/10"); //tells which question the user is in
        
        if(numQ == 10) //check if the question number is 10
        {
            btnNext.setText("Done"); //change the button text "Next" to "Done"
        }
        else // if it is below 10
        {
            btnNext.setText("Next"); //change the button text "Done" to "Next"
        }
    }
    /**
     * Creates new form TestMenu
     * @param m
     */
    public TestMenu(MainMenu m) {
        initComponents();
        mainMenu = m; //set main menu
        scanFile(); //scans the file
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
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnMainMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMainMenu.setText("menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnQuestion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnQuestion.setText("Question");

        btngroupAnswerOptions.add(radOptionOne);
        radOptionOne.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        radOptionOne.setSelected(true);
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
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

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
    /**
     * If the user click the main menu button.
     * @param evt - click the main menu button
     */
    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        mainMenu.setVisible(true); //open main menu
        this.setVisible(false); //set this form invisible
    }//GEN-LAST:event_btnMainMenuActionPerformed
    /**
     * When the Next button is pressed
     * @param evt - Next button is pressed
     */
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int userAnswer = 0; 
        
        if(radOptionOne.isSelected()) //if the user select the first option
        {
            userAnswer = 1; 
        }
        else if(radOptionTwo.isSelected())//if the user select the second option
        {
            userAnswer = 2;
        }
        else if(radOptionThree.isSelected())//if the user select the third option
        {
            userAnswer = 3;
        }
        else if(radOptionFour.isSelected())//if the user select the fourth option
        {
            userAnswer = 4;
        }
        
        if (numQuestion <= 9) //if the question number is below or equal to 9 
        {
            qz[numQuestion].setUserAnswer(userAnswer); //save the user answer in the object
            numQuestion++; //increase the question number by 1
        }
        
        if(numQuestion > 9) //if the question number is out of the range (= over 9)
        {
            if(testResult == null) // if the result menu isn't made yet
            {
                testResult = new TestResult(mainMenu); //creates it
            }
            testResult.setVisible(true); //make it visible
            this.setVisible(false); //make this window invisible
        }
        else // if the question number is not out of the range (= below or equal to 9)
        {
            display(); //display the question
        }
    }//GEN-LAST:event_btnNextActionPerformed
    /**
     * if this window is activated (visible)
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        numQuestion = 0;  //initialize the question number
        display(); //display it
    }//GEN-LAST:event_formWindowActivated

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
