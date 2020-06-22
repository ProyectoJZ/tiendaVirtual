/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_virtual;
import java.io.*;
/**
 *
 * @author Trabajo
 */
public class GestionA {
    FileInputStream entrada;
    FileOutputStream salida;
    File fichero;
    
    public GestionA(){
        
    }
    
    //Metodo de apertura del fichero de texto.
    public String AbrirTexto(File fichero){
        String contenido="";
        try {
            entrada = new FileInputStream(fichero);
            int ascci;
            
            while ((ascci = entrada.read())!= -1) {
                    char caracter = (char)ascci;
                    contenido += caracter;
            }
        } catch (Exception e) {
        }
        return contenido;
        
    }
    
    //Guardar Archivo de Texto
    public String  GuardarTexto(File fichero, String contenido){
        String respuesta = null;
        
        try {
            salida = new FileOutputStream(fichero);
            byte[] byteText = contenido.getBytes();
            salida.write(byteText);
            
            respuesta = "Se ha guardado con exito el archivo";
            
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    //Procedimiento para abrir la imagen
    public byte[] AbrirImagen(File fichero){
        byte[] bytesImg = new byte[1024*1000];
        try {
            entrada = new FileInputStream(fichero);
            entrada.read(bytesImg);
        } catch (Exception e) {
        }
        
        return bytesImg;
    }
    
    /*Guardar Imagen*/
    public String GuardarAimagen(File fichero, byte[] bytesImg){
        String respuesta = null;
        try {
            salida = new FileOutputStream(fichero);
            salida.write(bytesImg);
            respuesta ="La imagen se guardado con exito";
        } catch (Exception e) {
        }
        return respuesta;
        
    }
    
    
    }
