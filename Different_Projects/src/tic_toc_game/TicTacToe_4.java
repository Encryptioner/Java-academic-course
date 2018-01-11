/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tic_toc_game;

     
    import javax.swing.JFrame;
     
    /**
     * This is a simple little TicTacToe game.
     */
    public class TicTacToe_4//TicTacToeFrame.java
    {
        public static void main(String[] args)
        {
            JFrame ticTacToe = new TicTacToeFrame();
            ticTacToe.setTitle("Phantom TicTacToe Game!");
            ticTacToe.setSize(600, 600);
            ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ticTacToe.setLocationRelativeTo(null);
            ticTacToe.setVisible(true);
        }
    } // end class TicTacToe

