/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjtestelistapoo_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author iftm
 */
public class ComparacoesListas 
{
    public void compArrayList_LinkedList()
    {
        int tamanho = 100000;
        
        List<Integer> arrayList = new ArrayList();
        for(int i = 0; i < tamanho; i++)
        {
            arrayList.add(i);
        }
        
        long inicioArrayList = System.currentTimeMillis();
        for(int i=0; i < 1000; i++)
        {
            arrayList.remove(0);
        }
        long fimArrayList = System.currentTimeMillis();
        System.out.println("Tempo de remocao no ArrayList: " + (fimArrayList - inicioArrayList) + "ms");
        
        List<Integer> linkedList = new LinkedList<>();
        for(int i =0; i < tamanho; i++)
        {
            linkedList.add(i);
        }
        
        long inicioLinkedList = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++)
        {
            linkedList.remove(0);
        }
        
        long fimLinkedList = System.currentTimeMillis();
        System.out.println("Tempo de remocao no LinkedList: "+ (fimLinkedList - inicioLinkedList) + "ms");
       
    }
    
    private static final int NUM_ELEMENTOS = 100000;
    private static final int NUM_OPERACOES_ACESSO = 10000;
    //private static final int NUM_OPERACOES_REMOCAO = 1000;
    
    public void comparacaoGeralList()
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        for(int i=0; i < NUM_ELEMENTOS; i++)
        {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("Listas inicializadas com " + NUM_ELEMENTOS + "elementos.");
        System.out.println("--------------------------");
        
        acessoPorIndice(arrayList, "ArrayList");
        acessoPorIndice(linkedList, "LinkedList");  
    }
    
    private void acessoPorIndice (List<Integer> lista, String nome)
    {
        long inicio = System.currentTimeMillis();
        Random random = new Random();
        for(int i = 0; i < NUM_OPERACOES_ACESSO; i++)
        {
            int indice = random.nextInt(NUM_ELEMENTOS / 2) + NUM_ELEMENTOS / 4;
            lista.get(indice);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de acesso em " + nome + ": " + (fim - inicio) + "ms");
    }
    
}
