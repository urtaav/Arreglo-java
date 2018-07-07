
package arrglos_conoperaciones;


public class ejercicio1 {

    public static void main(String[] args) {
        
               //DECLARAR ARRAY CON 30 VALORES
        int numeros []  = {10,9,8,7,6,5,4,3,2,1,
                           11,22,33,44,55,66,77,88,99,20,
                           21,22,23,24,25,26,27,28,29,30};
        //VECTOR QUE ALMACENARA LOS VALORES MAYORES AL PROMEDIO
        int num_mayores [] = new int[11];
        //VARIABLE QUE GURDARA LA SUMA DE LOS VALORES
        int suma=0;
        //FOR PARA RECORRER EL VETOR CON LOS VALORES
        for (int i = 0; i < numeros.length; i++) {
            
            suma += numeros[i];//SE VA REALIZANDO LA SUMA POR CADA VUELTA DEL FOR
        }
        
        int promedio = suma/30;//SE REALIZA LA OPERACION PARA SABER EL PROMEDIO Y GURDARLO EN LA VARIABLE PROMEDIO
        
        System.out.println("El promedio es:" + promedio+"\n");//SE IMPRIME EL PROMEDIO
        
        for (int j = 0; j < numeros.length; j++) {//FOR PARA RECORRER EL VECTOR CON LOS VALORES Y ASI PODER CONOCER LOS NUMEROS MAYORES
            
            
  
                if(numeros[j] > promedio){//CONDICIONAL PARA SABER SI EXITEN NUMEROS MAYORES AL PROMEDIO
                    
                    num_mayores[0]=numeros[j];//GUARDAMOS LOS NUMEROS MAYORES EN EL ARREGLO QUE ESTABA VACIO
                    
                    System.out.println("los numeros mayores al promedio son " + num_mayores[0]+" ");//SE IMPRIMEN LOS NUMEROS MAYORES
                }
        }
    }  
}

