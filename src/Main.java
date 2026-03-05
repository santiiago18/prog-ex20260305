public class Main {
    public static void main(String[] args) {
        CentroFP centroFP = new CentroFP(20);


        Alumno alumno1 = new Alumno(1, "Santiago", "DAM", 19);

        Alumno alumno2 = new Alumno(2, "Daniela", "DAW", 19);

        Alumno alumno3 = new Alumno(3, "Jhonatan", "ASIR", 19);

        // Registrar Alumnos
        System.out.println(centroFP.registrarAlumno(alumno1));
        System.out.println(centroFP.registrarAlumno(alumno2));
        System.out.println(centroFP.registrarAlumno(alumno3));


    }
}