public class EmpleadoPorHoras extends Empleado{
    // ATRIBUTOS
    private int horasTrabajadas;
    private double valorHora;


    // CONSTRUCTOR
    public EmpleadoPorHoras(String nombre, String idEmpleado, String telefono, boolean activo, int horasTrabajadas, double valorHora) {
        super(nombre, idEmpleado, telefono, activo);
        this.horasTrabajadas = 0;
        this.valorHora = valorHora;
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

    // MÉTODOS SOBREESCRITOS
    @Override
    public double calcularSalario(){
        double salario = this.horasTrabajadas * this.valorHora;
        return salario;
    }

    @Override
    public String obtenerRol(){
        return "Por Horas";
    }

    @Override
    public String mostrarInfo(){
        super.mostrarInfo();
        String info_adicional = "\n Horas Trabajadas: "+ this.horasTrabajadas + " horas"+
                "\n Valor Hora: $" + this.valorHora;
        return info_adicional;
    }






}
