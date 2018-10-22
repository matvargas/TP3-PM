import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;


public class tictactoe extends JFrame {

    Main main = new Main();

    public tictactoe() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        if(button1.getText().equals("")) {
            if (main.isPlayerTurn){
                button1.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button1.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        if(button2.getText().equals("")) {
            if (Main.isPlayerTurn){
                button2.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button2.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button3ActionPerformed(ActionEvent e) {
        if(button3.getText().equals("")) {
            if (Main.isPlayerTurn){
                button3.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button3.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button4ActionPerformed(ActionEvent e) {
        if(button4.getText().equals("")) {
            if (Main.isPlayerTurn){
                button4.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button4.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button5ActionPerformed(ActionEvent e) {
        if(button5.getText().equals("")) {
            if (Main.isPlayerTurn){
                button5.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button5.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button6ActionPerformed(ActionEvent e) {
        if(button6.getText().equals("")) {
            if (Main.isPlayerTurn){
                button6.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button6.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button7ActionPerformed(ActionEvent e) {
        if(button7.getText().equals("")) {
            if (Main.isPlayerTurn){
                button7.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button7.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button8ActionPerformed(ActionEvent e) {
        if(button8.getText().equals("")) {
            if (Main.isPlayerTurn){
                button8.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button8.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void button9ActionPerformed(ActionEvent e) {
        if(button9.getText().equals("")) {
            if (Main.isPlayerTurn){
                button9.setText(main.playerMark);
                Main.verifyEndGame(main.playerMark);
                Main.isPlayerTurn = false;
            } else {
                button9.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
                Main.isPlayerTurn = true;
            }
        }
    }

    private void initComponents() {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        setTitle("Tic Tac Toe");
        Container contentPane = getContentPane();

        button1.setText("");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        button2.setText("");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2ActionPerformed(e);
            }
        });

        button3.setText("");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3ActionPerformed(e);
            }
        });

        button4.setText("");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4ActionPerformed(e);
            }
        });

        button5.setText("");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5ActionPerformed(e);
            }
        });

        button6.setText("");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6ActionPerformed(e);
            }
        });

        button7.setText("");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7ActionPerformed(e);
            }
        });

        button8.setText("");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8ActionPerformed(e);
            }
        });

        button9.setText("");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;

    public void showWinner(String mark){
        if(mark == "X"){
            JOptionPane.showMessageDialog(this, "Parabéns! Você venceu o game!");
        } else {
            JOptionPane.showMessageDialog(this, "O Computador venceu, mais sorte na próxima!");
        }
    }

}