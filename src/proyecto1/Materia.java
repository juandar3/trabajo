package proyecto1;

class Materia {
    private String nombre;
    private String codigo;
    private int capacidadMaxima;
    private boolean estadoApertura;
    private boolean habilitada;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private Docente docenteAsignado;

    // Constructor
    public Materia(String nombre, String codigo, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.estadoApertura = false;
        this.habilitada = false;
    }

    
    public void abrirMateria(Docente docente) {
        // abrir la materia con el docente asignado
    }

    public void cerrarMateria() {
        // cerrar la materia y calcular promedios
    }

    public void agregarEstudiante(Estudiante estudiante) {
        // agregar estudiantes a la materia
    }
}
