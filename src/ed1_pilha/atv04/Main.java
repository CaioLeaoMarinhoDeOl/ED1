/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed1_pilha.atv04;

import java.util.Scanner;

/**
 *
 * @author caio
 */
public class Main {
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Pilha pilha = new Pilha();      
        
        System.out.println("Gostaria de escrever uma expressao para ser verificada? (sim ou nao)");
        String resposta = input.nextLine().toLowerCase();
        
        while (!resposta.equals("sim") && !resposta.equals("nao")){
                System.out.println("Nao entendi. Gostaria de escrever uma expressao para ser verificada? (sim ou nao)");
                resposta = input.nextLine();               
            }            
        
        
        while (resposta.equals( "sim")) {
        System.out.println("Digite a expressao a ser verificada: ");
        String expressao = input.nextLine();        
        
        if (pilha.verificador(expressao)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
            
            System.out.println("Voce gostaria de corrigir a expressao: " + expressao + " ? (sim ou nao)");
            resposta = input.nextLine();
            
            while(!resposta.equals("sim") && !resposta.equals("nao")){
                System.out.println("Nao entendi. Voce gostaria de corrigir a expressao: " + expressao + " ? (sim ou nao)");
                resposta = input.nextLine();               
            }            
                
            if (resposta.equals( "sim")) {

                System.out.println(pilha.corretor(expressao));
                
                }                        
            } 
        
        System.out.println("Gostaria de escrever mais alguma expressao para ser verificada? (sim ou nao)");
        resposta = input.nextLine().toLowerCase();
        
        while (!resposta.equals("sim") && !resposta.equals("nao")){
                System.out.println("Nao entendi. Gostaria de escrever mais alguma uma expressao para ser verificada? (sim ou nao)");
                resposta = input.nextLine();               
            }
        
        }                
                
        System.out.println("ENCERRANDO O PROGRAMA...");
        System.out.println("VOLTE SEMPRE...");
        }
    }   
