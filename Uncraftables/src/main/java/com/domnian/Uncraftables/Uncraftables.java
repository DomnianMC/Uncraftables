package com.domnian.Uncraftables;

import java.io.IOException;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ShapedRecipe;

import org.bukkit.plugin.java.JavaPlugin;

public class Uncraftables extends JavaPlugin {

	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		    try {
        Metrics metrics = new Metrics(this);
        metrics.start();
    } catch (IOException e) {
        // Failed to submit the stats :-(
    }

	}

	@Override
	public void onDisable() {

	}

}