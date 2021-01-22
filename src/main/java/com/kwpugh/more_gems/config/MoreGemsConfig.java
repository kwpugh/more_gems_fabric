package com.kwpugh.more_gems.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "more_gems")
public class MoreGemsConfig extends PartitioningSerializer.GlobalData 
{
    public Ores ORES = new Ores();
    public General GENERAL = new General();
    
    @Config(name = "ores")
    public static class Ores implements ConfigData 
    {
	    @Comment("***********************"
	    		+"\nCitrine Ores"
	    		+"\n***********************") 
	    public boolean citrineEnable = true;
	    public int citrineVeinSize = 4;
    	public int citrineMinLevel = 0;
    	public int citrineMaxLevel = 70;
    	public int citrinePerChunk = 12;
    	
        @Comment("***********************"
	    		+"\nTourmaline Ores"
	    		+"\n***********************")
        public boolean tourmalineEnable = true;
        public int tourmalineVeinSize = 4;
      	public int tourmalineMinLevel = 0;
    	public int tourmalineMaxLevel = 70;
    	public int tourmalinePerChunk = 12;
    	
        @Comment("***********************"
	    		+"\nAmethyst Ores"
	    		+"\n***********************")
        public boolean amethystEnable = true;
        public int amethystVeinSize = 4;
      	public int amethystMinLevel = 0;
    	public int amethystMaxLevel = 60;
    	public int amethystPerChunk = 12;
    	
        @Comment("***********************"
	    		+"\nTopaz Ores"
	    		+"\n***********************")
        public boolean topazEnable = true;
        public int topazVeinSize = 4;
      	public int topazMinLevel = 0;
    	public int topazMaxLevel = 60;
    	public int topazPerChunk = 12;

        @Comment("***********************"
	    		+"\nAlexandrite Ores"
	    		+"\n***********************")
        public boolean alexandriteEnable = true;
        public int alexandriteVeinSize = 4;
      	public int alexandriteMinLevel = 0;
    	public int alexandriteMaxLevel = 60;
    	public int alexandritePerChunk = 12;

        @Comment("***********************"
 	    		+"\nSapphire Ores"
 	    		+"\n***********************")
        public boolean sapphireEnable = true;
        public int sapphireVeinSize = 4;
       	public int sapphireMinLevel = 0;
     	public int sapphireMaxLevel = 30;
     	public int sapphirePerChunk = 12;
     	   	
        @Comment("***********************"
 	    		+"\nRuby Ores"
 	    		+"\n***********************")
        public boolean rubyEnable = true;
        public int rubyVeinSize = 4;
       	public int rubyMinLevel = 0;
     	public int rubyMaxLevel = 30;
     	public int rubyPerChunk = 12;
     	
        @Comment("***********************"
 	    		+"\nCorundum Ores"
 	    		+"\n***********************")
        public boolean conrundumEnable = true;
        public int conrundumVeinSize = 3;
       	public int conrundumMinLevel = 0;
     	public int conrundumMaxLevel = 20;
     	public int conrundumPerChunk = 12;
     	
        @Comment("***********************"
 	    		+"\nCarbonado Ores"
 	    		+"\n***********************")
        public boolean carbonadoEnable = true;
        public int carbonadoVeinSize = 3;
       	public int carbonadoMinLevel = 0;
     	public int carbonadoMaxLevel = 15;
     	public int carbonadoPerChunk = 12;
    }
    
    @Config(name = "general")
	public static class General implements ConfigData
	{       
       	@Comment("********"
    			+"\nGemBag"
    			+"\n********")
		public boolean gembagEnable = true;
		
    	@Comment("********"
    			+"\nJuju"
    			+"\n********")
		public boolean jujuEnable = true;
		public float jujuChance = .02F;
		
		@Comment("***************"
				+"\nEnchantments"
				+"\n***************")
		public boolean enableQuickening = false;
		public boolean enableRazorSharpness = false;
		public boolean enableShulkerBlade = false;
		public boolean enableUntouchable = false;
		public boolean enableFasterObsidian = false;
		public float amountHalfHeartsQuickening = 10;
		public int enemySlownessDurationTicksQuickening = 300;
		public float razorDamageIncrease = 6.0F;
		public int untouchableDamage = 7;
		public int shulkerBladeDurationTicks = 300;
		
		@Comment("********************************"
				+"\nPaxels, Hammers, & Excavators"
				+"\n********************************") 
		public boolean extraToolsEnable = true;
		public boolean bowsEnable = true;
	}
}