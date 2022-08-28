package sprint_ii;

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

    public static class Main {
        public static void main(String[] args) {

            Empresa epsa =new Empresa("dllsoftware","calle42","3013098685","9008025");

            epsa.getNombreEmpresa();
            epsa.getDireccionEmpresa();
            epsa.getNumeroDeTelefono();
            epsa.getIdEmpresa();


           // epsa.setNombreEmpresa();
           // epsa.setIdEmpresa();
           // epsa.setDireccionEmpresa();
           // epsa.setNumeroDeTelefono();

            Perfil perfil = new Perfil(id: "1", image: "", phone: "3204218", user: "Ant22", createdAt: "26/08/2022", updatedAt:"26/08/2022")

            perfil.getId();
            perfil.getImage();
            perfil.getPhone();
            perfil.getUser();
            perfil.getCreatedAt();
            perfil.getUpdatedAt();








        }


    }
};

