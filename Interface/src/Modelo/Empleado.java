
package Modelo;

public class Empleado implements Empleador{
    private String Nombre;
    private String Apellido;
    private int edad;
    private int sueldo;  

   

    public Empleado(String Nombre, String Apellido, int edad, int sueldo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    

 
    @Override
    public double calculasueldo() {
        if (getEdad() >= 40) {
            System.out.println("El trabajador " +getNombre() +" "+ getApellido() +" tiene una edad de "+ getEdad());
            int sueldo = getSueldo() * 2;
            System.out.println("El empleado tiene un sueldo de "+getSueldo()+" pero recibira el doble por lo tanto el sueldo le queda " + sueldo);
        } else {
            System.out.println("El trabajador " +getNombre()+ " " + getApellido() +" tiene una edad menor de 40");
            System.out.println("recibe el sueldo fijo de "+sueldofijo);
        }
        return sueldo;
    }
    
}
