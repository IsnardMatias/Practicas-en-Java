package practicas;

public class EjemploHerencia {
    
  public static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos", 25000);
        System.out.println("Imprimimos el objeto Empleado1");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Lucas", 15000);
        e2.setEdad(30);
        e2.setGenero('M');
        e2.setDireccion("Venezuela, Caracas");
        System.out.println("\nImprimimos el objeto Empleado2");
        System.out.println(e2);
        
        //Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
        Cliente c1 = new Cliente(new java.util.Date(), false);
        System.out.println("\nImprimimos el objeto Cliente1");
        System.out.println(c1);
        //Completamos el objeto persona asociado a este objeto cliente
        c1.setNombre("Romina");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("Argentina, BS.AS");
        System.out.println("\nVolvemos a imprimir el objeto cliente1");
        System.out.println(c1);
    }
}