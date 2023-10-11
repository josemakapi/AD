import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Jose Manuel Calles
 */
public class Cola {
    private Queue<Persona> cola = new LinkedList<>(); //Usamos LinkedList porque es una lista doblemente enlazada que puede insertar al final
    
    public Cola(){}
    
    public void inicio() { //Borramos ambas
        cola.clear();
    }

    public boolean esVacia() {
            return (this.cola).isEmpty();
    }

    public void encolar(String nombre, int edad) { //Para añadir a la cola. Método FIFO.
        Persona persona = new Persona(nombre, edad);
        cola.offer(persona); //Usamos el método Offer para insertar por el final
    }
    
    public void desencolar(String nombre) { //Para quitar de la cola el nombre que se indique
        Queue<Persona> colaAuxiliar = new LinkedList<>();
        while (!cola.isEmpty()) {
            Persona personaTemp = cola.poll();
            if (!personaTemp.getNombre().equals(nombre)) {
                colaAuxiliar.offer(personaTemp);
            }
        }
        cola = colaAuxiliar;
        }

    public boolean buscar(String nombre) {
        for (Persona persona : this.cola) {
            if (persona.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    } 
    
    public int getNumElementos(){
        return this.cola.size();
    }
    
    public void listar (){
        for (Persona pers : cola){
            System.out.println(pers);
        }
    }
}
