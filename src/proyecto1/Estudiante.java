package proyecto1;

class Estudiante extends Persona {
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, String apellidos, String identificacion, int edad) {
        super(nombre, apellidos, identificacion);
        this.edad = edad;
        this.promedio = 0.0;
    }

    // get y set
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}