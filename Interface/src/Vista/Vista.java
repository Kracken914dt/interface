
package Vista;
import Modelo.*;
public class Vista {
    public static void main(String[] args) {
        Empleador t = new Empleado("Juan", "Perez", 40, 100000);
        t.calculasueldo();
        Empleador p = new Empleado("carlos", "martinez", 28,0);
        p.calculasueldo();
    }
}
