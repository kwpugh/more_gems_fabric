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
	    		+"\nCitrine Ores"
	    		+"\n***********************")
	    public int citrineVeinSize = 6;
    	public int citrineMaxLevel = 180;
    	public int citrinePerChunk = 12;

    	       @Comment("***********************"
	    		+"\nTourmaline Ores"
	    		+"\n***********************")
        public int tourmalineVeinSize = 6;
    	public int tourmalineMaxLevel = 140;
    	public int tourmalinePerChunk = 12;
    	
        @Comment("***********************"
	    		+"\nKunzite Ores"
	    		+"\n***********************")
        public int kunziteVeinSize = 6;
    	public int kunziteMaxLevel = 120;
    	public int kunzitePerChunk = 12;

		@Comment("***********************"
				+"\nNether Kunzite Ores"
				+"\n***********************")
		public int kunziteVeinSizeNether = 6;
		public int kunziteMaxLevelNether = 200;
		public int kunzitePerChunkNether = 12;

        @Comment("***********************"
	    		+"\nTopaz Ores"
	    		+"\n***********************")
        public int topazVeinSize = 6;
    	public int topazMaxLevel = 60;
    	public int topazPerChunk = 12;

        @Comment("***********************"
	    		+"\nAlexandrite Ores"
	    		+"\n***********************")
        public int alexandriteVeinSize = 6;
    	public int alexandriteMaxLevel = 60;
    	public int alexandritePerChunk = 12;

		@Comment("***********************"
				+"\nNether Alexandrite Ores"
				+"\n***********************")
		public int alexandriteVeinSizeNether = 6;
		public int alexandriteMaxLevelNether = 200;
		public int alexandritePerChunkNether = 12;

		@Comment("***********************"
				+"\nCorundum Ores"
				+"\n***********************")
		public int corundumVeinSize = 5;
		public int corundumMaxLevel = 30;
		public int corundumPerChunk = 12;

		@Comment("***********************"
				+"\nNether Corundum Ores"
				+"\n***********************")
		public int corundumVeinSizeNether = 5;
		public int corundumMaxLevelNether = 70;
		public int corundumPerChunkNether = 12;

        @Comment("***********************"
 	    		+"\nSapphire Ores"
 	    		+"\n***********************")
        public int sapphireVeinSize = 5;
     	public int sapphireMaxLevel = 30;
     	public int sapphirePerChunk = 12;

		@Comment("***********************"
				+"\nDeepslate Sapphire Ores"
				+"\n***********************")
		public int sapphireVeinSizeDeepslate = 5;
		public int sapphireMaxLevelDeepslate = 0;
		public int sapphirePerChunkDeepslate = 12;

        @Comment("***********************"
 	    		+"\nSpinel Ores"
 	    		+"\n***********************")
        public int spinelVeinSize = 5;
     	public int spinelMaxLevel = 20;
     	public int spinelPerChunk = 12;

		@Comment("***********************"
				+"\nDeepslate Spinel Ores"
				+"\n***********************")
		public int spinelVeinSizeDeepslate = 5;
		public int spinelMaxLevelDeepslate = 0;
		public int spinelPerChunkDeepslate = 12;

        @Comment("***********************"
 	    		+"\nCarbonado Ores"
 	    		+"\n***********************")
        public int carbonadoVeinSize = 5;
     	public int carbonadoMaxLevel = 15;
     	public int carbonadoPerChunk = 12;

		@Comment("***********************"
				+"\nDeepslate Carbonado Ores"
				+"\n***********************")
		public int carbonadoVeinSizeDeepslate = 5;
		public int carbonadoMaxLevelDeepslate = 0;
		public int carbonadoPerChunkDeepslate = 10;

		@Comment("***********************"
				+"\nMoissanite Ores"
				+"\n***********************")
		public int moissaniteVeinSize = 5;
		public int moissaniteMaxLevel = 25;
		public int moissanitePerChunk = 12;
		public int moissaniteHighMaxLevel = 30;
    }
    
    @Config(name = "general")
	public static class General implements ConfigData
	{
		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nBow Zoom Multiplier"
				+"\n- vanilla bow value = .15F"
				+"\n- pretty good value = .45F"
				+"\n- awesome value = .75F"
				+"\n******************************")
		public float bowZoomMultiplier = .45F;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nGlobal Gem Bow Settings"
				+"\n******************************")
		public float projectileSpeed = 6.0F;
		public double projectileDamageFactorFirst = 0.20D;
		public double projectileDamageFactorSecond = 0.5D;
		public float projectileDivergence = 0.0F;

		@Comment("********"
				+"\nSharpening Gems"
				+"\n********")
		public int sharpeningGemRepairAmount = 50;
		public int sharpeningGemGreaterRepairAmount = 100;

    	@Comment("********"
    			+"\nJuju Settings"
    			+"\n********")
		public float jujuChance = .06F;
		public boolean enableMoissaniteDocileHoglin = true;

		@Comment("********"
				+"\nJuju Crown"
				+"\n********")
		public boolean enableJujuCrownPowers = true;
		public boolean enableJujuCrownNetheritePowers = true;

		@Comment("********"
				+"\nTreasure Bags"
				+"\n********")
		public float treasureBagChance = .015F;
		public boolean enableEnchantedBookDrop = true;
		public boolean enableWanderingTrades = true;
		public String defaultDrop = "minecraft:gunpowder";

		@Comment("***************"
				+"\nEnchantment Settings"
				+"\n***************")
		public boolean enableQuickeningEffect = true;
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
		public int minngHelperVertical = 2;
		public int minerHelperHoriz = 4;
		public int attractingBaseHorizontalRadius = 6;
		public boolean boundReturnAll = false;

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
				+ "\nSPINEL TOOL MATERIAL"
				+ "\n******************************")
		public int spinelDurability = 1404;
		public float spinelMiningSpeed = 6.0F;
		public float spinelAttackDamage = 2.0F;
		public int spinelMiningLevel = 3;
		public int spinelEnchantability = 14;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nSPINEL ARMOR MATERIAL"
				+ "\n******************************")
		public int spinelDurabilityMultiplier = 30;
		public int spinelArmorEnchantability = 9;
		public float spinelToughness = 0.5F;
		public float spinelKnockbackResistance = 0.0F;

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