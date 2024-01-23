package semana01;
import java.util.Scanner;
/*
Implementar un programa que genere una boleta de venta similar a la mostrada (salida con formato).
Debe solicitar mediante Scanner, los siguientes datos:
nombre de cliente, nombre del producto, precio y cantidad comprada.
Deben ingresarse los datos de dos productos distintos.

 

*/
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String nombreProducto1, nombreProducto2;
        int cantidadProducto1, cantidadProducto2;
        double precioProducto1, precioProducto2;

 

        System.out.println("Ingrese el nombre del cliente: ");
        lector.nextLine();
        System.out.println("Ingrese el nombre del producto 1: ");
        nombreProducto1=lector.nextLine();
        System.out.println("Ingrese el precio del producto 1: ");
        precioProducto1=lector.nextDouble();
        System.out.println("Ingrese la cantidad del producto 1: ");
        cantidadProducto1=lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el nombre del producto 2: ");
        nombreProducto2=lector.nextLine();
        System.out.println("Ingrese el precio del producto 2: ");
        precioProducto2=lector.nextDouble();
        System.out.println("Ingrese la cantidad del producto 2: ");
        cantidadProducto2=lector.nextInt();

 

        System.out.println("####################");
        System.out.printf("%15S\n", "TIENDA ABC");
        System.out.println("####################");
        System.out.printf("%-15S\n", "ID: 00000245");

 

        System.out.printf("%3d %-10S %10.2f %5d %10.2f\n", 1, nombreProducto1, precioProducto1, cantidadProducto1, precioProducto1*cantidadProducto1);
        System.out.printf("%3d %-10S %10.2f %5d %10.2f\n", 2, nombreProducto2, precioProducto2, cantidadProducto2, precioProducto2*cantidadProducto2);                     
  
        
        
        System.out.println("####################");
        System.out.printf ("%15S\n", "VUELVA PRONTO");
        System.out.println("####################");
 
}
}
