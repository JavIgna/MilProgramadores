/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author guillermofuentesquijada
 */
public class EjerciciosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        int[][] matriz = {{1,2},{3,4}};
        
        for (int[] is : matriz) {
            for (int i : is) {
                System.out.print("[" + i + "]");
            }
            System.out.println("");
        }*/
        
        Scanner tcld = new Scanner(System.in);
        System.out.println("Ingrese una fecha día, mes y anio (dd/mm/aaaa ó dd-mm-aaaa)");
        String fechaString = tcld.next();
        int dia = 0, mes = 0, anio = 0;
        if(fechaString.contains("/")){
            String[] datos = fechaString.split("/");
            
            dia = Integer.parseInt(datos[0]);
            mes = Integer.parseInt(datos[1]);
            anio = Integer.parseInt(datos[2]); 
            
            int stopDia = 0;
            
            switch(mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    stopDia = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    stopDia = 30;
                    break;
                case 2:
                    if(esBisiesto(anio)){
                        stopDia = 29;
                    }else{
                        stopDia = 28;
                    }
                    break;
                default:
                    
            }
            
            if(dia >= 1 && dia <= stopDia && mes >= 1 && mes <= 12 
                    && anio >= LocalDate.now().getYear()){
                LocalDate fecha = LocalDate.of(anio, mes, dia);
                System.out.println("fecha es: " + fecha);
            }else{
                System.out.println("Te equivocaste");
            }
            
        }else{
            if(fechaString.contains("-")){
                
            }else{
                System.out.println("Ingreso un formato desconocido");
            }
        }
        
        
            /*
        LocalDate fecha = LocalDate.of(2000, 11, 27);
        LocalDate fecha2 = LocalDate.of(2018, 12, 31);
        String strFecha = "2002-02-27";
        
        
        System.out.println("year: " + LocalDate.parse(strFecha).getYear());
        System.out.println("day: " + LocalDate.parse(strFecha).getDayOfMonth());
        System.out.println("\n\n");
        int diasArriendo = 15;
        LocalDate inicioArriendo = LocalDate.now();
        System.out.println(inicioArriendo);
        inicioArriendo = inicioArriendo.plusDays(diasArriendo);
        System.out.println(inicioArriendo);
        System.out.println("\n\n");
        System.out.println("fecha: " + fecha);
        System.out.println("fecha2: " + fecha2);
        System.out.println("dias: "+ Period.between(fecha, fecha2).getDays());
        System.out.println("meses: "+ Period.between(fecha, fecha2).getMonths());
        System.out.println("años: "+ Period.between(fecha, fecha2).getYears());
        //System.out.println("dif: " + Duration.between(fech, fech2).toDays());
        
        //System.out.println("*** " + fech);
        
        System.out.println("fecha esta antes que fecha 2: " + (fecha.isBefore(fecha2)));
        System.out.println("fecha esta despues que fecha 2: " + (fecha.isAfter(fecha2)));
        System.out.println("fecha es igual a fecha 2: " + (fecha.isEqual(fecha2)));
        System.out.println("dias de diferencia entre fecha y fecha2: " + (fecha2.getDayOfYear() - fecha.getDayOfYear()));*/
    }
    
    public static boolean esBisiesto(int anio){
        return (anio%4==0 && (anio%100 != 0 || anio%400 == 0));
    }
    
}
