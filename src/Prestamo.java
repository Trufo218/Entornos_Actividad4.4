public class Prestamo {
    public static void printInformacionPersonal(Profesor profesor){
        System.out.println("Nombre: " + profesor.str);
        System.out.println("Edad: " + profesor.edad);
        System.out.println("Teléfono: " + profesor.numeroDeTelefono);
    }

    public static void printTodaLaInformacion(Profesor profesor){
        System.out.println("Nombre: " + profesor.str);
        System.out.println("Edad: " + profesor.edad);
        System.out.println("Teléfono: " + profesor.numeroDeTelefono);
        for (Prestamo p: profesor.prestamos) {
            System.out.println(p);
        }
    }
}
