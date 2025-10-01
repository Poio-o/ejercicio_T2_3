public class App {
    public static void main(String[] args) throws Exception {

        String nombre = "Miguel Trujillo Rojas";
        String direccion = "Calle Rodahuevos, 69 - Guaro (Málaga) - España";
        String telefono = "555 123456";

        System.out.printf("""
            %s
            %s
            %s
        """,nombre,direccion,telefono);
    }
}
