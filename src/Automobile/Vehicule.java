package Automobile;

public class Vehicule {
	private int num;
	private String marq;
	private String mod;
	private int aa;
	private double prix;
	static  private int count;
	Vehicule(String marque, String modele, int annee,double prix)
	{
		count++;
		this.num=count;
		this.marq=marque;
		this.mod=modele;
		this.aa=annee;
		this.prix=prix;
	}
	@Override
	 public String toString()
	{
		return "Numero: "+ num +" Marque: "+ marq +" Modele: "+mod+" Annee de creation: "+aa+" Prix: "+prix;
	}
	void decrisVehicu()
	{
		System.out.println(this);
	}
	int getCount()
	{
		return this.count;
	}
	String getMarque()
	{
		return this.marq;
	}
	String getModele()
	{
		return this.mod;
	}
	int getAnnee()
	{
		return this.aa;
	}
	double getPrix()
	{
		return this.prix;
	}
	void setMarque(String marque)
	{
		this.marq=marque;
	}
	void setModele(String modele)
	{
		this.mod=modele;
	}
	void setPrix(double prix)
	{
		this.prix=prix;
	}
	

}
