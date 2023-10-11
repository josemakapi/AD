/**
 *
 * @author Jose Manuel Calles
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Procedemos a llenar la pila y la cola\n");
        Pila colegio = new Pila(); //Nombres en español = colegio. Primeros en entrar, últimos en salir, imitando el funcionamiento de una pila
        colegio.push("Pepe", 34);
        colegio.push("Man Olo", 25);
        colegio.push("Eva", 35);
        colegio.push("Maria", 35);
        
        Cola cine = new Cola(); //Imita el funcionamiento de la cola de un cine. Nombres de directores.
        cine.encolar("George Lucas", 62);
        cine.encolar("Steven Spielberg", 60);
        cine.encolar("James Cameron", 65);
        cine.encolar("Ridley Scott", 57);
        //Comprobamos el método esVacia()
        System.out.println("¿Está la pila vacía? "+colegio.esVacia());
        System.out.println("¿Está la cola vacía? "+cine.esVacia());
        
        //Listamos los elementos
        System.out.println("\nPila después de agregar elementos:");
        colegio.listar();
        System.out.println("\nCola después de agregar elementos:");
        cine.listar();
        
        //Probamos el método buscar()
        System.out.println("\n¿Eva esta en el colegio? = "+colegio.buscar("Eva"));
        System.out.println("¿John esta en el colegio? = "+colegio.buscar("John"));
        System.out.println("¿ERidley Scott esta en el cine? = "+cine.buscar("Ridley Scott"));
        System.out.println("¿Amenabar esta en el cine? = "+cine.buscar("Amenabar"));
        
        //Eliminamos elementos de la pila
        System.out.println("\nAhora eliminaremos a Eva del colegio.");
        colegio.pop("Eva");
        System.out.println("¿Eva esta en el colegio? = "+colegio.buscar("Eva"));
        //Eliminamos elementos de la cola
        System.out.println("\nAhora eliminaremos a Steven Spielberg del cine.");
        cine.desencolar("Steven Spielberg");
        System.out.println("¿Steven Spielberg esta en el cine? = "+cine.buscar("Steven Spielberg"));
        
        //Y comprobamos los resultados
        System.out.println("\nPila después de eliminar elementos:");
        colegio.listar();
        System.out.println("\nCola después de eliminar elementos:");
        cine.listar();
    }   
}
