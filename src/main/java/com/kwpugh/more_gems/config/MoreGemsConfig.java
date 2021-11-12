package com.kwpugh.more_gems.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "more_gems")
public class MoreGemsConfig extends PartitioningSerializer.GlobalData 
{
    public Ores ORES = new Ores();
    public General GENERAL = new General();
    
    @Config(name = "ores")
    public static class Ores implements ConfigData 
    {
		@Comment("***********************"
				+"\nTemp Solution"
				+"\n- gem drops from stone and deepslate"
				+"\n***********************")
		public float stoneDropGemsChance = .03F;
		public float deepslateDropGemsChance = .03F;

	    @Comment("***********************"
	    		+"\nCitrine Ores"
	    		+"\n***********************") 
	    public boolean citrineEnable = true;
	    public int citrineVeinSize = 4;
    	public int citrineMaxLevel = 110;
    	public int citrinePerChunk = 12;
    	
        @Comment("***********************"
	    		+"\nTourmaline Ores"
	    		+"\n***********************")
        public boolean tourmalineEnable = true;
        public int tourmalineVeinSize = 4;
    	public int tourmalineMaxLevel = 80;
    	public int tourmalinePerChunk = 12;
    	
        @Comment("***********************"
	    		+"\nKunzite Ores"
	    		+"\n***********************")
        public boolean kunziteEnable = true;
        public int kunziteVeinSize = 4;
    	public int kunziteMaxLevel = 70;
    	public int kunzitePerChunk = 12;

		@Comment("***********************"
				+"\nNether Kunzite Ores"
				+"\n***********************")
		public boolean kunziteEnableNether = true;
		public int kunziteVeinSizeNether = 4;
		public int kunziteMaxLevelNether = 200;
		public int kunzitePerChunkNether = 12;

        @Comment("***********************"
	    		+"\nTopaz Ores"
	    		+"\n***********************")
        public boolean topazEnable = true;
        public int topazVeinSize = 4;
    	public int topazMaxLevel = 60;
    	public int topazPerChunk = 12;

        @Comment("***********************"
	    		+"\nAlexandrite Ores"
	    		+"\n***********************")
        public boolean alexandriteEnable = true;
        public int alexandriteVeinSize = 4;
    	public int alexandriteMaxLevel = 60;
    	public int alexandritePerChunk = 12;

		@Comment("***********************"
				+"\nNether Alexandrite Ores"
				+"\n***********************")
		public boolean alexandriteEnableNether = true;
		public int alexandriteVeinSizeNether = 4;
		public int alexandriteMaxLevelNether = 200;
		public int alexandritePerChunkNether = 12;

		@Comment("***********************"
				+"\nCorundum Ores"
				+"\n***********************")
		public boolean conrundumEnable = true;
		public int conrundumVeinSize = 3;
		public int conrundumMaxLevel = 20;
		public int conrundumPerChunk = 12;

		@Comment("***********************"
				+"\nNether Corundum Ores"
				+"\n***********************")
		public boolean conrundumEnableNether = true;
		public int conrundumVeinSizeNether = 3;
		public int conrundumMaxLevelNether = 70;
		public int conrundumPerChunkNether = 12;

        @Comment("***********************"
 	    		+"\nSapphire Ores"
 	    		+"\n***********************")
        public boolean sapphireEnable = true;
        public int sapphireVeinSize = 4;
     	public int sapphireMaxLevel = 10;
     	public int sapphirePerChunk = 12;

		@Comment("***********************"
				+"\nDeepslate Sapphire Ores"
				+"\n***********************")
		public boolean sapphireEnableDeepslate = true;
		public int sapphireVeinSizeDeepslate = 4;
		public int sapphireMaxLevelDeepslate = 0;
		public int sapphirePerChunkDeepslate = 12;

        @Comment("***********************"
 	    		+"\nRuby Ores"
 	    		+"\n***********************")
        public boolean rubyEnable = true;
        public int rubyVeinSize = 4;
     	public int rubyMaxLevel = 10;
     	public int rubyPerChunk = 12;

		@Comment("***********************"
				+"\nDeepslate Ruby Ores"
				+"\n***********************")
		public boolean rubyEnableDeepslate = true;
		public int rubyVeinSizeDeepslate = 4;
		public int rubyMaxLevelDeepslate = 0;
		public int rubyPerChunkDeepslate = 12;

        @Comment("***********************"
 	    		+"\nCarbonado Ores"
 	    		+"\n***********************")
        public boolean carbonadoEnable = true;
        public int carbonadoVeinSize = 3;
     	public int carbonadoMaxLevel = 5;
     	public int carbonadoPerChunk = 12;

