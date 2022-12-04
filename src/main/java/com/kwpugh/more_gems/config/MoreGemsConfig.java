package com.kwpugh.more_gems.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "more_gems")
public class MoreGemsConfig extends PartitioningSerializer.GlobalData 
{
    public General GENERAL = new General();
    
    @Config(name = "general")
	public static class General implements ConfigData
	{
		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nGlobal Gem Bow Settings"
				+"\n******************************")
		public float projectileSpeed = 4.0F;
		public float projectileDivergence = 0.0F;
		public float projectileRoll = 0.0F;
		public double projectilePowerDamageBonus = 0.60D;
		public int projectileFlameBurnSeconds = 100;
		public double projectileExtraDamage = 0.0D;
		public int projectileDropRange = 15;

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
				+"\nGem Arrow Effects"
				+"\n******************************")
		public boolean alexandritePowderSnow = true;
		public boolean corundumCobwebs = true;
		public boolean sapphireDarknessCloud = true;
		public boolean spinelPoisonCloud = true;
		public boolean carbonadoExplosion = true;
		public boolean carbonadoExplosionOnBlock = true;
		public boolean moissaniteFireCloud = true;
		public boolean moissaniteFireCloudOnBlock = true;

		@Comment("\n"
				+"\n"
				+"\n"
				+"******************************"
				+"\nGem Arrow Settings"
				+"\n- note: amplifer levels start at 0"
				+"\n******************************")
		public float citrineExtraDamage = 1.0F;
		public byte citrinePierceLevel = 1;
		public int citrinePunchLevel = 1;
		public float tourmalineExtraDamage = 1.25F;
		public byte tourmalinePierceLevel = 1;
		public int tourmalinePunchLevel = 1;
		public float kunziteExtraDamage = 1.5F;
		public byte kunzitePierceLevel = 1;
		public int kunzitePunchLevel = 1;
		public float topazExtraDamage = 1.75F;
		public byte topazPierceLevel = 1;
		public int topazPunchLevel = 1;
		public float alexandriteExtraDamage = 2.0F;
		public byte alexandritePierceLevel = 1;
		public int alexandritePunchLevel = 1;
		public int alexandriteSlownessAmplifier = 0;
		public int alexandriteSlownessDuration = 300;
		public float corundumExtraDamage = 2.25F;
		public byte corundumPierceLevel = 1;
		public int corundumPunchLevel = 1;
		public int corundumBlindnessAmplifier = 0;
		public int corundumBlindnessDuration = 300;
		public float sapphireExtraDamage = 2.5F;
		public byte sapphirePierceLevel = 1;
		public int sapphirePunchLevel = 1;
		public int sapphireDarknessAmplifier = 0;
		public int sapphireDarknessDuration = 300;
		public float spinelExtraDamage = 2.75F;
		public byte spinelPierceLevel = 1;
		public int spinelPunchLevel = 1;
		public int spinelPoisonAmplifier = 0;
		public int spinelPoisonDuration = 300;
		public float spinelArrowLootChance = .08F;
		public float carbonadoExtraDamage = 3.0F;
		public byte carbonadoPierceLevel = 1;
		public int carbonadoPunchLevel = 2;
		public int carbonadoSlownessAmplifier = 1;
		public int carbonadoSlownessDuration = 300;
		public int carbonadoExplosionFactor = 2;
		public float carbonadoArrowLootChance = .08F;
		public float moissaniteExtraDamage = 4.0F;
		public byte moissanitePierceLevel = 2;
		public int moissanitePunchLevel = 2;
		public int moissaniteWitherAmplifier = 1;
		public int moissaniteWitherDuration = 300;
		public float moissaniteArrowLootChance = .08F;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nSharpening Gems"
				+ "\n******************************")
		public float sharpeningGemLootChance = .30F;
		public int sharpeningGemRepairAmount = 250;
		public int sharpeningGemGreaterRepairAmount = 500;

		@Comment("\n"
				+"\n"
				+"******************************"
    			+"\nJuju Settings"
				+ "\n******************************")
		public float jujuChance = .06F;
		public boolean enableMoissaniteDocileHoglin = true;
		public boolean enableJujuInEnderchest = true;
		public int sapphireJujuTickDelay = 1200;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nJuju Crown"
				+ "\n******************************")
		public boolean enableJujuCrownPowers = true;
		public boolean enableJujuCrownNetheritePowers = true;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nTreasure Bags"
				+ "\n******************************")
		public float treasureBagChance = .015F;
		public boolean enableEnchantedBookDrop = true;
		public boolean enableWanderingTrades = true;
		public String defaultDrop = "minecraft:gunpowder";

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nEnable/Disable Enchantments"
				+ "\n******************************")
		public boolean enableAttracting = true;
		public boolean enableBenevolence = true;
		public boolean enableClimbing = true;
		public boolean enableBlinking = true;
		public boolean enableBound = true;
		public boolean enableCreeperless = true;
		public boolean enableFloating = true;
		public boolean enableFreezeProtection = true;
		public boolean enableGliding = true;
		public boolean enableGuiding = true;
		public boolean enableLavaView = true;
		public boolean enableLightning = true;
		public boolean enableMercyKill = true;
		public boolean enableMight = true;
		public boolean enableMiningHelper = true;
		public boolean enableObsidinator = true;
		public boolean enableQuickening = true;
		public boolean enableRazorSharpness = true;
		public boolean enableShulkerBlade = true;
		public boolean enableStout = true;
		public boolean enableStupefy = true;
		public boolean enableUntouchable = true;
		public boolean enableVoidEscape = true;
		public boolean enableWisdom = true;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nEnchantment Settings"
				+ "\n******************************")
		public int attractingBaseHorizontalRadius = 6;
		public int blinkingAttackSafeDistance = 3;
		public int blinkingEvadeStarting = 24;
		public int blinkingEvadeEnding = 26;
		public boolean boundReturnAll = false;
		public int floatingBaseDuration = 80;
		public int guidingTargetArea = 14;
		public float lightningChance = 0.10F;
		public double mightAttackDamageModifier = 0.5D;
		public double mightKnockbackModifier = 0.25D;
		public double mightAttackSpeedModifier = 0.25D;
		public int miningHelperVertical = 2;
		public int miningHelperHoriz = 4;
		public boolean quickeningEnableEffect = true;
		public float quickeningAmountYellowHearts = 10;
		public int quickeningDuration = 40;
		public int quickeningStrengthLevel = 1;
		public int quickeningSpeedLevel = 1;
		public int quickeningSlownessLevel = 1;
		public int quickeningEnemySlownessDurationTicks = 300;
		public boolean quickeningStrengthEnable = true;
		public boolean quickeningHealthEnable = true;
		public boolean quickeningSpeedEnable = true;
		public boolean quickeningWeaknessEnable = true;
		public float razorDamageIncrease = 6.0F;
		public int shulkerBladeDurationTicks = 300;
		public double stoutToughnessModifier = 0.25D;
		public double stoutArmorModifier = 0.5D;
		public double stoutHealthModifier = 0.5D;
		public double stupefyChanceMultiplier = .15;
		public int stupefyLevelOneDurationTicks = 20;
		public int stupefyLevelTwoDurationTicks = 60;
		public int stupefyLevelThreeDurationTicks = 90;
		public float untouchableChance = .50F;
		public float untouchableBaseDamage = 7;
		public int wisdomExpBaseValue = 25;
		public int wisdomExpMultiplier = 5;

		@Comment("\n"
				+"\n"
				+"******************************"
				+"\nFull Tool Damage"
				+"\n- effects hammer/excavator"
				+ "\n******************************")
		public boolean enableFullDamage = false;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCITRINE TOOL MATERIAL"
				+ "\n******************************")
		public int citrineDurability = 825;
		public float citrineMiningSpeed = 6.0F;
		public float citrineAttackDamage = 2.0F;
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
		public int citrineHeadProtection = 2;
		public int citrineChestProtection = 6;
		public int citrineLeggingsProtection = 5;
		public int citrineBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nTOURMALINE TOOL MATERIAL"
				+ "\n******************************")
		public int tourmalineDurability = 936;
		public float tourmalineMiningSpeed = 6.0F;
		public float tourmalineAttackDamage = 2.0F;
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
		public int tourmalineHeadProtection = 2;
		public int tourmalineChestProtection = 6;
		public int tourmalineLeggingsProtection = 5;
		public int tourmalineBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nKUNZITE TOOL MATERIAL"
				+ "\n******************************")
		public int kunziteDurability = 1092;
		public float kunziteMiningSpeed = 6.0F;
		public float kunziteAttackDamage = 2.0F;
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
		public int kunziteHeadProtection = 2;
		public int kunziteChestProtection = 6;
		public int kunziteLeggingsProtection = 5;
		public int kunziteBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nTOPAZ TOOL MATERIAL"
				+ "\n******************************")
		public int topazDurability = 1248;
		public float topazMiningSpeed = 6.0F;
		public float topazAttackDamage = 2.0F;
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
		public int topazHeadProtection = 2;
		public int topazChestProtection = 6;
		public int topazLeggingsProtection = 5;
		public int topazBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nALEXANDRITE TOOL MATERIAL"
				+ "\n******************************")
		public int alexandriteDurability = 1326;
		public float alexandriteMiningSpeed = 6.0F;
		public float alexandriteAttackDamage = 2.0F;
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
		public int alexandriteHeadProtection = 2;
		public int alexandriteChestProtection = 6;
		public int alexandriteLeggingsProtection = 5;
		public int alexandriteBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCORUNDUM TOOL MATERIAL"
				+ "\n******************************")
		public int corundumDurability = 1404;
		public float corundumMiningSpeed = 6.0F;
		public float corundumAttackDamage = 2.0F;
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
		public int corundumHeadProtection = 2;
		public int corundumChestProtection = 7;
		public int corundumLeggingsProtection = 5;
		public int corundumBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nSAPPHIRE TOOL MATERIAL"
				+ "\n******************************")
		public int sapphireDurability = 1404;
		public float sapphireMiningSpeed = 6.0F;
		public float sapphireAttackDamage = 2.0F;
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
		public int sapphireHeadProtection = 2;
		public int sapphireChestProtection = 7;
		public int sapphireLeggingsProtection = 5;
		public int sapphireBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nSPINEL TOOL MATERIAL"
				+ "\n******************************")
		public int spinelDurability = 1404;
		public float spinelMiningSpeed = 6.0F;
		public float spinelAttackDamage = 2.0F;
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
		public int spinelHeadProtection = 2;
		public int spinelChestProtection = 7;
		public int spinelLeggingsProtection = 5;
		public int spinelBootsProtection = 2;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nCARBONADO TOOL MATERIAL"
				+ "\n******************************")
		public int carbonadoDurability = 1561;
		public float carbonadoMiningSpeed = 8.0F;
		public float carbonadoAttackDamage = 3.0F;
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
		public int carbonadoHeadProtection = 3;
		public int carbonadoChestProtection = 8;
		public int carbonadoLeggingsProtection = 6;
		public int carbonadoBootsProtection = 3;

		@Comment("\n"
				+ "\n"
				+ "\n"
				+ "******************************"
				+ "\nMOISSANITE TOOL MATERIAL"
				+ "\n******************************")
		public int moissaniteDurability = 2031;
		public float moissaniteMiningSpeed = 8.0F;
		public float moissaniteAttackDamage = 4.0F;
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
		public int moissaniteHeadProtection = 3;
		public int moissaniteChestProtection = 8;
		public int moissaniteLeggingsProtection = 6;
		public int moissaniteBootsProtection = 3;
	}
}