/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import model.library.Persona;

/**
 *
 * @author barrante
 */
public class CargarInfoPersonas {
    
    public static ArrayList<Persona> CargarInfoPersonas(String Path){
        String[] File_Body = new String[0];
        //String[] Temp_string; "C:\\Users\\barrante\\Desktop\\Personal\\Personas.txt"
        try {
            FileReader Personas_F = new FileReader(Path); 
            BufferedReader FBuffer = new BufferedReader(Personas_F);
            String s_temp = new String() ;
            int counter = 0;
            while ((s_temp = FBuffer.readLine()) != null){
                if(counter >= File_Body.length){
                    String[] Temp_string = Arrays.copyOf(File_Body,counter +1);
                    Temp_string[counter] = s_temp;
                    File_Body = Arrays.copyOf(Temp_string,counter + 1 );
                } else {
                    File_Body[counter] = s_temp;
                }
                counter++;
            }
            FBuffer.close();
        }
        catch(java.io.FileNotFoundException FNFE1) {
            System.out.println("Archivo C:\\Users\\barrante\\Desktop\\Personal\\Personas.txt No encontrado");
        }
        catch(java.io.IOException ioe1){}
        ArrayList<Persona> Personas = new ArrayList();
        for (String File_Body1 : File_Body) {
            String[] Values = File_Body1.split("\\\\/");
            Persona temp_Persona = new Persona();

            temp_Persona.setNombre(Values[0]);
            temp_Persona.setPrimerApellido(Values[1]);
            temp_Persona.setSegundoApellido(Values[2]);
            temp_Persona.setTipo(Values[3]);
            temp_Persona.setEmail(Values[5]);
            //temp_int = Integer.parseInt(Values[4]);
            temp_Persona.setTelefono(Values[4]);
            Personas.add(temp_Persona);
        }
        return Personas;
    }
}
