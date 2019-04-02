
import java.rmi.*;

public interface InterfazOperaciones extends Remote {
    void introducirValor(String cadena) throws RemoteException;
    String invertir() throws RemoteException;
    String aumentarEspacios(int espacios)throws RemoteException;
    String aumentar(String cadena) throws RemoteException;
}


