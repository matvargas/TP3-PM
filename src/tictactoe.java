/**
 * Tic Tac Toe
 * Programação Modular - UFMG
 * Matheus Filipe Sieiro Vargas
 * 2014144812
 * Classe de tratamento da interface gráfica.
 */


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
            button1.setText(main.playerMark);
            main.alreadyFilled.add(1);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        if(button2.getText().equals("")) {
            button2.setText(main.playerMark);
            main.alreadyFilled.add(2);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }

    }

    private void button3ActionPerformed(ActionEvent e) {
        if(button3.getText().equals("")) {
            button3.setText(main.playerMark);
            main.alreadyFilled.add(3);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button4ActionPerformed(ActionEvent e) {
        if(button4.getText().equals("")) {
            button4.setText(main.playerMark);
            main.alreadyFilled.add(4);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button5ActionPerformed(ActionEvent e) {
        if(button5.getText().equals("")) {
            button5.setText(main.playerMark);
            main.alreadyFilled.add(5);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button6ActionPerformed(ActionEvent e) {
        if(button6.getText().equals("")) {
            button6.setText(main.playerMark);
            main.alreadyFilled.add(6);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button7ActionPerformed(ActionEvent e) {
        if(button7.getText().equals("")) {
            button7.setText(main.playerMark);
            main.alreadyFilled.add(7);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button8ActionPerformed(ActionEvent e) {
        if(button8.getText().equals("")) {
            button8.setText(main.playerMark);
            main.alreadyFilled.add(8);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
        }
    }

    private void button9ActionPerformed(ActionEvent e) {
        if(button9.getText().equals("")) {
            button9.setText(main.playerMark);
            main.alreadyFilled.add(9);
            main.verifyEndGame(main.playerMark);
            this.markCell(main.cp.computeNewPlay(main.alreadyFilled));
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

        setTitle("Tic-Tac-Toe");
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
        } else if (mark == "draw") {
            JOptionPane.showMessageDialog(this, "Empate!");
        } else {
            JOptionPane.showMessageDialog(this, "O Computador venceu, mais sorte na próxima!");
        }

        main.finishGame();
    }

    public void markCell(int cell){
        System.out.println("Computer has chosen : " + cell);
        main.alreadyFilled.add(cell);

            if(cell == 1) {
                button1.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 2) {
                button2.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 3) {
                button3.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 4) {
                button4.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 5) {
                button5.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 6) {
                button6.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 7) {
                button7.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 8) {
                button8.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            } else if (cell == 9) {
                button9.setText(main.computerMark);
                Main.verifyEndGame(main.computerMark);
            }
    }

}