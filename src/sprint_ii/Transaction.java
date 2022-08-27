package sprint_ii;

import java.util.Date;

public class Transaction {
    public long id;
    public String concept;
    public float amount;
    public User User;
    public Empresa empresa;
    public Date createdAt;
    public Date updatedAt;


    public Transaction(long id, String concept, float amount, sprint_ii.User user, Empresa empresa, Date createdAt, Date updatedAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        User = user;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public sprint_ii.User getUser() {
        return User;
    }

    public void setUser(sprint_ii.User user) {
        User = user;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
