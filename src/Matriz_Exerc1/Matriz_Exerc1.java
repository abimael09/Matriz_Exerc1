package Matriz_Exerc1;

import javax.swing.*;

public class Matriz_Exerc1 {

    public static void main(String[] args) {
        
        //Questão_1
        int[][] repNumero = new int[4][3];
        
        int i, j;
        for(i = 0; i < repNumero.length; i++){
            for(j = 0; j < repNumero[i].length; j++){
                repNumero[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número"));
                System.out.print("n = "+ repNumero[i][j]+"\t");
            }
            
            System.out.println("\n");
            
        }
        
        int cont = 0;
        for(i = 0; i < repNumero.length; i++){
            for(j = 0; j < repNumero[i].length; j++){
                if(repNumero[i][j] == 55){
                    System.out.println((cont + 1) + " vezes -> "+ repNumero[i][j]);
                    cont++;
                } 
            } 
        }
         
    }
    
}
