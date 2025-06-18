//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto("66932","FABIAN", 200, "unos chetos");
        Empleado empleadoPorHoras = new EmpleadoPorHoras("66931", "carlos", 400, 10);

        System.out.println("el salario de "+ empleadoTiempoCompleto.getNombre()+" trabajor de tiempo completo es: $" + empleadoTiempoCompleto.calcularSalario());
        System.out.println("el salario de "+ empleadoPorHoras.getNombre()+" trabajor por horas es: $" + empleadoPorHoras.calcularSalario());
    }
}