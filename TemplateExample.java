/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexample;

import javax.swing.JOptionPane;

/**
 *
 * @author fsheridan
 */
public class TemplateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String arr[] = {"house","apple","rose", "dog","banana","flower","college","java","computer","code"};
        Game game = new Hangman(arr);
        String input = JOptionPane.showInputDialog(null,"Enter your first letter guess");
        game.play(input);*/
        Game game = new CrackTheCode();
        String input = JOptionPane.showInputDialog(null,"Enter your first number guess");
        game.play(input);
    }

}
