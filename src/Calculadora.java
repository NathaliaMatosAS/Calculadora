/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Calculadora {
    float x;
    float y;
    
    public Calculadora(){
        x=0;
        y=0;
    }
public float somar(){
    float soma = x+y;
    return soma;
}
public float subtrair(){
    float sub = x-y;
    return sub;
    
}
public float multiplicar(){
    float mult=x*y;
    return mult;

}
public float dividir(){
    float div=x/y;
    return div;

}
}
