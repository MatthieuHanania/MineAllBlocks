package fr.reycun.mineallblocks;

import fr.reycun.mineallblocks.Events.BasicEvent;
import fr.reycun.mineallblocks.commands.command;
import fr.reycun.mineallblocks.file.ConfigFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.C;

public final class MineAllBlocks extends JavaPlugin {


    @Override
    public void onEnable() {
        System.out.println("Plugin en cours de fabrication...");

        getServer().getPluginManager().registerEvents(new BasicEvent(),this);

        //getCommand("yoyo").setExecutor(new ConfigFile(this));

        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }




}
