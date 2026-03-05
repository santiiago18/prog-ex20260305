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


    /**
     * Busca el primer hueco libre
     * @return Devuelve el primer hueco libre
     */
    private int buscarPrimerHuecoLibre(){
        int primerHuecoLibre = -1;
        boolean seguirBuscando = true;
        for(int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++){
            if(alumnos[i] == null){
                primerHuecoLibre = i;
                seguirBuscando = false;
            }
        }
        return primerHuecoLibre;
    }

    /**
     * Se revisa si primero hay hueco libre para poder registrar al alumno
     * @param alumno busca si existe ya ese alumno
     * @return true si se asigna y false si no se asigna
     */
    public boolean registrarAlumno(Alumno alumno){
        boolean alumnoRegistado = false;
        int posicion;
        if (buscarAlumno(alumno.getId()) == null){
            posicion = buscarPrimerHuecoLibre();
            if (posicion >= 0){
                alumnos[posicion] = alumno;
                alumnoRegistado = true;
            }
        }
        return alumnoRegistado;
    }


    /**
     *Lista de los alumnos que estan registrados
     */
    public void mostrarAlumnos(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < alumnos.length; i++){
            if(alumnos[i] != null){
                sb.append(String.format("Alumno %d: ", alumnos[i].getId()));
                sb.append("\n");
            }
        }

    }

























}
