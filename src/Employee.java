import sprint_ii.Empresa;
public class Employee {
    //Atributos
    private String nombre;
    private String correo;
    private Empresa empresa;
    private RolEmp rol;

    //Constructor
    public Employee(String nombre, String correo, Empresa empresa, RolEmp rol){
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public RolEmp getRol() {
        return rol;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public void setRol(RolEmp rol) {
        this.rol = rol;
    }
};

