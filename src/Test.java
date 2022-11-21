
public class Test {

    public static void main(String[] args) {
        ADTColasConPrioridad Tripulacion = new ADTColasConPrioridad(5);
        
        System.out.println("Tripulacion Completa: ");
        System.out.println("\n");
        Tripulacion.enqueue(4, "Maestre");
        Tripulacion.enqueue(2, "Niños");
        Tripulacion.enqueue(4, "Mecanico");
        Tripulacion.enqueue(3, "Mujeres");
        Tripulacion.enqueue(2, "Tercera edad");
        Tripulacion.enqueue(1, "Niñas");
        Tripulacion.enqueue(3, "Hombres");
        Tripulacion.enqueue(4, "Vigia");
        Tripulacion.enqueue(5, "Capitan");
        Tripulacion.enqueue(4, "Timonel");

        Tripulacion.toString();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Tripulacion Restante: ");
        Tripulacion.dequeue();
        Tripulacion.dequeue();
        Tripulacion.dequeue();
        Tripulacion.dequeue();
        Tripulacion.dequeue();
        Tripulacion.toString();

    }

}
