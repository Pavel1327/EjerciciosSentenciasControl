/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Pais;



/**
 *
 * @author ASUS
 */
public class Aplicacion {
    public static void main(String[] args) {
        Pais pais1= new Pais("p001","Argentina");
        Pais pais2= new Pais("p001","Brasil"); 
        Pais pais3= new Pais("p001","Bolivia");
        Pais pais4= new Pais("p001","Chile");
        
        //System.out.println(pais1.getCodigoPais()+" - "+pais1.getNombrePais());
        System.out.println(pais2.toString());
    }
}
