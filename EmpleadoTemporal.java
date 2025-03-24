import java.util.Date;

public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;
    private Date fechaFinContrato;

    public EmpleadoTemporal(String nombre, String apellido, String id, String departamento, String tipoContrato, double tarifaPorHora, int horasTrabajadas, Date fechaIngreso, Date fechaFinContrato, ReporteDesempeño desempeño) {
        super(nombre, apellido, id, departamento, tipoContrato, fechaIngreso, desempeño);
        this.fechaFinContrato = fechaFinContrato;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha de Fin de Contrato: " + fechaFinContrato;
    
    }
    @Override
    public double calcularNomina() {
        return tarifaPorHora * horasTrabajadas; // Se calcula en base a las horas trabajadas
    }   
}
