import java.util.Date;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String departamento;
    protected String tipoContrato;
    protected Date fechaIngreso;
    protected ReporteDesempeño desempeño;

    public Empleado(String nombre, String apellido, String id, String departamento, String tipoContrato, Date fechaIngreso, ReporteDesempeño desempeño) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.departamento = departamento;
        this.tipoContrato = tipoContrato;
        this.fechaIngreso = fechaIngreso;
        this.desempeño = desempeño;
    }
    
    public abstract double calcularNomina(); // Método abstracto

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(String tipoContrato) { this.tipoContrato = tipoContrato; }

    public Date getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(Date fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public ReporteDesempeño getDesempeño() { return desempeño; }
    public void setDesempeño(ReporteDesempeño desempeño) { this.desempeño = desempeño; }

    // Método para cambiar de departamento
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
        System.out.println("El empleado " + nombre + " ahora pertenece al departamento de " + nuevoDepartamento);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + " " + apellido + '\'' +
                ", Departamento='" + departamento + '\'' +
                ", Tipo de Contrato='" + tipoContrato + '\'' +
                ", Fecha de Ingreso=" + fechaIngreso +
                ", Desempeño=" + desempeño +
                '}';
    }
}