		@Comment("***********************"
				+"\nDeepslate Carbonado Ores"
				+"\n***********************")
		public boolean carbonadoEnableDeepslate = true;
		public int carbonadoVeinSizeDeepslate = 3;
		public int carbonadoMaxLevelDeepslate = 0;
		public int carbonadoPerChunkDeepslate = 12;

		@Comment("***********************"
				+"\nMoissanite Ores"
				+"\n***********************")
		public boolean moissaniteEnable = true;
		public int moissaniteVeinSize = 3;
		public int moissaniteMaxLevel = 25;
		public int moissanitePerChunk = 12;
		public int moissaniteHighMaxLevel = 128;
    }
    
    @Config(name = "general")
	public static class General implements ConfigData
	{       
       	@Comment("********"
    			+"\nGemBag"
    			+"\n********")
		public boolean gembagEnable = true;

		@Comment("********"
				+"\nSharpening Gem"
				+"\n********")
		public boolean enableSharpeningGem = false;
		public int sharpeningGemRepairAmount = 50;

    	@Comment("********"
    			+"\nJuju Settings"
    			+"\n********")
		public boolean jujuEnable = true;
		public float jujuChance = .06F;
		public boolean enableMoissaniteDocileHoglin = true;

		@Comment("********"
				+"\nTreasure Bags"
				+"\n********")
		public boolean enableTreasureBag = true;
		public float treasureBagChance = .015F;
		public boolean enableEnchantedBookDrop = true;

		@Comment("***************"
				+"\nEnchantments"
				+"\n***************")
		public boolean enableQuickening = true;
		public boolean enableRazorSharpness = true;
		public boolean enableShulkerBlade = true;
		public boolean enableUntouchable = true;
		public boolean enableFasterObsidian = true;
		public boolean enableBlinking = true;
		public boolean enableWisdom = true;
		public boolean enableStupify = true;
		public boolean enableVoidEscape = true;
		public boolean enableCreeperless = true;
		public boolean enableFloating = true;
		public boolean enableLightning = true;
		public boolean enableLavaView = true;
		public boolean enableBenevolence =  true;

		@Comment("***************"
				+"\nEnchantment Settings"
				+"\n***************")
		public float amountYellowHeartsQuickening = 10;
		public int durationQuickening = 40;
		public int strengthLevelQuickening = 1;
		public int speedLevelQuickening = 1;
		public int slownessLevelQuickening = 1;
		public int enemySlownessDurationTicksQuickening = 300;
		public float razorDamageIncrease = 6.0F;
		public int untouchableDamage = 7;
		public int shulkerBladeDurationTicks = 300;
		public int wisdomExperienceMultiplier = 5;
		public float lightningChance = 0.10F;
		public int floatingBaseDuration = 80;
		
