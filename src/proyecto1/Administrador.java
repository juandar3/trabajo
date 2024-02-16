package proyecto1;

class Administrador {
    private String contrasena = "admin123"; // Contraseña inventada

    // Constructor
    public Administrador() {
    }

    
    public boolean validarContrasena(String inputContrasena) {
      
        return inputContrasena.equals(contrasena);
    }

    public void ingresarEstudiante() {
        
    }

    public void asignarDocenteAMateria() {
        
    }

    public void ingresarCalificaciones() {
        
    }
}