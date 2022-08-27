import sprint_ii.Empresa;

public class Main {
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