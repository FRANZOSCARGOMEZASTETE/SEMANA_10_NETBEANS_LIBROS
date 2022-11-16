/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_10_netbeans_libros;
import java.util.Random;
/**
 *
 * @author Franz
 */
public class EJERCICIO_8_1 {
class Nodo { 
    int dato; 
    Nodo enlace;
    public Nodo(int x){
        dato = x;
        enlace = null;
    }
    
    public int getDato(){
        return dato;
    }
    
    public Nodo getEnlace(){
        return enlace;
    }
    
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    } 
}

class Lista{
    protected Nodo primero;
    
    public Lista(){
        primero = null;
    }
    
    public Lista insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero; 
        primero = nuevo;
        return this;
    }
    
    public void visualizar(){
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null){
            System.out.print(n.dato + " ");
            n = n.enlace;
            k++;
            System.out.print( (k%15 != 0 ? " " : "\n"));
        } 
    } 
}

public class ejercicio_8_1 {
    public static void main(String [] a){
        Random r;
        int d;
        Lista lista;
        int k;
        r = new Random(); 
        lista = new lista();// crea lista vacía
        
        k = Math.abs(r.nextInt()% 55); // número de nodos 
// se insertan elementos en la lista
        for (; k > 0; k-- ){
            d = r.nextInt() % 99 ;
            lista.insertarCabezaLista(d);
        }
        // recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar(); 
    }
}  
}
