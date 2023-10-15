package Automobile;

public class AgenceMobiliere {
	private int max;
	private Vehicule tab[];
	private int nb;
	AgenceMobiliere(int max)
	{
		this.max=max;
		tab=new Vehicule[max];
	}
	void ajoutVehicule(Vehicule V)
	{
		if(nb <max)
		{
			tab[nb]=V;
			nb++;
		}
		else
		{
			System.out.println("Le tableau est rempli au max ");
		}
	}
	void selection(int n)
	{
		if(n>0 && n< this.nb)
		{
			System.out.println(tab[n]);
		}
		else
		{
			System.out.println("Erreur");
		}
	}
	void selection(String mq)
	{
		Boolean trouve=false;
		for(int i=0;i<nb;i++)
		{
			if(tab[i].getMarque()==mq)
			{
				System.out.println(tab[i]);
				trouve=true;
			}
		}
		if(trouve==false)
		{
			System.out.println("Il n'y a pas de vehicules de cet marque");
		}
	}
	void selection(double px)
	{
		Boolean trouve=false;
		for(int i=0;i<nb;i++)
		{
			 if(tab[i].getPrix()<px)
			 {
				 System.out.println(tab[i]);
				 trouve=true;
			 }
		}
		if(trouve== false)
		{
			System.out.println("Il n'y a pas de vehicules dans cette marge de prix");

		}
	}
	/*int getNB()
	{
		return this.nb;
	}
	public Vehicule[] getTab() {
		return tab;
	}
	public void setTab(Vehicule[] tab) {
		this.tab = tab;
	}*/
	void decriretab()
	{
		for(int i=0;i<nb;i++)
		{
			System.out.println(tab[i]);
		}
	}
	void selectionancienne()
	{
		//int anneeanc=tab[0].getAnnee();
		Vehicule V=tab[0];
		for(int i=1;i<nb;i++)
		{
			if(tab[i].getAnnee()<V.getAnnee())
			{
				//anneeanc=tab[i].getAnnee();
				V=tab[i];
			}
		}
		System.out.println(V);
	}
	
	
	
}