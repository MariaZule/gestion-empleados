public class ReporteDesempeño {
// Puntaje de desempeño
    private int puntaje;

    public ReporteDesempeño() {
        this.puntaje = (int)(Math.random() * 100); // Asignar un puntaje aleatorio de 0 a 100
    }

    @Override
    public String toString() {
        return "Puntaje: " + puntaje;
    }
    // Generacion reporte de desempeño para un empleado
    public static String generarReporte(Empleado empleado) {
        return "Reporte de Desempeño para " + empleado.getNombre() + ": " + empleado.getDesempeño().toString();
    }
    // Generacion reporte de desempeño para un departamento
    public static String generarReporte(Departamento departamento) {
        StringBuilder reporte = new StringBuilder();
        for (Empleado e : departamento.getEmpleados()) {
            reporte.append(generarReporte(e)).append("\n");
        }
        return reporte.toString();
    }
}
