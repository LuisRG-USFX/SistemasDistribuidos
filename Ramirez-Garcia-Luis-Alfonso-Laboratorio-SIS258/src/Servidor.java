import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


public class Servidor 
    extends UnicastRemoteObject
    implements InterfazOperaciones
	 
{
    Servidor() throws java.rmi.RemoteException{
	super();
    }
    String cadena = "";
    public void introducirValor(String cad){
        cadena = cad;
    }
    public String aumentarEspacios(int espacios){
        String cad = "";
        String espacio = "";
        while(espacios>0){
            espacio = espacio + " ";
            espacios--;
        }
        for(int x = 0;x<cadena.length();x++)
            cad = cad + cadena.charAt(x) + espacio; 
        return cad;
    }
    public String aumentar(String cdn){
        return cadena + cdn;
    }
    public String invertir(){
        String cad = "";
        if(!cadena.equals(" ")){
            if(cadena.length() == 1){
                cad= cadena;}
            else {
                for(int x = cadena.length()-1;x>-1;x--)
                    cad = cad + cadena.charAt(x);
            }
        }
       return cad;
    }
    public static void main(String args[]) { 
	try {
	    Servidor Operaciones;
	    LocateRegistry.createRegistry(1099);
	    Operaciones=new Servidor(); 
	    Naming.bind("Operaciones", Operaciones); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    } 
}


