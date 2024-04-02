/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s4_grupo_5;

import java.util.Scanner;

/**
 *
 * @author fuent
 */
public class Exp2_S4_Grupo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada
        System.out.println("Bienvenido a la pagina web del teatro Moro.");
        Scanner entrada=new Scanner(System.in);
        int i; //defino "i" como mi primera variable iteraria de tipo int.
        //establezco mi primer ciclo iteririo Do-While.
        do{
            System.out.println("Por favor elige una opción");
            System.out.println("1-Comprar una entrada");
            System.out.println("2-Salir");
            i=entrada.nextInt();
        switch (i){
            case 1 -> System.out.println("Has elegido comprar entrada");
            case 2 -> System.out.println("Has elegido salir");
            default -> System.out.println("Opcion invalida");
        }
        }while (i>2); //la condicional de mi variable iterativa será que esta dejara de ejecutarse siempre que i sea mayor que "2" numero de opciones dispobles.
        
        //defino mis variables
        String pa,pb,p, ubicacionSeleccionada = null;
        int ubicacion = 0;
        int ppb = 0,ppa = 0,pp = 0, tarifaUbicacion=0, edad = 0,tarifaFinal = 0;
        
        
        // establezco las ubicaciones.
        pa="Platea Alta";
        pb="platea baja";
        p="palcos";
        //Se conservan los precios de la evaluación sumativa.
        ppb=19000; //precio platea baja.
        ppa=11000; //precio platea alta.
        pp=7200; //precio palcos.
        
        //con una estructura condicional solicito la ubicación del teatro seleccionada por el cliente.
        //como es solicitado en la pauta de evaluación.
        //con la variable iterativa "i" realizo la condición if.
        if(i==1){
           System.out.println("El teatro Moro cuenta con entradas con las siguientes ubicaciones: platea alta, platea baja y palcos.");
           System.out.println("Los precios varian segun ubicación seleccionada.");
           System.out.println("El plano del teatro se distribuye en zonas A,B y C segun ubicación.");
           System.out.println("Por favor ingrese ubicación deseada");
           System.out.println("1.-platea baja: $19000 pesos - Zona A.");
           System.out.println("2.-platea alta: $11000 pesos - Zona B.");
           System.out.println("3.-palcos: $7200 pesos - Zona C.");
           ubicacion=entrada.nextInt(); 
        } else {   
            System.out.println("Hasta pronto.");
        //con la variable ubicación de tipo int, realizo la condicional if, else if anidada.
        } if(ubicacion==1){
           ubicacionSeleccionada=pa;
           tarifaUbicacion=ppb;
            System.out.println("Su ubicación seleccionada es: "+ pb +" correspondiente a la zona A del teatro con un precio de: $"+ppb +"pesos.");
        } else if (ubicacion==2){
           ubicacionSeleccionada=pb;
           tarifaUbicacion=ppa;  
            System.out.println("Su ubicación seleccionada es: "+ pa + " correspondiente a la zona B del teatro con un precio de: $"+ppa + "pesos.");
        } else if (ubicacion==3){
           ubicacionSeleccionada=p;
           tarifaUbicacion=pp;
            System.out.println("Su ubicación seleccionada es: " + p + "correspondiente a la zona C del teatro con un precio de: $"+ pp + "pesos.");
        }
        //le solicito la edad al cliente para verificar si tiene algun descuento.
        //esta solicitud la hare con la condicional if solo si la variable iterativa es "1".
        if(i==1){
          System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
        edad=entrada.nextInt();  
        }
        //establezco la variable descuento de tipo double, para que incluya dos decimales.
        double descuento = 0, de, dam,sd;
        //establezco los porcentajes de los descuentos.
        de=0.10; //descuento menor de 18 años.
        dam=0.15; //descuento adulto mayor.
        sd=0; //sin descuento.
         
        //con la condicional if anidada procedo a aplicar descuento segun rango de edad.
        if(edad>=1 && edad<=18){
            System.out.println("Su entrada tiene un descuento del 10%.");
            descuento=de;
        } else if (edad>18 && edad<60){
            System.out.println("Su entrada no tiene un descuento."); 
            descuento=sd;
        } else if (edad>=60){
            System.out.println("Su entrada tiene un descuento del 15%.");
            descuento=dam;
        } 
        //con la misma condicional if aplico la formula de descuento, siempre y cuando la variable iterativa sea "1".
        if(i==1){
        tarifaFinal=(int) (tarifaUbicacion-(tarifaUbicacion*descuento));       
        int e;//"e" va a ser mi segunda variable iterativa, para el segundo ciclo itaritivo de tipo Do-While.
        //este ciclo iterativo calculara el precio de mi entrada con el descuento aplicado
        do {
            System.out.println("En base a su respuesta confirme el descuento asignado.");   
            System.out.println("1.-10% de descuento.");
            System.out.println("2.-Sin descuento.");
            System.out.println("3.-15% de descuento.");
            e=entrada.nextInt();
        //con mi condicional switch establezco las posibles opciones.     
        switch (e){
            case 1 ->                 
            System.out.println("Su precio final a pagar con 10% de descuento es: $"+tarifaFinal + "pesos");
            case 2 ->   
            System.out.println("Su precio final a pagar sin descuento es: $"+tarifaFinal + "pesos");
            
            case 3 ->
            System.out.println("Su precio final a pagar con 15% de descuento es: $"+tarifaFinal + "pesos");
            default -> {}
        } 
        }while (e>3); //como codicinal, esto dejara de realizarse siempre y cuando mi variable iterativa sea mayor a "3".     
        }       
        if(i==1){
        int descuentoFinal;    //defino la variable descuento final que tranforma mi número con decimales a porcentaje.
        descuentoFinal=(int) (descuento*100);
        
        System.out.println("el resumen de su compra es el siguiente:");
        //finalmente le muestro un resumen de su compra al cliente por pantalla, como fue solicitado. 
        System.out.println("Ubicación del asiento: "+ ubicacionSeleccionada);
        System.out.println("Precio base de la entrada: $ " + tarifaUbicacion+ "pesos");
        System.out.println("Descuento aplicado: "+ descuentoFinal + "%");
        System.out.println("Precio final a pagar: $ " + tarifaFinal+ "pesos"); 
        System.out.println("hasta pronto");   
        
        
        }
        //procedo a agregar el ciclo iterativo para que se repita multiples veces.
        int o = 0; //para lo cual tengo que definir mi tercera variable iterativa, que correspondera a "o" de tipo int.
        //agrego un ciclo iterativo de tipo Do-While para hacer la repetición de la compra.
        do{
            System.out.println("Bienvenido a la pagina web del teatro Moro.");
            System.out.println("Por favor elige una opción.");
            System.out.println("1-Comprar una entrada.");
            System.out.println("2-Salir.");
            o=entrada.nextInt();
        switch (o){
            case 1 -> System.out.println("Has elegido comprar entrada.");
            case 2 -> System.out.println("Has elegido salir.");
            default -> System.out.println("Opcion invalida.");
            
        } 
         if(o==1){
           System.out.println("El teatro Moro cuenta con entradas con las siguientes ubicaciones: platea alta, platea baja y palcos.");
           System.out.println("Los precios varian segun ubicación seleccionada.");
           System.out.println("Por favor ingrese ubicación deseada.");
           System.out.println("1.-platea baja: $19000 pesos.");
           System.out.println("2.-platea alta: $11000 pesos.");
           System.out.println("3.-palcos: $7200 pesos.");
           ubicacion=entrada.nextInt(); 
        } else {
            System.out.println("Hasta pronto.");
            break;
            
        }   switch (ubicacion) {
                case 1 -> {
                    ubicacionSeleccionada=pa;
                    tarifaUbicacion=ppb;
                    System.out.println("Su ubicación seleccionada es: "+ pb +" correspondiente a la zona A del teatro con un precio de: $" + ppb + "pesos.");
                }
                case 2 -> {
                    ubicacionSeleccionada=pb;
                    tarifaUbicacion=ppa;
                    System.out.println("Su ubicación seleccionada es: "+ pa + " correspondiente a la zona B del teatro con un precio de: $" + ppa + "pesos.");
                }
                case 3 -> {
                    ubicacionSeleccionada=p;
                    tarifaUbicacion=pp;
                    System.out.println("Su ubicación seleccionada es: "+ p + "correspondiente a la zona C del teatro con un precio de: $"+ pp + "pesos.");
                }
                default -> {
                }
            }
         
        if(o==1){
          System.out.println("Por favor ingrese su edad para ver si tiene algun descuento.");
        edad=entrada.nextInt();  
        }
        
        if(edad>=1 && edad<=18){
            System.out.println("Su entrada tiene un descuento del 10%.");
            descuento=de;
        } else if (edad>18 && edad<60){
            System.out.println("Su entrada no tiene un descuento."); 
            descuento=sd;
        } else if (edad>=60){
            System.out.println("Su entrada tiene un descuento del 15%");
            descuento=dam;
        } 
        
        if(o==1){
        tarifaFinal=(int) (tarifaUbicacion-(tarifaUbicacion*descuento));       
        int e;//e va a ser mi iterativo final.
        do {
            System.out.println("En base a su respuesta confirme su descuento");   
            System.out.println("1.-10% de descuento.");
            System.out.println("2.-Sin descuento.");
            System.out.println("3.-15% de descuento.");
            e=entrada.nextInt();
            
        switch (e){
            case 1 ->                 
            System.out.println("Su precio final a pagar con 10% de descuento es: $"+tarifaFinal + "pesos.");
            case 2 ->   
            System.out.println("Su precio final a pagar sin descuento es: $"+tarifaFinal + "pesos.");
            
            case 3 ->
            System.out.println("Su precio final a pagar con 15% de descuento es: $"+tarifaFinal + "pesos.");
            default -> {}
        } 
        }while (e>3);      
        }       
        if(o==1){
        int descuentoFinal;    
        descuentoFinal=(int) (descuento*100);
        
        System.out.println("el resumen de su compra es el siguiente:");
        System.out.println("Ubicación del asiento: "+ ubicacionSeleccionada);
        System.out.println("Precio base de la entrada: $ " + tarifaUbicacion+ "pesos.");
        System.out.println("Descuento aplicado: "+ descuentoFinal + "%.");
        System.out.println("Precio final a pagar: $ " + tarifaFinal+ "pesos."); 
        System.out.println("hasta pronto.");    
        }
        }while (o==1); //la condicional para que este ciclo se repita siempre es que la variable iterativa "o" sea "1".
        
    }
 }
       
