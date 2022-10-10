package fr.reycun.mineallblocks.file;

import fr.reycun.mineallblocks.MineAllBlocks;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class ConfigFile implements CommandExecutor {

    private MineAllBlocks mineAllBlocks;

    public ConfigFile(MineAllBlocks mineAllBlocks) {
        this.mineAllBlocks = mineAllBlocks;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("yoyo")) {
            createConfig();
        }
        return false;
    }

    public void createConfig(){
        for (Material material : Material.values()){
            if (material.isItem() && material.isBlock()){
                //System.out.println(material+" bloc et item");
                this.mineAllBlocks.getConfig().set("__"+material.toString(),"minable");
            }
        }
        this.mineAllBlocks.saveConfig();
    }

}
