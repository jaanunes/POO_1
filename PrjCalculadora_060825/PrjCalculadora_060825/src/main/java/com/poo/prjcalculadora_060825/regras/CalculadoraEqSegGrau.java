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
public class CalculadoraEqSegGrau 
{
    public void calcularDelta(DadosEntrada de, DadosSaida ds)
    {
        ds.setDelta((de.getB()*de.getB()) - (4*de.getA()*de.getC()));
    }
    
    public void calcularX1L(DadosEntrada de, DadosSaida ds)
    {
        ds.setX1L((float)((-de.getB()) + Math.sqrt(ds.getDelta())) / (2*de.getA()));
    }
    
    public void calcularX2L(DadosEntrada de, DadosSaida ds)
    {
        ds.setX2L((float)((-de.getB()) - Math.sqrt(ds.getDelta())) / (2*de.getA()));
    }
    
    public void calcularXv(DadosEntrada de, DadosSaida ds)
    {
        ds.setxV((-de.getB()) / (2*de.getA()));
    }
    
    public void calcularYv(DadosEntrada de, DadosSaida ds)
    {
        ds.setyV((-ds.getDelta()) / (4*de.getA()));
    }
}
