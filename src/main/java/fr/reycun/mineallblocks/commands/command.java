package fr.reycun.mineallblocks.commands;

import fr.reycun.mineallblocks.MineAllBlocks;
import fr.reycun.mineallblocks.file.ConfigFile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor {

    private MineAllBlocks mineAllBlocks;

    public command(MineAllBlocks mineAllBlocks) {
        this.mineAllBlocks = mineAllBlocks;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        return false;
    }
}
