
package arrglos_conoperaciones;

import java.util.Scanner;

public class ejercicio3 {
    
        
    public static void main(String[] args) {
        
        Scanner entrada1 = new Scanner(System.in);//INSTANCIAR OBJETO DE TIPO SCANNER PARA PODER CAPTURAR LO QUE ESCRIBE EL USUARIO
            int vendedores = 0;//VARIABLE QUE ALMACENARA EL NUMERO DE VENDEDORES INSERTADOS POR EL USUARIO
            System.out.println("=================================================");//OMITIR SOLO ES UN MENSAJE 
            System.out.println("Por favor ingresa el numero de vendedores!!!");//MENSAJE QUE PIDE LA INSERCCION DE UN NUMERO DE VENDEDORES
            vendedores=entrada1.nextInt();//SE ALMACENA EL NUMERO DE VENDEDORES QUE SE HAYA INSERTADO
            System.out.println("==================================================");//OMMITIR SOLO ES UN SIMPLE MENSJE
             
             int [][] arreglo3 = new int[vendedores][12];//ARREGLOS PARA ALMACENAR LOS VENDEDORES Y LOS MESES
             String  meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};

             int totVent [] = new int[vendedores];//ARREGLO QUE ALMACENARA EL TOTAL DE LAS VENTAS 
             int MaxVent [] = new int[vendedores];//ARREGLO QEU ALMACENARA EL MAXIMO DE LAS VENTAS   
             int MinVent [] = new int[vendedores]; //ARREGLO QUE ALMACENARA EL MINIMO DE VENTAS
             int i,j,Total;//VARIABLES A UTILIZAR EN LOS BUCLES Y OPERACIONES
             
             
              Scanner entrada = new Scanner(System.in);//INSTANCIAR OBJETO DE TIPO SCANNER PARA PODER CAPTURAR LO QUE ESCRIBE EL USUARIO
             for ( i = 0; i < vendedores; i++) {//CON UN FOR SE RECORRE EL NUMERO DE VENDEDORES 
            
                 System.out.println("=== Vendedor -->( "+(i+1)+" )<-- ===");//MENSAJE PARA SABER A QUE VENDEDOR SE LE VAN A AGREGAR LAS VENTAS
                 Total = 0;//VARIABLE INICIALIZADA EN CERO PARA DESPUES SER UTILIZADA
                 for ( j = 0; j < meses.length; j++) {//SE UTILIZA UN SEGUNDO BUCLE FOR DENTRO DEL OTRO PARA PODER MOSTRAR LOS MESES
                     
                     System.out.println("   == Ventas de "+meses[j]+" ==   ");//SE IMPIMEN LOS MESES
                     System.out.println("Ingrese el monto de la venta");//SE MUESTRA EL MENSAJE PARA INGRESAR LAS VENTAS DEL MES
                     int lim=entrada.nextInt();//SE CAPTURA LO QUE DIGITE EL USUARIO
                    arreglo3[i][j]=lim;//SE INSERTA LO QUE SE TECLEO EN EL ARREGLO DE ACUERDO ALA POSICION DE VAYA RECORRIENDO EL FOR
                     Total = Total + arreglo3[i][j] ;//SE OBTIENE LA SUMA TOTAL DE LAS VENTAS DE CADA VENDEDOR
                 }
                 totVent[i]=Total;//SE ALMACENAN LAS VENTAS EN EL ARRAY PARA EL TOTAL DE VENTAS
                System.out.println();//SOLO IMPRIME UN ESPACIO
             }
                            // Calculamos los valores Maximos y minimos de cada vendedor
                for (i=0;i<vendedores;i++)//SON ESTE FOR RECORREMOS LOS VENDEDORES PARA PODER ALMACENAR SUS VENTAS MAXIMAS Y MINIMAS EN LOS RESPECTIVOS ARREGLOS
                {
                   MaxVent[i] = arreglo3[i][0]; 
                   MinVent[i] = arreglo3[i][0];  
                   for (j=1;j<meses.length;j++)//
                   {
                      if (arreglo3[i][j]>MaxVent[i])
                      {
                         MaxVent[i] = arreglo3[i][j];     
                      }
                      if (arreglo3[i][j]<MinVent[i])
                      {
                         MinVent[i] = arreglo3[i][j];    
                      }           
                   }
                }
                
             
                        // Mostramos en pantalla el total de ventas de cada vendedor 
                   for (i=0;i<vendedores;i++)
                   {

                       System.out.println("El total de ventas del vendedor " +(i+1)+" es:" +totVent[i]);
                       
                   }
                    System.out.println("********************************");
                    
                    
                    // Mostramos el Maximo vendido por cada vendedor
                   for (i=0;i<vendedores;i++)
                   {

                      System.out.println("El maximo vendido del vendedor " +(i+1)+" es:" +MaxVent[i]);
                   }
                    System.out.println("********************************");

                    // Mostramos el minimo vendido por cada vendedor
                   for (i=0;i<vendedores;i++)
                   {

                     System.out.println("El minimo vendido del vendedor" +(i+1)+" es:" +MinVent[i]);   

                   }
           
    }
}