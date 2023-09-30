package ListaEnlazadas;


public class Nodo {

    private int identificacion;
    private String nombre;  
    private String sexo;
    private int edad;
    private int curso;
    private String nombreAcudiente;
    private int telefonoAcudiente;

    private Nodo siguiente;

    public Nodo() {
        this.identificacion = 0;
        this.nombre = "";
        this.sexo = "";
        this.edad = 0;
        this.curso = 0;
        this.nombreAcudiente = "";
        this.telefonoAcudiente = 0;
        this.siguiente = null;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public int getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(int telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return " \n" 
        + " Identificacion = " + identificacion + "\n"  
        + " Nombre = "  + nombre + "\n"
        + " Sexo = " + sexo + "\n"
        + " Edad = " + edad + "\n"
        + " Curso = " + curso + "\n"
        + " NombreAcudiente = " + nombreAcudiente + "\n"
        + " TelefonoAcudiente = " + telefonoAcudiente + "\n"
        + "";
    }


}

