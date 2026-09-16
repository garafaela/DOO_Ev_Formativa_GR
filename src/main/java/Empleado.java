public abstract class Empleado {
    // ATRIBUTOS
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected boolean activo;
    protected double salarioBase;

    // CONSTRUCTOR 1
    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this .telefono = telefono;
        this.activo = activo;
        this.salarioBase = salarioBase;
    }

    // CONSTRUCTOR 2
    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this .telefono = telefono;
        this.activo = activo;
        this.salarioBase = 0;
    }

    // GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getIdEmpleado(){
        return idEmpleado;
    }
    public String getTelefono(){
        return telefono;
    }
    public boolean isActivo(){
        return activo;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    // SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIdEmpleado(String idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    public void asignarTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    public void setSalarioBase(double newSalarioBase){
        this.salarioBase = newSalarioBase;
    }

    // MÉTODOS COMPORTAMIENTO ABSTRACTOS
    public abstract double calcularSalario();
    public abstract String obtenerRol();

    // MÉTODOS COMPORTAMIENTO CONCRETOS
    public void activar(){
        this.activo = true;
    }
    public void desactivar(){
        this.activo = false;
    }

    public String mostrarInfo(){
        String info = "Nombre:  " + this.nombre +
                "\nID: " + this.idEmpleado +
                "\n Teléfono: " + this.telefono +
                "\n Rol: " + obtenerRol() +
                "\n Activo: " + this.activo +
                "\n Salario: $"+calcularSalario();
        return info;
    }

}

