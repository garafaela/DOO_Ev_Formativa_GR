public class EmpleadoAsalariado extends Empleado {
    // ATRIBUTOS
    private double sueldoMensual;

    // CONSTRUCTOR 1
    public EmpleadoAsalariado(String nombre, String idEmpleado, String telefono, boolean activo, double sueldoMensual) {
        super(nombre,idEmpleado,telefono,activo,sueldoMensual);
        this.sueldoMensual = sueldoMensual;
    }

    // GETTER
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    // MÉTODOS SOBREESCRITOS
    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }

    @Override
    public String obtenerRol(){
        return "Asalariado";
    }
}
