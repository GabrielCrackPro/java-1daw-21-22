public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("");
        persona.setApellido("");
        persona.setEdad(10);

        System.out.println("fullName: " + persona.getFullName());
        System.out.println("adolescente: " + persona.esAdolescente());

        persona.setNombre("Ana");
        persona.setEdad(18);

        System.out.println("fullName: " + persona.getFullName());
        System.out.println("adolescente: " + persona.esAdolescente());
        persona.setApellido("Guerrero");

    }
}
