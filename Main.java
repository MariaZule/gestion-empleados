import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Crear empleados permanentes
        EmpleadoPermanente empleado1 = new EmpleadoPermanente("Maria Isabel", "Zuleta", "01", "Marketing", "Permanente", 3000000, new Date(), new ReporteDesempeño());
        EmpleadoPermanente empleado2 = new EmpleadoPermanente("Hernan Javier", "Zuleta", "02", "Ventas", "Permanente", 4000000, new Date(), new ReporteDesempeño());
        EmpleadoPermanente empleado3 = new EmpleadoPermanente("Sandra", "Zapata", "03", "Marketing", "Permanente", 3000000, new Date(), new ReporteDesempeño());

        //Crear empleados temporales
        EmpleadoTemporal empleado4 = new EmpleadoTemporal("Andres Felipe", "Zuleta", "04", "Ventas", "Temporal", 30000, 160, new Date(), new Date(), new ReporteDesempeño());
        EmpleadoTemporal empleado5 = new EmpleadoTemporal("Sara", "Velez", "05", "Marketing", "Temporal", 25000, 180, new Date(), new Date(), new ReporteDesempeño());

        //Cambiar departamento
        empleado1.cambiarDepartamento("Ventas");
        empleado3.cambiarDepartamento("Soporte");

        //Mostar los datos del empleado
        System.out.println("Empleado " + empleado1.getId() + ": " + empleado1.getNombre() + " " + empleado1.getApellido() + " - " + empleado1.getDepartamento() + " - " + empleado1.getTipoContrato() + " - " + empleado1.getFechaIngreso());
        System.out.println("Empleado " + empleado2.getId() + ": " + empleado2.getNombre() + " " + empleado2.getApellido() + " - " + empleado2.getDepartamento() + " - " + empleado2.getTipoContrato() + " - " + empleado2.getFechaIngreso ());
        System.out.println("Empleado " + empleado3.getId() + ": " + empleado3.getNombre() + " " + empleado3.getApellido() + " - " + empleado3.getDepartamento() + " - " + empleado3.getTipoContrato() + " - " + empleado3.getFechaIngreso());
        System.out.println("Empleado " + empleado4.getId() + ": " + empleado4.getNombre() + " " + empleado4.getApellido() + " - " + empleado4.getDepartamento() + " - " + empleado4.getTipoContrato() + " - " + empleado4.getFechaIngreso());
        System.out.println("Empleado " + empleado5.getId() + ": " + empleado5.getNombre() + " " + empleado5.getApellido() + " - " + empleado5.getDepartamento() + " - " + empleado5.getTipoContrato() + " - " + empleado5.getFechaIngreso());
        
        // Mostrar nómina
        System.out.println(empleado1.getNombre() + " - Nómina: $" + empleado1.calcularNomina());
        System.out.println(empleado2.getNombre() + " - Nómina: $" + empleado2.calcularNomina());
        System.out.println(empleado3.getNombre() + " - Nómina: $" + empleado3.calcularNomina());
        System.out.println(empleado4.getNombre() + " - Nómina: $" + empleado4.calcularNomina());
        System.out.println(empleado5.getNombre() + " - Nómina: $" + empleado5.calcularNomina());

        // Crear un departamento
        Departamento departamentoSoporte = new Departamento("Soporte", "Departamento de Servicio al cliente", "Maria Isabel Zuleta");
        Departamento departamentoVentas = new Departamento("Ventas", "Departamento de ventas", "Manuel Vasquez");
        Departamento departamentoMarketing = new Departamento("Marketing", "Departamento de Marketing Digital", "Valentina Tobon");

        // Asignar empleados al departamento
        departamentoVentas.agregarEmpleado(empleado1);
        departamentoMarketing.agregarEmpleado(empleado5);
        departamentoVentas.agregarEmpleado(empleado2);
        departamentoVentas.agregarEmpleado(empleado4);
        departamentoSoporte.agregarEmpleado(empleado3);

        // Generar y mostrar reportes de desempeño individuales
        System.out.println("\nReporte de Desempeño de los Empleados:");
        System.out.println(ReporteDesempeño.generarReporte(empleado1));
        System.out.println(ReporteDesempeño.generarReporte(empleado2));
        System.out.println(ReporteDesempeño.generarReporte(empleado3));
        System.out.println(ReporteDesempeño.generarReporte(empleado4));
        System.out.println(ReporteDesempeño.generarReporte(empleado5));
        
        //Imprimir información del departamento
        System.out.println("\nInformación del Departamento:");
        System.out.println(departamentoSoporte);

        // Generar y mostrar reporte de desempeño del departamento Soporte
        System.out.println("\nReporte de Desempeño del Departamento " + departamentoSoporte.getNombreDepartamento() + ":");
        System.out.println(ReporteDesempeño.generarReporte(departamentoSoporte));
        
        //Imprimir información del departamento
        System.out.println("\nInformación del Departamento:");
        System.out.println(departamentoVentas);
        
        // Generar y mostrar reporte de desempeño del departamento ventas
        System.out.println("\nReporte de Desempeño del Departamento " + departamentoVentas.getNombreDepartamento() + ":");
        System.out.println(ReporteDesempeño.generarReporte(departamentoVentas));
        
        //Imprimir información del departamento
        System.out.println("\nInformación del Departamento:");
        System.out.println(departamentoMarketing);
        
        // Generar y mostrar reporte de desempeño del departamento Marketing
        System.out.println("\nReporte de Desempeño del Departamento " + departamentoMarketing.getNombreDepartamento() + ":");
        System.out.println(ReporteDesempeño.generarReporte(departamentoMarketing));
    }
}