package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Entrada: año,mes,dia
        //Calcular edad de la persona
        //Si la persona es mayor de edad se le permite comprar la entrada y se le muestra carta de licores
        //Si no, muestra mensaje mandandome para la casa

        //Entradas
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCLiente;
        int anoNacimiento;
        int mesNacimiento;
        int diaNacimiento;

        //Pedimos datos al usuario
        System.out.print("Ingrese su nombre:");
        nombreCliente=leerDato.nextLine();

        System.out.print("Ingrese su pais");
        paisCLiente=leerDato.nextLine();

        System.out.print("Ingrese año de nacimiento:");
        anoNacimiento=leerDato.nextInt();

        System.out.print("Ingrese mes de nacimiento:");
        mesNacimiento=leerDato.nextInt();

        System.out.print("Ingrese dia de nacimiento:");
        diaNacimiento= leerDato.nextInt();

        //Procesando Entradas

        //1.¿Como Cañcular la edad del cliente?
        // Restar el año actual - año de nacimiento
        int edadCliente=2024-anoNacimiento;

        System.out.println("Su edad es: " + edadCliente);

        //2. Decidir con base a la edad si es cliente mayor de edad.

        if(edadCliente >=18){
            System.out.println("Felicidades, usted es mayor de edad");
            //Menu Licores--PERRONEGRO
            //Botella Aguardiente---150000
            //Botella Don Julio---600000
            //Botella Blue Label----1500000
            //Botella Jagger---200000
            System.out.println("CARTA LICORES");
            System.out.println("1... Botella Aguardiente Antioqueño --- $150000");
            System.out.println("2... Botella Don Julio---$600000");
            System.out.println("3...Botella Blue Label---$1500000");
            System.out.println("4...Botella jagger---$200000");

        } else {
            System.out.println("Repaila ñero, usted es un niño, vaya haga chichi, popo y a mimir");

        }


    }
}