		@Comment("********************************"
				+ "\n"
				+ "\n"
				+ "******************************"
				+"\nBows, Paxels, Hammers, & Excavators"
				+"\n********************************") 
		public boolean enableExtraTools = true;
		public boolean enableBows = true;
		public boolean enableHammers = true;
		public boolean enableExcavators = true;
		public boolean enablePaxels = true;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCITRINE TOOL MATERIAL"
				+ "\n******************************")
		public int citrineDurability = 825;
		public float citrineMiningSpeed = 6.0F;
		public float citrineAttackDamage = 2.0F;
		public int citrineMiningLevel = 2;
		public int citrineEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCITRINE ARMOR MATERIAL"
				+ "\n******************************")
		public int citrineDurabilityMultiplier = 16;
		public int citrineArmorEnchantability = 7;
		public float citrineToughness = 0.0F;
		public float citrineKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nTOURMALINE TOOL MATERIAL"
				+ "\n******************************")
		public int tourmalineDurability = 936;
		public float tourmalineMiningSpeed = 6.0F;
		public float tourmalineAttackDamage = 2.0F;
		public int tourmalineMiningLevel = 2;
		public int tourmalineEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nTOURMALINE ARMOR MATERIAL"
				+ "\n******************************")
		public int tourmalineDurabilityMultiplier = 21;
		public int tourmalineArmorEnchantability = 9;
		public float tourmalineToughness = 0.0F;
		public float tourmalineKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nKUNZITE TOOL MATERIAL"
				+ "\n******************************")
		public int kunziteDurability = 1092;
		public float kunziteMiningSpeed = 6.0F;
		public float kunziteAttackDamage = 2.0F;
		public int kunziteMiningLevel = 2;
		public int kunziteEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nKUNZITE ARMOR MATERIAL"
				+ "\n******************************")
		public int kunziteDurabilityMultiplier = 23;
		public int kunziteArmorEnchantability = 9;
		public float kunziteToughness = 0.0F;
		public float kunziteKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nEMERALD TOOL MATERIAL"
				+ "\n******************************")
		public int emeraldDurability = 1170;
		public float emeraldMiningSpeed = 6.0F;
		public float emeraldAttackDamage = 2.0F;
		public int emeraldMiningLevel = 2;
		public int emeraldEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nEMERALD ARMOR MATERIAL"
				+ "\n******************************")
		public int emeraldDurabilityMultiplier = 25;
		public int emeraldArmorEnchantability = 9;
		public float emeraldToughness = 0.0F;
		public float emeraldKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nTOPAZ TOOL MATERIAL"
				+ "\n******************************")
		public int topazDurability = 1248;
		public float topazMiningSpeed = 6.0F;
		public float topazAttackDamage = 2.0F;
		public int topazMiningLevel = 2;
		public int topazEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nTOPAZ ARMOR MATERIAL"
				+ "\n******************************")
		public int topazDurabilityMultiplier = 26;
		public int topazArmorEnchantability = 9;
		public float topazToughness = 0.0F;
		public float topazKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nALEXANDRITE TOOL MATERIAL"
				+ "\n******************************")
		public int alexandriteDurability = 1326;
		public float alexandriteMiningSpeed = 6.0F;
		public float alexandriteAttackDamage = 2.0F;
		public int alexandriteMiningLevel = 2;
		public int alexandriteEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nALEXANDRITE ARMOR MATERIAL"
				+ "\n******************************")
		public int alexandriteDurabilityMultiplier = 28;
		public int alexandriteArmorEnchantability = 9;
		public float alexandriteToughness = 0.0F;
		public float alexandriteKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCORUNDUM TOOL MATERIAL"
				+ "\n******************************")
		public int corundumDurability = 1404;
		public float corundumMiningSpeed = 6.0F;
		public float corundumAttackDamage = 2.0F;
		public int corundumMiningLevel = 3;
		public int corundumEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCORUNDUM ARMOR MATERIAL"
				+ "\n******************************")
		public int corundumDurabilityMultiplier = 30;
		public int corundumArmorEnchantability = 9;
		public float corundumToughness = 0.25F;
		public float corundumKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nSAPPHIRE TOOL MATERIAL"
				+ "\n******************************")
		public int sapphireDurability = 1404;
		public float sapphireMiningSpeed = 6.0F;
		public float sapphireAttackDamage = 2.0F;
		public int sapphireMiningLevel = 3;
		public int sapphireEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nSAPPHIRE ARMOR MATERIAL"
				+ "\n******************************")
		public int sapphireDurabilityMultiplier = 30;
		public int sapphireArmorEnchantability = 9;
		public float sapphireToughness = 0.25F;
		public float sapphireKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nRUBY TOOL MATERIAL"
				+ "\n******************************")
		public int rubyDurability = 1404;
		public float rubyMiningSpeed = 6.0F;
		public float rubyAttackDamage = 2.0F;
		public int rubyMiningLevel = 3;
		public int rubyEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nRUBY ARMOR MATERIAL"
				+ "\n******************************")
		public int rubyDurabilityMultiplier = 30;
		public int rubyArmorEnchantability = 9;
		public float rubyToughness = 0.5F;
		public float rubyKnockbackResistance = 0.0F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCARBONADO TOOL MATERIAL"
				+ "\n******************************")
		public int carbonadoDurability = 1561;
		public float carbonadoMiningSpeed = 8.0F;
		public float carbonadoAttackDamage = 3.0F;
		public int carbonadoMiningLevel = 3;
		public int carbonadoEnchantability = 24;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCARBONADO ARMOR MATERIAL"
				+ "\n******************************")
		public int carbonadoDurabilityMultiplier = 33;
		public int carbonadoArmorEnchantability = 10;
		public float carbonadoToughness = 0.75F;
		public float carbonadoKnockbackResistance = 0.25F;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nMOISSANITE TOOL MATERIAL"
				+ "\n******************************")
		public int moissaniteDurability = 2031;
		public float moissaniteMiningSpeed = 8.0F;
		public float moissaniteAttackDamage = 4.0F;
		public int moissaniteMiningLevel = 4;
		public int moissaniteEnchantability = 24;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nMOISSANITE ARMOR MATERIAL"
				+ "\n******************************")
		public int moissaniteDurabilityMultiplier = 33;
		public int moissaniteArmorEnchantability = 10;
		public float moissaniteToughness = 0.75F;
		public float moissaniteKnockbackResistance = 0.25F;
		public boolean enableMoissaniteCuring = true;
	}
}