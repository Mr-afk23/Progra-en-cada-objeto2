public class Main {
    public static void main(String[] args) {

        // Usuarios 
        Usuario usuario1 = new Usuario("Diego Alexander", "Gonzalez C ", 15, 2009);
        Usuario usuario2 = new Usuario("Paola Camila", "Barrondo G", 16, 2008);

        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        
        
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellido());
        System.out.println(usuario1.getEdad());

        if (usuario1.getEdad()>= 18) {
            System.out.println("El usuario es mayor de edad");

        } 
        System.out.println(usuario1.getFechaNacimiento());

        System.out.println(usuario2.getNombre());
    System.out.println(usuario2.getApellido());
    System.out.println(usuario2.getEdad());

    if (usuario2.getEdad()>= 18) {
        System.out.println("El usuario es mayor de edad");

    } 
    System.out.println(usuario2.getFechaNacimiento());

        
    }

    


}