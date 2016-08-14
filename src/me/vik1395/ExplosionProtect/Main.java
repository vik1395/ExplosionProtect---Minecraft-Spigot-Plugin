package me.vik1395.ExplosionProtect;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;
/*

Author: Vik1395
Project: ExplosionProtect

Copyright 2014

Licensed under Creative CommonsAttribution-ShareAlike 4.0 International Public License (the "License");
You may not use this file except in compliance with the License.

You may obtain a copy of the License at http://creativecommons.org/licenses/by-sa/4.0/legalcode

You may find an abridged version of the License at http://creativecommons.org/licenses/by-sa/4.0/
 */

public class Main extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		Bukkit.getPluginManager().registerEvents(this, this);
		getLogger().info("ExplosionProtect has started successfully");
		getLogger().info("Created by Vik1395");
	}
	
	@EventHandler
	public void onEntityExplodeEvent(EntityExplodeEvent e)
	{
		List<Block> blocks = e.blockList();
		for(int i = 0; i<=blocks.size();i++)
		{
			Block b = blocks.get(i);
			if(b.getType().equals(Material.CHEST)||b.getType().equals(Material.TRAPPED_CHEST)||b.getType().equals(Material.BED))
			{
				e.setCancelled(true);
			}
		}
	}
}
