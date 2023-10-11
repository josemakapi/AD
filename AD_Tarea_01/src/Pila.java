import java.util.Stack;

/**
 *
 * @author Jose Manuel Calles
 */
public class Pila {
    private Stack<Persona> pila = new Stack<>();
    public Pila(){}
    
    public void inicio() {
        this.pila.clear();
    }

    public boolean esVacia() {
        return (this.pila).isEmpty();
    }

    public void push(String nombre, int edad) { //Para añadir a la pila. Método FILO.
        this.pila.push(new Persona(nombre, edad));
    }

    public void pop(String nombre) { //Para quitar de la pila el nombre que se indique
        Stack<Persona> pilaAuxiliar = new Stack<>();
        while (!pila.isEmpty()) {
            Persona personaTemp = pila.pop();
            if (!personaTemp.getNombre().equals(nombre)) {
                pilaAuxiliar.push(personaTemp);
            }
        }
        this.pila=pilaAuxiliar;
    }
    public boolean buscar(String nombre) {
        for (Persona persona : this.pila) {
            if (persona.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public int getNumElementos(){
        return this.pila.size();
    }
    public void listar (){
        for (Persona pers : pila){
            System.out.println(pers);
        }
    }
}
    
