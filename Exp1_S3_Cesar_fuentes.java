/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp1_s3_cesar_fuentes;

import java.util.Scanner;

/**
 *
 * @author fuent
 */
public class Exp1_S3_Cesar_fuentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner entrada = new Scanner(System.in);
              
      //procedo a definir mis variables.
      String dia,ubicacion,tarifa, confirmacion;
      int pev,ppgv,pepb,ppgpb,pepa,ppgpa,pep,ppgp;
      int tarifa_ubicacion=0, tarifa_estacionamiento;
      
      //Establezco los precios para cada ubicación segun la tarifa correspondiente.
        pev=13000; //precio estudiante vip
	ppgv=25000; //precio publico general vip
	pepb=10000; //precio estudiante platea baja
	ppgpb=19000; //precio publico general platea baja
	pepa=9000; //precio estudiante platea alta
	ppgpa=11000; //precio publico general platea alta
	pep=6500; //precio estudiante palcos
	ppgp=7200; //precio publico general palcos

        System.out.println("Bienvenido a la pagina web del teatro Moro");
        System.out.println("Por favor, siga las intrucciones para realizar la compra de sus entradas");
        System.out.println("Elija la ubicación seleccionada según el número asignado"); 
        //Haré que el cliente seleccione su ubicación entre cuatro posibles alternativas
        System.out.println("a)V.I.P.");
        System.out.println("b)Platea Baja");
        System.out.println("c)Platea Alta");
        System.out.println("d)Palcos");
        ubicacion=entrada.nextLine();
        System.out.println("Elija la tarifa correspondiente segun el número asignado");
        //Haré que el cliente seleccione su tarifa entre dos posibles alternativas. 
        System.out.println("e)Estudiante");
        System.out.println("f)Publico general");
        tarifa=entrada.nextLine();
        //establezco con la condición if mis posibles opciones.
         if(ubicacion.equals("a")&&tarifa.equals("e")){
            tarifa_ubicacion=pev;
        } else if (ubicacion.equals("b")&&tarifa.equals("e")){
            tarifa_ubicacion=pepb;    
        } else if (ubicacion.equals("c")&&tarifa.equals("e")){
            tarifa_ubicacion=pepa;
        } else if (ubicacion.equals("d")&&tarifa.equals("e")){
            tarifa_ubicacion=pep;
        } else if(ubicacion.equals("a")&&tarifa.equals("f")){
            tarifa_ubicacion=ppgv;
        } else if (ubicacion.equals("b")&&tarifa.equals("f")){
            tarifa_ubicacion=ppgpb;    
        } else if (ubicacion.equals("c")&&tarifa.equals("f")){
            tarifa_ubicacion=ppgpa;
        } else if (ubicacion.equals("d")&&tarifa.equals("f")){
            tarifa_ubicacion=ppgp;
        }
        //Agrego mi primera expreción aritmetica.       
        System.out.println("¿Desea incluir estacionamiento po $4000?");
        System.out.println("g)con estacionamiento");
        System.out.println("h)sin estacionamiento");
        //Con la condición if establezco mis únicas dos posibles opciones.
        if (entrada.nextLine().equals("g")){
            tarifa_estacionamiento=4000;
        } else {
            tarifa_estacionamiento=0;
        }
        //Acá a través del día agrego mi segunda expresión aritmetica, a través del descuento.
        System.out.println("Ahora elija el día de la semana que desea asistir a la función");
        System.out.println("Mencionar que el día martes la función para cualquier tarifa tiene un descuento del 30%");
        //la persona puede elegir entre lunes,martes,miercoles,jueves,viernes,sabado, domingo.
        dia=entrada.nextLine();
        
        //Genero la condicional para que dependiendo del tipo de respuesta del cliente, mi programa me arroje el valor determinado con o sin descuento segun sea el caso.
        //Acá agrego mi tercera expresión aritmetica agregando el IVA del 19%.
        if (dia.equals("martes")){
            System.out.println("Su precio es: $"+((tarifa_ubicacion + tarifa_estacionamiento)*0.7+((tarifa_ubicacion + tarifa_estacionamiento)*0.19)));
        }
        else{
            System.out.println("Su precio es: $"+((tarifa_ubicacion + tarifa_estacionamiento)+((tarifa_ubicacion + tarifa_estacionamiento)*0.19)));
        }
        //a través le la última condición, le pregunto al cliente si desea confirmar o anular la compra.
        System.out.println("¿Desea confirmar su reservación? responda confirmar o anular?");
        confirmacion=entrada.nextLine();
        
        if (confirmacion.equals("confirmar")){
            System.out.println("Gracias por su compra, disfrute la función");
        }
        else{
            System.out.println("La compra ha sido anulada");
        }
    } 
}

