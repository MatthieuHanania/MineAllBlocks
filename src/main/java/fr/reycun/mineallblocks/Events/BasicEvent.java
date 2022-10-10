package fr.reycun.mineallblocks.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class BasicEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.GOLD+event.getPlayer().getName()+ChatColor.GRAY+" a rejoint");
    }

    @EventHandler
    public void onMine(BlockBreakEvent event){

        Bukkit.broadcastMessage(ChatColor.GOLD+event.getPlayer().getName()+ChatColor.WHITE+" a miné "+ChatColor.LIGHT_PURPLE+event.getBlock().getType());

    }
}
