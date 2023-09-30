package ListaEnlazadas;



public class ListaEnlazada {

    private Nodo cabeza;
    
    public Nodo getCabeza() {
        return cabeza;
    }

    public ListaEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return (cabeza == null) ? true : false;
    }

    public void agregarAlPricipio(Nodo nuevoNodo) {
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temporal = cabeza;
            Nodo nuevo = nuevoNodo;
            nuevo.setSiguiente(temporal);
            cabeza = nuevo;
            
        }
    }

    public void agregarAlFinal(Nodo nuevoNodo) {

        if ( cabeza == null){
            cabeza = nuevoNodo;
        } else {

        

        Nodo temporal = cabeza;
       for (;;) {

            if (temporal.getSiguiente()  == null ) {
                break;
            }
            
           temporal =  temporal.getSiguiente();
        }
 
        temporal.setSiguiente(nuevoNodo);
    }
    }

    public void insertarEntreNodos(Nodo nuevoNodo, int indice) {
        int contador = 0;
        Nodo temporal = cabeza;

        for (; contador < indice - 1;) {
            temporal = temporal.getSiguiente();
            contador++;
        }

        Nodo siguiente = temporal.getSiguiente();
        Nodo nuevo = nuevoNodo;

        temporal.setSiguiente(nuevo);
        nuevo.setSiguiente(siguiente);

    }

    public String buscarIdentificacion(int identificacion) {
        String informacion = "";
        int contador = 0;
        Nodo temporal = cabeza;

        for (;;) {
            if (identificacion == temporal.getIdentificacion()) {
                informacion = temporal.toString();
                break;
            }
            temporal = temporal.getSiguiente();
            contador++;
        }

        return informacion;
    }

    public String buscarAcudiente(String NombreEstudiante) {
        String informacion = "";
        int contador = 0;
        Nodo temporal = cabeza;

        for (;;) {
            if (temporal.getNombre().equals(NombreEstudiante)) {
                informacion = ""
                        + "Nombre Acudiente: " + temporal.getNombreAcudiente()
                        + "\nTelefono Acudiente: " + temporal.getTelefonoAcudiente()
                        + "\n";

                break;
            }
            temporal = temporal.getSiguiente();
            contador++;
        }

        return informacion;
    }

    public void eliminarEstudiantes() {

        Nodo temporal = cabeza;
        for (;;) {
            if (temporal == null) {
                break;
            }

            if (temporal.getSiguiente().getCurso() == 5 || temporal.getCurso() == 5) {
                temporal.setSiguiente(temporal);
            }
            temporal = temporal.getSiguiente();
        }

    }

    public String informacionMayor() {

        String estudiantePrimero = "";
        int estudiantePrimeroMayor = 0;
        String estudianteQuinto = "";
        int estudianteQuintoMayor = 0;
        Nodo temporal = cabeza;

        for (;;) {
            if (temporal == null) {
                break;
            }

            if (temporal.getCurso() == 1 && temporal.getEdad() > estudiantePrimeroMayor) {
                estudiantePrimero = ""
                        + "Nombre: " + temporal.getNombre() + "\n"
                        + "Sexo: " + temporal.getSexo() + "\n"
                        + "";
                estudiantePrimeroMayor = temporal.getEdad();

            } else if (temporal.getCurso() == 5 && temporal.getEdad() > estudianteQuintoMayor) {
                estudianteQuinto = ""
                        + "Nombre: " + temporal.getNombre() + "\n"
                        + "Sexo: " + temporal.getSexo() + "\n"
                        + "";
                estudianteQuintoMayor = temporal.getEdad();
            }
        }
        return estudiantePrimero + "\n\n" + estudianteQuinto;
    }

    public String informacionMujer() {
        String nombreMujeres = "";
        int cantidadMujeres = 0;
        float promedioEdadMujeres = 0;
        Nodo temporal = cabeza;

        for (;;) {
            if (temporal == null) {
                break;
            }

            if (temporal.getSexo().equals("Mujer") && temporal.getCurso() == 5) {
                nombreMujeres += temporal.getNombre() + "\n";
                cantidadMujeres++;
                promedioEdadMujeres += temporal.getEdad();
            }
            temporal = temporal.getSiguiente();
        }
        promedioEdadMujeres = cantidadMujeres / promedioEdadMujeres;

        return ""
                + nombreMujeres + "\n"
                + "Cantidad de Mujeres: " + cantidadMujeres + "\n"
                + "Promedio de Edad de las Mujeres: " + promedioEdadMujeres + "\n"
                + "";
    }

    public String informeMujeresHombres() {
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        Nodo temporal = cabeza;
        for (;;) {
            if (temporal == null) {
                break;
            }
            if (temporal.getSexo().equals("Hombre") && temporal.getCurso() == 1) {
                cantidadHombres++;
            } else if (temporal.getSexo().equals("Mujer") && temporal.getCurso() == 1  ) {
                cantidadMujeres++;
            }
            temporal = temporal.getSiguiente();

        }
        return "Estos Son los Datos "
                + "Hombres: " + cantidadHombres + "\n"
                + "Mujeres: " + cantidadMujeres + "\n"
                + "";
    }

    
    
    // Metodo para Tester Los Nodos 
    public void Recorrer(){
        
        Nodo temporal = cabeza;
        for (;;) {
            if (temporal == null) {
                break;
            }
            String dato = "";
            dato +=  "[ "+temporal.getNombre()+ " ] -> ";

            if (temporal.getSiguiente() == null) {
                dato += "null\n";

            }

            System.out.print(dato );
            temporal = temporal.getSiguiente();
        }
        

    }
    
}