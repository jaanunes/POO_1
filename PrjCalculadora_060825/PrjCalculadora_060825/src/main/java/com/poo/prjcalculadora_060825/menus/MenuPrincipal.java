/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjcalculadora_060825.menus;

import com.poo.prjcalculadora_060825.objetos.DadosAreaTriangulo;
import com.poo.prjcalculadora_060825.objetos.DadosEntrada;
import com.poo.prjcalculadora_060825.objetos.DadosSaida;
import com.poo.prjcalculadora_060825.regras.CalculoAreaTriangulo;
import com.poo.prjcalculadora_060825.regras.RealizarCalculoEqSegGrau;
import com.poo.prjcalculadora_060825.regras.RealizarOperacoes;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenuPrincipal 
{
    public static void menuPrincipal()
    {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0){
            System.out.println("====== MENU PRINCIPAL ======");
            System.out.println("1 - Calculadora Padrao");
            System.out.println("2 - Calculadora Equacao do Segundo grau");
            System.out.println("3 - Calculadora Area do Triangulo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> MenuCalculadoraPadrao.executar(scanner);
                case 2 -> {
                    DadosEntrada de = new DadosEntrada();
                    System.out.print("A: ");
                    de.setA(scanner.nextFloat());
                    System.out.print("B: ");
                    de.setB(scanner.nextFloat());
                    System.out.print("C: ");
                    de.setC(scanner.nextFloat());
                    new RealizarCalculoEqSegGrau().realizarCalculo(de);                    
                }
                case 3 -> {
                    DadosAreaTriangulo dat = new DadosAreaTriangulo();
                    System.out.print("Base: ");
                    dat.setBase(scanner.nextFloat());
                    System.out.print("Altura: ");
                    dat.setAltura(scanner.nextFloat());
                    new CalculoAreaTriangulo().calcularArea(dat);
                    System.out.println("Resultado: "+dat.getArea());
                }
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opcao invalida.");
            }
        }
        scanner.close();
    }
    
}
