import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement<Departement>{

    Set<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d:departements){
            if(d.getNomDep()==nom){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
for(Departement d : departements){
    System.out.println(d);
}
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Comparator<Departement> comp = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId()-o2.getId();
            }
        };
       TreeSet <Departement> tree = new TreeSet<Departement>(comp) ;

       tree.addAll(departements);
       return tree;

    }
}
