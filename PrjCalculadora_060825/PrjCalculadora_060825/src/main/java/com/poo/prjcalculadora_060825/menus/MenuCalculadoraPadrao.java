/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjcalculadora_060825.menus;

import com.poo.prjcalculadora_060825.regras.RealizarOperacoes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenuCalculadoraPadrao 
{        
    public static void executar(Scanner scanner) 
    {
        RealizarOperacoes ro = new RealizarOperacoes();
        int opcao;

        do 
        {            
            System.out.print("Número 1: ");
            float nro1 = scanner.nextFloat();
            System.out.print("Número 2: ");
            float nro2 = scanner.nextFloat();
            
            System.out.println("=== MENU DE OPERACOES ===");
            System.out.println("1 - ADICAO");
            System.out.println("2 - SUBTRACAO");
            System.out.println("3 - MULTIPLICACAO");
            System.out.println("4 - DIVISAO");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> System.out.println("Resultado: "+ro.adicao(nro1, nro2)); 
                case 2 -> System.out.println("Resultado: "+ro.subtracao(nro1, nro2));
                case 3 -> System.out.println("Resultado: "+ro.multiplicacao(nro1, nro2));
                case 4 -> System.out.println("Resultado: "+ro.divisao(nro1, nro2));
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }
    
}
