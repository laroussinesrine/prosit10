public class Test {

    public static void main(String [] args){

        Departement d1 = new Departement(78,"informatique",60);
        Departement d2 = new Departement(11,"gestion",80);

        DepartementHashSet hash = new DepartementHashSet();
        hash.ajouterDepartement(d1);
        hash.ajouterDepartement(d2);
System.out.println(hash.rechercherDepartement("comptabilite"));
        hash.trierDepartementById();
        hash.displayDepartement();
    }
}
