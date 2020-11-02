
/******************** CLASE LEE ************************
**                                                   ***
** Autor: David Carmona Montaño                      ***
**       iscdcm.com                                  ***
** Fecha: 02 de Noviembre 2020                       ***
** Descripcion: Clase para facilitar la lectura      ***
                de datos por teclado en aplicaciones ***
                java simples.                        ***
          Metodos:                                   ***
            -leerInt()                               ***
            -leerFloat()                             ***
            -leerDouble()                            ***
            -leerString()                            *** 
            -leerChar()                              ***        
*********************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee
 {
  public static BufferedReader t = new BufferedReader(new
  InputStreamReader(System.in))  ;
  
  //Metodos
   public int leerInt()
   {
    int resultado = 0 ;
    try
    {
     resultado = Integer.parseInt( t.readLine() ) ;
    }
     catch(IOException e)
     {
      System.out.println("Error : "+e);
      java.lang.System.exit(1); 
     }
     return resultado ;
   }
   
  public float leerFloat()
   {
    float resultado = (float) 0.0 ;
    try
    {
     Float f = new Float( t.readLine() );
     resultado = f.floatValue() ;
    }
     catch(IOException e)
      {
      System.out.println("Error : "+e);
      java.lang.System.exit(1);
      }
      return resultado ;
   }

  public double leerDouble()
   {
    double resultado = 0.0;
    try
     {
      Double d = new Double(t.readLine() ) ;
      resultado = d.doubleValue() ;
     }
      catch(IOException e)
       {
        System.out.println("Error : "+e);
        java.lang.System.exit(1);
       }
       return resultado ;
   }

   public String leerString()
   {
    String resultado = new String() ;
    try
     {
      resultado = t.readLine() ;
     }
      catch(IOException e)
       {
        System.out.println("Error : "+e);
        java.lang.System.exit(1);
       }
       return resultado ;
   }

  public char leerChar(){
    char c = leerString().charAt(0);
    return c;
  }

 }     
      


