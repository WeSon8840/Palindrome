/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import javax.swing.*;

/**
 *
 * @author Gloria Song
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = null , backwardsWord;
        int pos;
        //Above to claim varibales of different types.
        
        String a = JOptionPane.showInputDialog("Words that are the same forwards "
                + "and backwards are called panlindromes. \n"
                + "This program determines if a words is a panlindrome.\n\n\n"
                +"Enter a word:\n" ); 
        
        backwardsWord = " ";
        for (pos = word.length() - 1; pos >= 0; pos --){
            backwardsWord += word.charAt(pos);
        }
        
        if (word.equalsIgnoreCase(backwardsWord)){
            JOptionPane.showMessageDialog(null, word +"is reverse is" + backwardsWord + ".\n" 
                 + "It is a palindrome.");
        }
        else {
            JOptionPane.showMessageDialog(null,"It is not a palindrome.");
        }
    }
    
}
