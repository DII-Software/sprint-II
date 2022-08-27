import sprint_ii.Empresa;

public class Employee {
    private String nombre;
    private String correo;
    private Empresa empresa;
    //private Enum rol;

    public Employee(String nombre, String correo, Empresa empresa){
        //Falta crear el archivo enum
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        //
    }
    //Getters
    //Falta el getter del rol del empleado
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public Empresa getEmpresa() {
        return empresa;
    }

    //Setters
    //Falta el setter del rol del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
};

