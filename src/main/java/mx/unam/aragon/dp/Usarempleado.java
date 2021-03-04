package mx.unam.aragon.dp;

public class Usarempleado {
    
    public static void main(String[] args) {
        
        Empleado emp1=new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Victor Ricardo");
        emp1.setApMaterno("Medina");
        emp1.setApMaterno("López");
        emp1.setEdad(19);
        emp1.setCurp("MELV020124HDFDPCA5");
        
        System.out.println("info:" + emp1 );
    }
}
