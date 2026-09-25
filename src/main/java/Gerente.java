public class Gerente extends EmpleadoAsalariado implements Bonificable {
    // ATRIBUTOS
    private String departamento;
    private double bonificacionAnual;
    private double metaDesempeno;

    // CONSTRUCTOR 1
    public Gerente(String nombre, String idEmpleado, String telefono, boolean activo, double sueldoMensual, String departamento, double metaDesempeno) {
        super(nombre,idEmpleado,telefono,activo,sueldoMensual);
        this.departamento = departamento;
        asignarMeta(metaDesempeno);
        this.bonificacionAnual = 0;
    }

    // CONSTRUCTOR 2
    public Gerente(String nombre, String idEmpleado, String telefono, boolean activo, double sueldoMensual, String departamento) {
        super(nombre,idEmpleado,telefono,activo,sueldoMensual);
        this.departamento = departamento;
        this.metaDesempeno = 0;
        this.bonificacionAnual = 0;
    }

    // GETTERS Y SETTERS
    public String getDepartamento() {
        return departamento;
    }
    public void asignarDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getBonificacionAnual() {
        return bonificacionAnual;
    }
    public void setBonificacionAnual(double bonificacionAnual) {
        this.bonificacionAnual = bonificacionAnual;
    }
    public double getMetaDesempeno(){
        return metaDesempeno;
    }

    // MÉTODOS SOBREESCRITOS
    @Override
    public String obtenerRol(){
        return "Gerente";
    }

    @Override
    public double calcularSalario(){
        double salario = getSueldoMensual() + calcularBonificacion();
        return salario;
    }

    // MÉTODOS INTERFAZ
    @Override
    public double calcularBonificacion(){
        double bono = 0;
        // Se asume que metaDesempeño es el porcentaje alcanzado.
        // Si el valor es mayor o igual que el 60%, se considera meta alcanzada.
        if (metaDesempeno >= 60){
            bono = getSueldoMensual()*0.2;
        }
        return bono;
    }

    @Override
    public void asignarMeta(double meta){
        this.metaDesempeno = meta;
    }
}
