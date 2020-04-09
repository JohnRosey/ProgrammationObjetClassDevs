/******************************************************************** // 
// Devoir2.java     Auteur: Gansonre Ismael && jeremie cyrille
// //  Programme qui retourne en dollars la valeurs de pieces utilisee.
//******************************************************************
 * */

import java.util.Scanner;
//redéfinition des méthodes equals et compareTo

public class egalite implements equals
{
	int NbHabitant;
public boolean equals(Object NbHabitant){
	  if (this.NbHabitant>0 )
	     return true;
	  else return false;
	}
}
public class comparer interface Comparable<Object>
{
	public int compareTo(Object NbHabitant)
	{     ComparerHbts r = (ComparerHbts) NbHabitant;
	      
	      } 
}
class Ville
{
private String CityName;
private String Country;
private int NbHabitant;
private boolean Universitaire;
//Constructeur
public Ville(String Nomdeville, String Pays, int NbHabitants, boolean universitaire)
{
this.CityName=Nomdeville;
this.Country= Pays;
this.NbHabitant= NbHabitants;
this.Universitaire= universitaire;
}
public String toString(){
    return "City: "+CityName+" Country: "+Country+" Number of habitant: "+ NbHabitant+"university city: "+Universitaire;
}
//Assesseur pour le statut 
public boolean getstatut( boolean Univ) {
	  Univ=  Universitaire;
	
	return   Universitaire;
	
}
//Muttateur ppour le nombre d'habitants
public void sethbts( int Nbhbts)
{
	NbHabitant=Nbhbts;
}
}
public class dev2{
    public static void main(String[] args) {
        Ville ville;
        String CityName = null;
        String Country = null;
        int NbHabitant = 0;
        boolean Universitaire = false;
        int choix;
        Scanner scan = new Scanner(System.in);
        //Menu
        System.out.print("Menu  : ");
        System.out.print(" 1. Entrer la ville : ");
        System.out.print(" 2.Entrer le pays : ");
        System.out.print("3.Entrer le nombre d'habitant : ");
        choix =scan.nextInt();
        switch(choix)
        {
        case 1 :System.out.print("Entrer la ville : ");
        CityName = scan.nextLine();
        break;
        case 2 :
        System.out.print("Entrer le pays : ");
        Country = scan.nextLine();
        break;
        case 3 :
        System.out.print("Entrer le nombre d'habitant : ");
        NbHabitant= scan.nextInt();
        break;
       
        }
        ville = new Ville(CityName, Country, NbHabitant, Universitaire);
        System.out.println(ville);
    }
}