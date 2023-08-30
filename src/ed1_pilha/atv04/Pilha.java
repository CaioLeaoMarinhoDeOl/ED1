/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_pilha.atv04;
import java.util.Stack;
/**
 *
 * @author caio
 */
public class Pilha {
        
    public static boolean verificador(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char expressaochar : expressao.toCharArray()) {
            if (expressaochar == '(') {
                pilha.push(expressaochar);
            }            
            
            else if (expressaochar == ')') {
                if (pilha.isEmpty() || pilha.pop() != '(') {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public static String corretor(String expressao) {
        StringBuilder expressaocorreta = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        for (char expressaochar : expressao.toCharArray()) {
            if (expressaochar == '(') {
                pilha.push(expressaochar);
            } else if (expressaochar == ')') {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                } else {
                    expressaochar = '(';
                }
            }
            expressaocorreta.append(expressaochar);
        }

        while (!pilha.isEmpty()) {
            expressaocorreta.append(')');
            pilha.pop();
        }
        return expressaocorreta.toString();
    }    
    
}
