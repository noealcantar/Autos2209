/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Noé
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java!!!!");
        
        Persona per1 = new Persona();
        per1.setNombre(" Noé VA ");
        System.out.println("Nombre" + per1.getNombre());
        per1.comer(" Hamburguesa!!!!");
        
        Persona per2=new Persona() ;
        per2.setNombre(" Arturo ");
        System.out.println( "Nombre per 2:" + per2.getNombre() );
        per2.comer(" Pizza Hawaiana");
      
        System.out.println("Tarea creación de objetos de Automovil");
  
        Automovil bocho=new Automovil();
       bocho.setMarca("VW");
       System.out.println("Marca" + bocho.getMarca() ); 
       bocho.setSubMarca("Sedan");
       System.out.println("SubMarca "+bocho.getSubMarca() );
       bocho.setModelo(1970);
       System.out.println("El modelo es " + bocho.getModelo() );
       bocho.setColor(Color.blue);
       System.out.println("Color " + bocho.getColor() );
       System.out.println("El automovil es un: Bocho");
       
       System.out.println("El siguiente automovil es un: ");
        
        Automovil mustang=new Automovil();
        mustang.setMarca("Ford");
        System.out.println("Marca " + mustang.getMarca() );
        mustang.setSubMarca("Mustang");
        System.out.println("SubMarca "+mustang.getSubMarca() );
        mustang.setModelo(2010);
        System.out.println("El modelo es "+ mustang.getModelo() );
        mustang.setColor(Color.yellow);
        System.out.println("Color " + mustang.getColor() );
        System.out.println("El automovil es un: Mustang");
        
       System.out.println("Y el último automovil es un: ");
      
        Automovil Akura=new Automovil ();
        Akura.setMarca("Akura");
        System.out.println("Marca " + Akura.getMarca() );
        Akura.setSubMarca("NSX");
        System.out.println("SubMarca " + Akura.getSubMarca() );
        Akura.setModelo(2013);
        System.out.println("El modelo es " + Akura.getModelo() );
         Akura.setColor(Color.gray);
        System.out.println("Color " + Akura.getColor() );
        System.out.println("El automovil es una: Akura");
        
    }

}