package com.kwpugh.more_gems.config;

import com.kwpugh.more_gems.MoreGems;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name=MoreGems.MOD_ID)
public class MoreGemsConfig implements ConfigData
{	
	public Juju JUJU = new Juju();

	public Enchantments ENCHANTMENTS = new Enchantments();

	public static class Juju
	{
		public boolean jujuEnable = true;
		public float jujuChance = .02F;
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