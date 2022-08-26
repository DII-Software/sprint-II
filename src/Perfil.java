public class Perfil {
    public int id;
    public Strig image;
    public String phone;
    public String user;
    public date createdAt;
    public date UpdatedAt;
    public Perfil(int id, Strig image, String phone, String user, date createdAt, date updatedAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        UpdatedAt = updatedAt;
    }
    public Perfil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Strig getImage() {
        return image;
    }

    public void setImage(Strig image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(date createdAt) {
        this.createdAt = createdAt;
    }

    public date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(date updatedAt) {
        UpdatedAt = updatedAt;
    }
}
