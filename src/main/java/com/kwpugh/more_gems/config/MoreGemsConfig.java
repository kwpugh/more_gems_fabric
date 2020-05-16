package com.kwpugh.more_gems.config;

import com.kwpugh.more_gems.MoreGems;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name=MoreGems.MOD_ID)
public class MoreGemsConfig implements ConfigData
{
	public Citrine CITRINE = new Citrine();
	public Tourmaline TOURMALINE = new Tourmaline();
	public Amethyst AMETHYST = new Amethyst();
	public Topaz TOPAZ = new Topaz();
	public Alexandrite ALEXANDRITE = new Alexandrite();
	public Sapphire SAPPHIRE = new Sapphire();
	public Ruby RUBY = new Ruby();
	public Corundum CORUNDUM = new Corundum();
	public Carbonado CARBONADO = new Carbonado();

	public Juju JUJU = new Juju();

	public OreBlocks ORE_BLOCKS = new OreBlocks();

	public GemBiomes GEM_BIOMES = new GemBiomes();

	public Enchantments ENCHANTMENTS = new Enchantments();

	public static class Citrine
	{
		public boolean citrine = true;
		public int citrineSize = 3;
		public int citrineMinLevel = 45;
		public int citrineMaxLevel = 60;
	}

	public static class Tourmaline
	{
		public boolean tourmaline = true;
		public int tourmalineSize = 3;
		public int tourmalineMinLevel = 40;
		public int tourmalineMaxLevel = 50;
	}

	public static class Amethyst
	{
		public boolean amethyst = true;
		public int amethystSize = 3;
		public int amethystMinLevel = 40;
		public int amethystMaxLevel = 50;
	}

	public static class Topaz
	{
		public boolean topaz = true;
		public int topazSize = 3;
		public int topazMinLevel = 40;
		public int topazMaxLevel = 50;
	}

	public static class Alexandrite
	{
		public boolean alexandrite = true;
		public int alexandriteSize = 3;
		public int alexandriteMinLevel = 30;
		public int alexandriteMaxLevel = 40;
	}

	public static class Sapphire
	{
		public boolean sapphire = true;
		public int sapphireSize = 3;
		public int sapphireMinLevel = 20;
		public int sapphireMaxLevel = 30;
	}

	public static class Ruby
	{
		public boolean ruby = true;
		public int rubySize = 3;
		public int rubyMinLevel = 20;
		public int rubyMaxLevel = 30;
	}

	public static class Corundum
	{
		public boolean corundum = true;
		public int corundumSize = 3;
		public int corundumMinLevel = 10;
		public int corundumMaxLevel = 20;
	}

	public static class Carbonado
	{
		public boolean carbonado = true;
		public int carbonadoSize = 5;
		public int carbonadoMinLevel = 1;
		public int carbonadoMaxLevel = 15;
	}

	public static class Juju
	{
		public boolean jujuEnable = true;
		public float jujuChance = .02F;
	}

	public static class OreBlocks
	{
		public boolean enableOreBlocks = true;
	}

	public static class GemBiomes
	{
		public boolean enableGemBiomes = false;
		public double biomeWeight = 0.15D;
		public int gemBiomeBonus = 3;
	}

	public static class Enchantments
	{
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
	}
}