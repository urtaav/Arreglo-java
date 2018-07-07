package arrglos_conoperaciones;

public class ejercicio2 {

    public static void main(String[] args) {
         //===========================DECLARACION DE LOS VECTORES X,Y,C=================
        int vectorX[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int vectorY[] = {20, 29, 16, 7, 4, 33, 100, 32, 62, 71};
        int vectorC[]=new int[10];
        int num_mayores[]=new int[1];
        //===================================================================================
        
        //=============SE REALIZA EL RECORRIDO DEL VECTOR X PARA PODER SUMARLO CON EL VECTOR Y
        //=============Y ALMACENAR LA SUMA EN EL ARREGLO C====================================
        System.out.println("Los valores del vector C son: ");//MENSAJE PARA SABER LOS VALORES DEL VECTOR C
        
        for (int i = 0; i < vectorX.length; i++) {//RECORRIDO CON EL FOR PARA EL VECTOR X

            vectorC[i] = vectorX[i] + vectorY[i];//SUMA DE LO QUE HAY EN LA POSICION i DEL VECTORX y EL VECTORY Y SE GUARDA EN EL VECTORC
            
            System.out.print( vectorC[i]+ " ");//SE IMPRIME LA SUMA QUE FUE GUARDADA EN EL VECTORC
        }//CIERRE FOR
        
        
        System.out.println("\n");//IMPRIME SOLO UN SALTO DE LINEA OMITIR
        
        int suma = 0;//DECLARACION DE VARIABLE QUE ALMACENARA EL VALOR DE LA SUMA DE TODOS LOS ELEMENTOS QUE ESTAN DENTRO DEL VECTORC
  
        for (int j = 0; j < vectorC.length; j++) {//RECORREMOS EL VECTORC CON UN FOR PARA PODER REALIZAR LA SUMA DE LOS ELEMENTOS
            
            suma += vectorC[j];//SUMAMOS LOS ELEMENTOS DEL VECTORC Y LO VAMOS ALMACENANDO EN LA VARIABLE SUMA
            
        }//CIERRE FOR
       
        int promedio = suma/10;//SE REALIZA LA OPERACION PARA OBTENER EL PROMEDIO
        
        System.out.println("El promedio del vector C es:" +promedio +"\n");//SE IMPRIME EL PROMEDIO 
        
        //====================SE IMPRIMEN LOS NUMEROS MAYORES AL PROMEDIO==============================
        //=============================================================================================
        for (int k = 0; k < vectorC.length; k++) {//RECORREMOS EL VECORC PARA PODER CONOCER LOS NUMEROS MAYORES AL PROMEDIO 
            
            if (vectorC[k] > promedio) {//CONDICION IF QUE PREGUNTA SI EL VALOR DE LA POSICION k ES MAYOR AL PROMEDIO
                
                num_mayores[0] = vectorC[k];//SE VA ALMACENAR EN OTRO VECTOR
                System.out.println("El numero mayor al promedio es:"+num_mayores[0]);//SE IMPRIME LOS NUMEROS MAYORES AL PROMEDIO   
            }
            
        }
    }
}
