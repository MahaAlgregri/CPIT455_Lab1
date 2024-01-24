/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 00019572
 */
public class Calculator {
    int a;
    int b;

    public Calculator() {
    }
    
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int sum(){
        return this.a + this.b;
    }
    
    public int sub(){
        return this.a - this.b;
    }
    
    public int muliply(){
        return this.a * this.b;
    }
    
    public int division(){
        return this.a / this.b;
    }
    
    public boolean isEven(int x){
        if (x % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
}
