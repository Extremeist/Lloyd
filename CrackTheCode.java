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
public class CrackTheCode extends Game{
    private int[] secretCode;
    private int guess;
    
    public CrackTheCode(){
        secretCode = new int[5];
    }
    
    @Override
    public void initialise(){
        
        for(int i = 0; i < secretCode.length;i++){
            secretCode[i] =(int)Math.floor(Math.random()*10);
            System.out.println(secretCode[i]);
            
        }
    }
    
    @Override
    public void instructions(){
        System.out.println("How to play the game...");    
    }
    
    @Override
    public void checkGuess(){
        guess = Integer.parseInt(input);
        for(int i = 0; i < secretCode.length;i++){
            if((secretCode[i]==guess)){
                output = "You guessed, correctly, that is the number at position "+(i+1)+" in the secret code";
            }
            else{
                output = "Sorry, you guessed incorrectly";
            }
        }
    }
    //hello
    
}
