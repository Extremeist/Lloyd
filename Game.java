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
public abstract class Game {
    protected String input;
    protected String output;
    protected String instructions;
    
    public abstract void initialise();
    public abstract void instructions();
    
    public void setInput(String input){
        this.input = input;
    }
    public abstract void checkGuess();
    
    public void output(){
        System.out.println(output);
    }
    public final void play(String input){
        initialise();
        instructions();
        setInput(input);
        checkGuess();
        output();
    }
    
}
