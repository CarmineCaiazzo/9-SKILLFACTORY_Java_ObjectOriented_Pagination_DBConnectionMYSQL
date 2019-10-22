package MODEL;

public class Dipendente {


	private int ID;
	private String Nome;
	private String Cognome;
	private int Eta;
	private String RuoloAziendale;
	private double Stipendio;
	private String TitoloStudio;
	
//|-----------------------------------------------------------------------------------------|
//SET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public void setNome(String Nome)
	{
		this.Nome=Nome;
	}
	
	public void setID(int ID)
	{
		this.ID=ID;
	}
	
	public void setCognome(String Cognome)
	{
		this.Cognome=Cognome;
	}
	
	public void setEta(int Eta)
	{
		this.Eta=Eta;
	}
	
	public void setRuoloAziendale(String RuoloAziendale)
	{
		this.RuoloAziendale=RuoloAziendale;
	}
	
	public void setStipendio(double Stipendio)
	{
		this.Stipendio=Stipendio;
	}
	
	public void setTitoloStudio(String TitoloStudio)
	{
		this.TitoloStudio=TitoloStudio;
	}

//|-----------------------------------------------------------------------------------------|	
//GET METHOD
//|-----------------------------------------------------------------------------------------|
	
	public String getNome()
	{
		return Nome;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getCognome()
	{
		return Cognome;
	}
	
	public int getEta()
	{
		return Eta;
	}
	
	public String getRuoloAziendale()
	{
		return RuoloAziendale;
	}
	
	public double getStipendio()
	{
		return Stipendio;
	}
	
	public String getTitoloStudio()
	{
		return TitoloStudio;
	}

//|-----------------------------------------------------------------------------------------|
//Builder
//|-----------------------------------------------------------------------------------------|	
	
	public Dipendente()
	{
		super(); //SUPERFLUO
	}

	Dipendente(String Nome, int ID, String Cognome, int Eta, String RuoloAziendale, double Stipendio, String TitoloStudio)
	{
		this.Nome=Nome;
		this.ID=ID;
		this.Cognome=Cognome;
		this.Eta=Eta;
		this.RuoloAziendale=RuoloAziendale;
		this.Stipendio=Stipendio;
		this.TitoloStudio=TitoloStudio;
	}

//|-----------------------------------------------------------------------------------------|
//OVERRIDE
//|-----------------------------------------------------------------------------------------|

	@Override//hashCode
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cognome == null) ? 0 : Cognome.hashCode());
		result = prime * result + Eta;
		result = prime * result + ID;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((RuoloAziendale == null) ? 0 : RuoloAziendale.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Stipendio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((TitoloStudio == null) ? 0 : TitoloStudio.hashCode());
		return result;
	}

//|-----------------------------------------------------------------------------------------|
	
	@Override//equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		if (Cognome == null) {
			if (other.Cognome != null)
				return false;
		} else if (!Cognome.equals(other.Cognome))
			return false;
		if (Eta != other.Eta)
			return false;
		if (ID != other.ID)
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (RuoloAziendale == null) {
			if (other.RuoloAziendale != null)
				return false;
		} else if (!RuoloAziendale.equals(other.RuoloAziendale))
			return false;
		if (Double.doubleToLongBits(Stipendio) != Double.doubleToLongBits(other.Stipendio))
			return false;
		if (TitoloStudio == null) {
			if (other.TitoloStudio != null)
				return false;
		} else if (!TitoloStudio.equals(other.TitoloStudio))
			return false;
		return true;
	}
	
//|-----------------------------------------------------------------------------------------|
	
	@Override//toString
	public String toString() {
		return 
				"|-----------------|"+
				"\n|-- Dipendenti --| "
				+"\n|-----------------|"
				+"\n - ID --> " + ID + 
				" \n - Nome --> " + Nome + 
				" \n - Cognome --> " + Cognome + 
				" \n - Eta --> " + Eta + 
				" \n - RuoloAziendale --> "+ RuoloAziendale + 
				" \n - Stipendio --> " + Stipendio + 
				" \n - TitoloStudio --> " + TitoloStudio+
				"\n|-----------------|" ;
				
	}
	
//|-----------------------------------------------------------------------------------------|

}
