/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjcalculadora_060825.regras;

import com.poo.prjcalculadora_060825.objetos.DadosEntrada;
import com.poo.prjcalculadora_060825.objetos.DadosSaida;

/**
 *
 * @author clc
 */
public class RealizarCalculoEqSegGrau 
{    
    public DadosSaida realizarCalculo(DadosEntrada de)
    {
        CalculadoraEqSegGrau calcSegGrau = new CalculadoraEqSegGrau();
        
        DadosSaida ds = new DadosSaida();        
        
        calcSegGrau.calcularDelta(de, ds);
        
        System.out.println("Delta: "+ ds.getDelta());
        
        if(ds.getDelta()<0)
        {
            System.err.println("Delta menor que zero. Não há raizes reais.");            
        }
        else
        {
            calcSegGrau.calcularX1L(de, ds);
            calcSegGrau.calcularX2L(de, ds);
            System.out.println("X': "+ ds.getX1L());
            System.out.println("X'': "+ ds.getX2L());
        }
        calcSegGrau.calcularXv(de, ds);
        calcSegGrau.calcularYv(de, ds);
        System.out.println("Xv: "+ ds.getxV());
        System.out.println("Yv: "+ ds.getyV());
        
        return ds;
    }
    
}
