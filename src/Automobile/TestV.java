package Automobile;

public class TestV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule V=new Vehicule("Clio","Classique",2000,20.000);
		Vehicule V1=new Vehicule("Mercedes","Fantôme",2008,60.000);
		Vehicule V2=new Vehicule("KIA","Picanto",2012,35.000);
		AgenceMobiliere A =new AgenceMobiliere(10);
		A.ajoutVehicule(V);
		A.ajoutVehicule(V1);
		A.ajoutVehicule(V2);
		A.decriretab();
		A.selection("Mercedes");
		A.selection(40.000);
		A.selectionancienne();
		
		

}
}
