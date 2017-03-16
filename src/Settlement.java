import java.util.Collection;

public class Settlement 
{
	public Settlement() 
	{
		// TODO Auto-generated constructor stub
		
		//TODO size?
		
		
		
	}
	
	public static Settlement RandomSettlement()
	{
		//TODO
		return null;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}
	
	private SettlementSize Size;
	private TerrainType Terrain;
	private Government SettlementGovernment;
	private AlignmentType Alignment;
	private Integer Population;
	private String Description;
	private Collection<Building> NotableBuildings;
	private Collection<NPC> NotableNPCs;
	private Quality SettlementQuality;
	private Economy EconomicHealth;
	private Collection<Industry> SettlementIndustries;
}
