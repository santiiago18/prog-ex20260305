public class Alumno {
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;


    /**
     * Constructoe de la clase Alumno
     * @param id id del alumno
     * @param nombre nombre del alumno
     * @param tituloFP titulo fp del alumno
     * @param edad edad del alumno
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Id del estudiante
     * @return el id del estudiante
     */
    public int getId() {
        return id;
    }

    /**
     * Nombre del estudiante
     * @return nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Titulo que obtiene el estudiante
     * @return titulo del estudiante
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Edad que tiene el estudiante
     * @return edad del estudiante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Texto de todos los atributos de la clase Alumno
     * @return texto con todos los atributos de la clase Alumno
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: " + getNombre() + "\n");
        sb.append("Edad: " + getEdad() + "\n");
        sb.append("Titulo: " + getTituloFP() + "\n");

        return sb.toString();

    }



}
