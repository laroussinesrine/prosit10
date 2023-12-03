import java.util.Objects;

public class Departement {

 private int id;
    private String nomDep;
    private int nbrEmployes;
    public Departement(){}
    public Departement(int id, String nomDep, int nbrEmployes) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbrEmployes = nbrEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbrEmployes=" + nbrEmployes + '\n'+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getId() == that.getId() && Objects.equals(getNomDep(), that.getNomDep());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomDep());
    }
}
