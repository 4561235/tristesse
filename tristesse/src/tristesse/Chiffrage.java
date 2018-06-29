package tristesse;

public class Chiffrage {
	
	String stockage = "";

	public Chiffrage(String s)
	{
		chiffre(s);
		
	}
	
	public String chiffre(String s)
	{
		
		for(int i=0; i<s.length(); i++)
		{
			String lettre = s.substring(i,i+1);
			
			if(lettre.equals(" "))
			{
				stockage += " ";
			}
			else if(lettre.equals("a"))
			{
				stockage += ":-:";
			}
			else if(lettre.equals("b"))
			{
				stockage += ";-;";
			}
			else if(lettre.equals("c"))
			{
				stockage += ":+:";
			}
			else if(lettre.equals("d"))
			{
				stockage += ";_;";
			}
			else if(lettre.equals("e"))
			{
				stockage += ":_:";
			}
			else if(lettre.equals("f"))
			{
				stockage += "'-'";
			}
			else if(lettre.equals("g"))
			{
				stockage += ";+;";
			}
			else if(lettre.equals("h"))
			{
				stockage += "'+'";
			}
			else if(lettre.equals("i"))
			{
				stockage += ":--:";
			}
			else if(lettre.equals("j"))
			{
				stockage += ";--;";
			}
			else if(lettre.equals("k"))
			{
				stockage += "'--'";
			}
			else if(lettre.equals("l"))
			{
				stockage += ":++:";
			}
			else if(lettre.equals("m"))
			{
				stockage += ";++;";
			}
			else if(lettre.equals("n"))
			{
				stockage += "'++'";
			}
			else if(lettre.equals("o"))
			{
				stockage += ":__:";
			}
			else if(lettre.equals("p"))
			{
				stockage += ";__;";
			}
			else if(lettre.equals("q"))
			{
				stockage += "'__'";
			}
			
			//System.out.println(s.substring(i,i+1));
		}
		
		return stockage;
	}

	public String getStockage() {
		return stockage;
	}

	public void setStockage(String stockage) {
		this.stockage = stockage;
	}
	
}
