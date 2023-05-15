package boosty.strengthzombie.EventHandlers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventHandlers implements Listener {

    @EventHandler
    public void SpawnStrengthZombie(CreatureSpawnEvent e){
        if(e.getEntity() instanceof Zombie){
            Zombie zombie = (Zombie) e.getEntity();
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2929139,1));
            zombie.getEquipment().setHelmet(new ItemStack(Material.NETHERITE_HELMET));
            zombie.getEquipment().setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE));
            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
        }
    }
}
