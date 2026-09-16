public class EmpleadoPorHoras extends Empleado{
    // ATRIBUTOS
    private int horasTrabajadas;
    private double valorHora;
    private double salario;


    // CONSTRUCTOR
    public EmpleadoPorHoras(String nombre, String idEmpleado, String telefono, boolean activo, int horasTrabajadas, double valorHora) {
        super(nombre, idEmpleado, telefono, activo);
        this.horasTrabajadas = 0;
        this.valorHora = valorHora;
        this.salario = 0;
    }

    // GETTERS Y SETTERS
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // MÉTODOS SOBREESCRITOS
    @Override
    public double calcularSalario(){
        double salarioCalculado = this.horasTrabajadas * this.valorHora;
        setSalario(salarioCalculado);
        return salarioCalculado;
    }

    @Override
    public String obtenerRol(){
        return "Por Horas";
    }

    @Override
    public String mostrarInfo(){
        super.mostrarInfo();
        String info_adicional = "\n Horas Trabajadas: "+ this.horasTrabajadas +
                "\n Valor Hora: $" + this.valorHora;
        return info_adicional;
    }






}
