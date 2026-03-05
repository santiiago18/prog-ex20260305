public class CentroFP {
    private Alumno [] alumnos;
    private final int MAX_ALUMNOS;


    /**
     * Constructor de la clase CentroFP
     * @param maximo_de_alumnos
     */
    public CentroFP(int maximo_de_alumnos){
        MAX_ALUMNOS = maximo_de_alumnos;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

    /**
     * Busca el alumno por el id asignado a cada estudiante
     * @param id del estudiante
     * @return devuelve el alumno con el id solicitado
     */
    public Alumno buscarAlumno (int id){
        Alumno alumnoEncontrado = null;
        boolean seguirBuscando = true;

        for(int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++){
            if(alumnos[i] != null && alumnos[i].getId() == id){
                alumnoEncontrado = alumnos[i];
                seguirBuscando = false;
            }
        }
        return alumnoEncontrado;
    }




}
