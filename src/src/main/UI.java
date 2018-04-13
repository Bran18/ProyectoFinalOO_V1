/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main;


import java.io.*;
import src.conection.Conector;
import static src.conection.Conector.listContact;
import src.controller.Controller;
import src.proyecto.logic.Contactos;

public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Controller c = new Controller();

    public static void main(String[] args) {
        try {
            Contactos c = new Contactos();
            c.setCorreo("bfernandez@gmail.com");
            c.setIdentificacion("115790860");
            c.setNombre("Jupi");
            c.setPuesto("N1");
            c.setTelefono("61316145");
            c.setTipo("2");

            Conector cone = new Conector();

            cone.insertContact(c);
            listContact();

        } catch (Exception e) {
        }
    }

    public static void registrarEmpresa() throws Exception {//cambiarlo como el metodo para agregar
       
        
        String razonSocial="sdjklsa"; 
        String cedulaJuridica="1234546"; 
        String ubicacion="San josé" ;
        String direccion ="Mozotal Guadalupe";
        String logo="www.images.com";
        String telefono="6321372";
        
        
      c.registrarEmpresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);
        
    }

}
