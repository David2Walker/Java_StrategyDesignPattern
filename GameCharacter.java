
public abstract class GameCharacter {
	Guitar guitar;
	Solo solos;
	String name;
	public void setGuitar(Guitar g){ guitar = g; }
	
	public void setSolo(Solo s){ solos = s; }
	
	public void perform(String name){ guitar.perform(name); } 
	
	public void solo(String name){ solos.solo(name); }
	
	public String getName()
	{
		return this.name;
	}
	
	
}
