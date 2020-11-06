/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexample;

/**
 *
 * @author fsheridan
 */
public class Hangman extends Game {
    private String secret;
    private String[] words;
    private char guess;
    
    public Hangman(String words[]){
        this.words = words;
    }
    
    @Override
    public void initialise(){
        secret = words[(int)Math.floor(Math.random()*10)];
    }
    @Override
    public void instructions(){
        System.out.println("How to play the game...");
    }
   
    @Override
    public void checkGuess(){
        System.out.println(guess);
        System.out.println(secret);

        guess = input.charAt(0);
        for(int i = 0; i < secret.length();i++){
            if(secret.charAt(i)==guess){
                output = "You guessed, correctly, that is the letter at position "+(i+1)+" in the secret word";
            }
            else{
                output = "Sorry, that guess is incorrect";
            }
        }
    }
}
