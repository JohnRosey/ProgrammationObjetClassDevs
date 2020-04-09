//******************************************************************** // 
// Devoir1.java     Auteur: Gansonre Ismael && jeremie cyrille
// //  Programme qui retourne en dollars la valeurs de pieces utilisee.
//******************************************************************


import java.text.DecimalFormat;

import java.util.Scanner;


public class devoir1 {
	public static void main (String[] args) {
	
/* Valeur des pieces en dollars*/
 double Cent01= 0.01;
 double Cent05 =0.05;
 double Cent10 = 0.10;
 double Cent25 =0.25;
 /* Le Nombre de pieces initialisee a 0*/
 
 int Nb01=0,Nb10=0,Nb25=0,Nb05=0;

 
 
 Scanner scan = new Scanner (System.in);
System.out.println("Entrez le nombre de pieces de 1¢ :" );
Nb01=scan.nextInt();
System.out.println("Entrez le nombre de pieces de 5¢ :");
Nb05=scan.nextInt();
System.out.println("Entrez le nombre de pieces de 10¢ :" );
Nb10=scan.nextInt();
System.out.println("Entrez le nombre de pieces de 25¢ :");
Nb25=scan.nextInt();

/* Formule  qui permet de faire le calcul final*/
double Total=(Nb01*Cent01+Nb05*Cent05+Nb10*Cent10+Nb25*Cent25);
DecimalFormat DoublePrec= new DecimalFormat("0.##");


System.out.println("Sa fait  :"+DoublePrec.format(Total)+"$");



}
}