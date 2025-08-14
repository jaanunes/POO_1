/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjcalculadora_060825.regras;

import com.poo.prjcalculadora_060825.objetos.DadosAreaTriangulo;

/**
 *
 * @author user
 */
public class CalculoAreaTriangulo 
{
    public void calcularArea(DadosAreaTriangulo dat)
    {
       dat.setArea((dat.getBase()*dat.getAltura()) / 2);
    }    
}
