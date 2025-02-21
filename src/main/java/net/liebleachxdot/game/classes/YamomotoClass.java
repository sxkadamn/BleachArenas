package net.liebleachxdot.game.classes;

import net.liebleachxdot.abilities.FireAbility;
import net.liebleachxdot.tools.Utility;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class YamomotoClass implements Listener, BClasses {

    private final List<Player> players;

    private final String name;


    private final int maxPlayers;

    public YamomotoClass() {
        this.players = new ArrayList<>();
        this.name = "&e&lЯмомото";
        this.maxPlayers = 1;
    }

    @Override
    public void grantAbilities() {
        for(Player player : players) {
            player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
        }
    }

    @Override
    public void addPlayer(Player player) {

        if(players.contains(player))
            return;

        players.add(player);

        Utility.sendMessage(player, "&6Теперь ты владеешь классом " + name, false);
    }

    @EventHandler
    public void listenerAbility(EntityDamageByEntityEvent event) {

        if(!(event.getDamager() instanceof Player)) return;

        if(!(event.getEntity() instanceof Player)) return;

        Player attacker = (Player) event.getDamager();
        Player target = (Player) event.getEntity();

        if (new Random().nextDouble() <= 0.3) {
            if (players.contains(attacker)) {
                new FireAbility(target, attacker).ability();
            }
        }
    }

    @Override
    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
