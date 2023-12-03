import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0;i<employes.size();i++){
            if(employes.get(i).getNom()==nom){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        for(int i=0;i<employes.size();i++){
            if(employes.get(i).equals(employe)){
                return true;
            }
        }

        return false;
    }


    @Override
    public void supprimerEmploye(Employe employe) {
employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }
    Comparator<Employe> NomDepComparator= new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getNomDep().compareTo(o2.getNomDep());
        }
    };

    Comparator<Employe> GradeComparator= new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o1.getGrade()-o2.getGrade();
        }
    };
    @Override
    public void trierEmployeParNomDépartementEtGrade() {


        Collections.sort(employes, NomDepComparator.thenComparing(GradeComparator));
    }
}
