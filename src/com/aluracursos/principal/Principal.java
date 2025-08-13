package com.aluracursos.principal;

import com.aluracursos.model.Conversion;
import com.aluracursos.principal.Conversor;
import com.aluracursos.service.ConsultaApi;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        ConsultaApi conversor = new ConsultaApi();
        String origen="";
        String destino = "";
        while(true){
            Conversor.excibirMenu();
            int opcion = sc.nextInt();
            if (opcion == 7){
                System.out.println("Gracias por usar el conversor de monedas\n");
                break;
            }

            switch(opcion){
                case 1: origen="USD"; destino="ARS";break;
                case 2: origen="ARS"; destino="USD";break;
                case 3:origen = "USD"; destino = "BRL";break;
                case 4: origen = "BRL"; destino = "USD";break;
                case 5: origen = "USD"; destino = "COP"; break;
                case 6: origen = "COP"; destino = "USD";break;
                default:
                    System.out.println("Opcion no valida");
                    continue;
            }

            System.out.println("Ingrese el valor que deseas convertir: ");
            double monto = sc.nextDouble();
            try{
                double tasa = conversor.conversion(origen,destino);
                double resultado = monto * tasa;
                Conversion conversion = new Conversion(origen,destino,monto,resultado);
                //System.out.println("El valor "+monto+" ["+origen+"] "+" corresponde al valor final de =>>> "+resultado+" ["+destino+"] ");
                System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]\n", monto, origen, resultado, destino);
            } catch (IOException | InterruptedException e){
                System.out.println("Se produció un error inesperado");
            }

        }
    }
}
