
import java.rmi.*;
import java.util.*;
import java.rmi.registry.*;

public class Cliente{
    public static void main(String args[]){
	InterfazOperaciones Operaciones;
        String opcion = "";
        String cadena = " ";
        String nuevaCadena ="";
        int espacios = 0;
	try {
	    Operaciones=(InterfazOperaciones)Naming.lookup("rmi://localhost/Operaciones");
            while(true){
                System.out.println("Introducir opcion: 1)Introducir valor  2)Invertir  3)Aumentar espacios 4)Aumentar ");
                Scanner scanner2 = new Scanner(System.in);
                opcion=scanner2.nextLine();
                if(opcion.equals("1")){
                    System.out.println("Introducir cadena");
                    Scanner scanner = new Scanner(System.in);
                    cadena=scanner.nextLine();
                    Operaciones.introducirValor(cadena);
                    System.out.println("Se introdujo la cadena:"+cadena);
                }   
                if(opcion.equals("2")){
                    System.out.println(Operaciones.invertir());
                }
                if(opcion.equals("3")){
                    System.out.println("Introducir cantidad de espacios ");
                    Scanner scanner3 = new Scanner(System.in);
                    espacios=Integer.parseInt(scanner3.nextLine());
                    System.out.println(Operaciones.aumentarEspacios(espacios));
                }
                if(opcion.equals("4")){
                    System.out.println("Introducir cadena");
                    Scanner scanner4 = new Scanner(System.in);
                    nuevaCadena=scanner4.nextLine();
                    System.out.println(Operaciones.aumentar(nuevaCadena));
                }
            }
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }
}

