package mx.unam.aragon.dp;

public class Persona {
    private String nombre;
    private String apPaternor;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona() {
    }

    public Persona(String nombre, String apPaternor, String apMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apPaternor = apPaternor;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaternor() {
        return apPaternor;
    }

    public void setApPaternor(String apPaternor) {
        this.apPaternor = apPaternor;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apPaternor=" + apPaternor + ", apMaterno=" + apMaterno + ", edad=" + edad + ", curp=" + curp + '}';
    }
    
    
}
