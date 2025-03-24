import java.util.Date;

public class EmpleadoPermanente extends Empleado {
    private double salarioMensual;
    public EmpleadoPermanente(String nombre, String apellido, String id, String departamento, String tipoContrato, double salarioMensual, Date fechaIngreso, ReporteDesempeño desempeño) {
        super(nombre, apellido, id, departamento, tipoContrato, fechaIngreso, desempeño);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularNomina() {
        return salarioMensual; // Los empleados permanentes reciben el mismo salario cada mes
    }
}
