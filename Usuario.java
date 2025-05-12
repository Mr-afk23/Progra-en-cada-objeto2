public class Usuario {

    // 🔒 Propiedades privadas (encapsulamiento)
    private String nombre;
    private String apellido;
    private int edad;
    private int fechaNacimiento;

    // 🧱 Constructor: se ejecuta al crear un nuevo objeto Usuario
    public Usuario(String nombre, String apellido, int edad, int fechaNacimiento) {
        this.nombre = nombre; // Asigna el valor recibido al atributo del objeto
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // 🔍 Getters: permiten acceder a los atributos privados de forma controlada

    public int getEdad() {
        return this.edad;
    }

    public int getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // ✏️ Setters: permiten modificar los atributos privados

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // 📋 Método para mostrar todos los datos del usuario
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
}
