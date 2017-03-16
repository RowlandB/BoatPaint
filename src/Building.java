import java.util.Collection;

public abstract class Building 
{
	
	private String Name;
	private String Description;
	private NPC Owner;
	private Collection<NPC> WorkersAndRegulars;
	private Collection<Item> Wares;
}
