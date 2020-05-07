package com.kwpugh.more_gems.config;

import com.kwpugh.more_gems.MoreGems;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name=MoreGems.MOD_ID)
public class MoreGemsConfig implements ConfigData
{
	public Ores ORES = new Ores();
	public Juju JUJU = new Juju();
	public OreBlocks ORE_BLOCKS = new OreBlocks();

	public static class Ores
	{
		public boolean citrine = true;
		public boolean tourmaline = true;
		public boolean amethyst = true;
		public boolean topaz = true;
		public boolean alexandrite = true;
		public boolean sapphire = true;
		public boolean ruby = true;
		public boolean corundum = true;
		public boolean carbonado = true;
	}
	
	public static class Juju
	{
		public boolean jujuEnable = true;
	}
	
	public static class OreBlocks
	{
		public boolean enableOreBlocks = true;
	}	
}