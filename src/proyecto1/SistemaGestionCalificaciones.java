// ...
public class SistemaGestionCalificaciones {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Docente> docentes = new ArrayList<>();
    private List<Materia> materias = new ArrayList<>();
    private Administrador administrador = new Administrador();

    public static void main(String[] args) {
        SistemaGestionCalificaciones sistema = new SistemaGestionCalificaciones();
        sistema.iniciar();
    }

    public void iniciar() {
        // Lógica de entrada de un uusuario

        // verificar un administrador
        System.out.print("Ingrese la contraseña del administrador: ");
        String inputContrasena = scanner.nextLine();

        if (administrador.validarContrasena(inputContrasena)) {
            System.out.println("¡Bienvenido, Administrador!");

            // Menú de opciones administrador
            boolean salir = false;
            while (!salir) {
                System.out.println("1. Ingresar nuevo estudiante");
                System.out.println("2. Asignar docente a materia");
                System.out.println("3. Ingresar calificaciones");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el texto de entrada

                switch (opcion) {
                    case 1:
                        administrador.ingresarEstudiante();
                        break;
                    case 2:
                        administrador.asignarDocenteAMateria();
                        break;
                    case 3:
                        administrador.ingresarCalificaciones();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }
        } else {
            System.out.println("Contraseña incorrecta. Programa finalizado.");
        }

        scanner.close();
    }
   
}
