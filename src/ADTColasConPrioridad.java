


public class ADTColasConPrioridad<T> {

    private ADTArray prioridad;
    private int numeroPrioridades;

    public ADTColasConPrioridad(int numPrioPridades) {
        this.prioridad = new ADTArray<ADTColas>(numPrioPridades + 1);
        for (int i = 0; i <= numPrioPridades + 1; i++) {
            prioridad.setElemento(i, new ADTColas<>());
        }
        this.numeroPrioridades = numPrioPridades;
    }

    public int length() {
        int N = 0;
        ADTColas aux2 = new ADTColas<>();
        for (int i = 0; i < numeroPrioridades - 1; i++) {
            aux2 = (ADTColas) prioridad.getElemento(i);
            N = N + aux2.tamaño();
        }
        return N;
    }

    public boolean is_empty() {
        return length() == 0;
    }

    public void enqueue(int prioridad, T elemento) {
        ADTColas aux1 = new ADTColas<>();
        if (prioridad <= numeroPrioridades) {
            aux1 = (ADTColas) this.prioridad.getElemento(prioridad);
            aux1.enqueue(elemento);

        } else {
            System.out.println("Prioridad incorrecta");
        }

    }

    public T dequeue() {
        ADTColas aux3 = new ADTColas<>();
        int prioridadActual = 0;
        while (aux3.is_empty()) {
            if (prioridadActual > numeroPrioridades) {
                break;
            }
            aux3 = (ADTColas) prioridad.getElemento(prioridadActual);
            if (!aux3.is_empty()) {

                return (T) aux3.dequeue();

            }
            prioridadActual++;
        }
        return (T) "";
    }

    @Override
    public String toString() {
        for (int i = 0; i < prioridad.getLongitud(); i++) {

            System.out.print(prioridad.getElemento(i));
        }
        return "";
    }



}
