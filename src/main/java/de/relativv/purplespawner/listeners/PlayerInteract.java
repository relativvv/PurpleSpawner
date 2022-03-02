package de.relativv.purplespawner.listeners;

import de.relativv.purplespawner.main.PurpleSpawner;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerInteract implements Listener {

    private PurpleSpawner purpleSpawner;
    public PlayerInteract(PurpleSpawner purpleSpawner) {
        this.purpleSpawner = purpleSpawner;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(e.getClickedBlock() != null) {
                if(e.getClickedBlock().getType() == Material.SPAWNER) {
                    if(p.getInventory().getItemInMainHand().getType() == Material.AXOLOTL_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.BAT_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.BEE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.BLAZE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.CAT_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.CAVE_SPIDER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.CHICKEN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.COD_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.COW_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.CREEPER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.DOLPHIN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.DONKEY_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.DROWNED_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ELDER_GUARDIAN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ENDERMAN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ENDERMITE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.EVOKER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.FOX_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.GHAST_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.GLOW_SQUID_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.GOAT_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.GUARDIAN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.HOGLIN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.HORSE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.HUSK_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.LLAMA_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.MAGMA_CUBE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.MOOSHROOM_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.MULE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.OCELOT_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PANDA_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PARROT_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PHANTOM_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PIG_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PIGLIN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PIGLIN_BRUTE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PILLAGER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.POLAR_BEAR_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.PUFFERFISH
                            || p.getInventory().getItemInMainHand().getType() == Material.RABBIT_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.RAVAGER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SALMON_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SHEEP_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SHULKER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SILVERFISH_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SKELETON_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SKELETON_HORSE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SLIME_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SPIDER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.SQUID_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.STRAY_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.STRIDER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.TRADER_LLAMA_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.TROPICAL_FISH_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.TURTLE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.VEX_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.VILLAGER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.WANDERING_TRADER_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.WITCH_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.WITHER_SKELETON_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.WOLF_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ZOGLIN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ZOMBIE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ZOMBIE_HORSE_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ZOMBIFIED_PIGLIN_SPAWN_EGG
                            || p.getInventory().getItemInMainHand().getType() == Material.ZOMBIE_VILLAGER_SPAWN_EGG) {

                        e.setCancelled(true);

                        if (p.hasPermission("purplespawner.eggchange")) {

                            CreatureSpawner spawner = (CreatureSpawner) e.getClickedBlock().getState();
                            EntityType ent = null;
                            switch (p.getInventory().getItemInMainHand().getType()) {
                                case AXOLOTL_SPAWN_EGG:
                                    ent = EntityType.AXOLOTL;
                                    break;
                                case BAT_SPAWN_EGG:
                                    ent = EntityType.BAT;
                                    break;
                                case BEE_SPAWN_EGG:
                                    ent = EntityType.BEE;
                                    break;
                                case BLAZE_SPAWN_EGG:
                                    ent = EntityType.BLAZE;
                                    break;
                                case CAT_SPAWN_EGG:
                                    ent = EntityType.CAT;
                                    break;
                                case CAVE_SPIDER_SPAWN_EGG:
                                    ent = EntityType.CAVE_SPIDER;
                                    break;
                                case CHICKEN_SPAWN_EGG:
                                    ent = EntityType.CHICKEN;
                                    break;
                                case COD_SPAWN_EGG:
                                    ent = EntityType.COD;
                                    break;
                                case COW_SPAWN_EGG:
                                    ent = EntityType.COW;
                                    break;
                                case CREEPER_SPAWN_EGG:
                                    ent = EntityType.CREEPER;
                                    break;
                                case DOLPHIN_SPAWN_EGG:
                                    ent = EntityType.DOLPHIN;
                                    break;
                                case DONKEY_SPAWN_EGG:
                                    ent = EntityType.DONKEY;
                                    break;
                                case DROWNED_SPAWN_EGG:
                                    ent = EntityType.DROWNED;
                                    break;
                                case ELDER_GUARDIAN_SPAWN_EGG:
                                    ent = EntityType.ELDER_GUARDIAN;
                                    break;
                                case ENDERMAN_SPAWN_EGG:
                                    ent = EntityType.ENDERMAN;
                                    break;
                                case ENDERMITE_SPAWN_EGG:
                                    ent = EntityType.ENDERMITE;
                                    break;
                                case EVOKER_SPAWN_EGG:
                                    ent = EntityType.EVOKER;
                                    break;
                                case FOX_SPAWN_EGG:
                                    ent = EntityType.FOX;
                                    break;
                                case GHAST_SPAWN_EGG:
                                    ent = EntityType.GHAST;
                                    break;
                                case GLOW_SQUID_SPAWN_EGG:
                                    ent = EntityType.GLOW_SQUID;
                                    break;
                                case GOAT_SPAWN_EGG:
                                    ent = EntityType.GOAT;
                                    break;
                                case GUARDIAN_SPAWN_EGG:
                                    ent = EntityType.GUARDIAN;
                                    break;
                                case HOGLIN_SPAWN_EGG:
                                    ent = EntityType.HOGLIN;
                                    break;
                                case HORSE_SPAWN_EGG:
                                    ent = EntityType.HORSE;
                                    break;
                                case HUSK_SPAWN_EGG:
                                    ent = EntityType.HUSK;
                                    break;
                                case LLAMA_SPAWN_EGG:
                                    ent = EntityType.LLAMA;
                                    break;
                                case MAGMA_CUBE_SPAWN_EGG:
                                    ent = EntityType.MAGMA_CUBE;
                                    break;
                                case MOOSHROOM_SPAWN_EGG:
                                    ent = EntityType.MUSHROOM_COW;
                                    break;
                                case MULE_SPAWN_EGG:
                                    ent = EntityType.MULE;
                                    break;
                                case OCELOT_SPAWN_EGG:
                                    ent = EntityType.OCELOT;
                                    break;
                                case PANDA_SPAWN_EGG:
                                    ent = EntityType.PANDA;
                                    break;
                                case PARROT_SPAWN_EGG:
                                    ent = EntityType.PARROT;
                                    break;
                                case PHANTOM_SPAWN_EGG:
                                    ent = EntityType.PHANTOM;
                                    break;
                                case PIG_SPAWN_EGG:
                                    ent = EntityType.PIG;
                                    break;
                                case PIGLIN_SPAWN_EGG:
                                    ent = EntityType.PIGLIN;
                                    break;
                                case PIGLIN_BRUTE_SPAWN_EGG:
                                    ent = EntityType.PIGLIN_BRUTE;
                                    break;
                                case PILLAGER_SPAWN_EGG:
                                    ent = EntityType.PILLAGER;
                                    break;
                                case POLAR_BEAR_SPAWN_EGG:
                                    ent = EntityType.POLAR_BEAR;
                                    break;
                                case PUFFERFISH_SPAWN_EGG:
                                    ent = EntityType.PUFFERFISH;
                                    break;
                                case RABBIT_SPAWN_EGG:
                                    ent = EntityType.RABBIT;
                                    break;
                                case RAVAGER_SPAWN_EGG:
                                    ent = EntityType.RAVAGER;
                                    break;
                                case SALMON_SPAWN_EGG:
                                    ent = EntityType.SALMON;
                                    break;
                                case SHEEP_SPAWN_EGG:
                                    ent = EntityType.SHEEP;
                                    break;
                                case SHULKER_SPAWN_EGG:
                                    ent = EntityType.SHULKER;
                                    break;
                                case SILVERFISH_SPAWN_EGG:
                                    ent = EntityType.SILVERFISH;
                                    break;
                                case SKELETON_SPAWN_EGG:
                                    ent = EntityType.SKELETON;
                                    break;
                                case SKELETON_HORSE_SPAWN_EGG:
                                    ent = EntityType.SKELETON_HORSE;
                                    break;
                                case SLIME_SPAWN_EGG:
                                    ent = EntityType.SLIME;
                                    break;
                                case SPIDER_SPAWN_EGG:
                                    ent = EntityType.SPIDER;
                                    break;
                                case SQUID_SPAWN_EGG:
                                    ent = EntityType.SQUID;
                                    break;
                                case STRAY_SPAWN_EGG:
                                    ent = EntityType.STRAY;
                                    break;
                                case STRIDER_SPAWN_EGG:
                                    ent = EntityType.STRIDER;
                                    break;
                                case TRADER_LLAMA_SPAWN_EGG:
                                    ent = EntityType.TRADER_LLAMA;
                                    break;
                                case TROPICAL_FISH_SPAWN_EGG:
                                    ent = EntityType.TROPICAL_FISH;
                                    break;
                                case TURTLE_SPAWN_EGG:
                                    ent = EntityType.TURTLE;
                                    break;
                                case VEX_SPAWN_EGG:
                                    ent = EntityType.VEX;
                                    break;
                                case VILLAGER_SPAWN_EGG:
                                    ent = EntityType.VILLAGER;
                                    break;
                                case VINDICATOR_SPAWN_EGG:
                                    ent = EntityType.VINDICATOR;
                                    break;
                                case WANDERING_TRADER_SPAWN_EGG:
                                    ent = EntityType.WANDERING_TRADER;
                                    break;
                                case WITCH_SPAWN_EGG:
                                    ent = EntityType.WITCH;
                                    break;
                                case WITHER_SKELETON_SPAWN_EGG:
                                    ent = EntityType.WITHER_SKELETON;
                                    break;
                                case WOLF_SPAWN_EGG:
                                    ent = EntityType.WOLF;
                                    break;
                                case ZOGLIN_SPAWN_EGG:
                                    ent = EntityType.ZOGLIN;
                                    break;
                                case ZOMBIE_SPAWN_EGG:
                                    ent = EntityType.ZOMBIE;
                                    break;
                                case ZOMBIE_HORSE_SPAWN_EGG:
                                    ent = EntityType.ZOMBIE_HORSE;
                                    break;
                                case ZOMBIFIED_PIGLIN_SPAWN_EGG:
                                    ent = EntityType.ZOMBIFIED_PIGLIN;
                                    break;
                                case ZOMBIE_VILLAGER_SPAWN_EGG:
                                    ent = EntityType.ZOMBIE_VILLAGER;
                                    break;
                                default:
                                    break;
                            }

                            if (ent != null) {
                                EntityType finalEnt = ent;
                                new BukkitRunnable() {
                                    @Override
                                    public void run() {
                                        spawner.setSpawnedType(finalEnt);
                                        spawner.update();
                                    }
                                }.runTaskLater(PurpleSpawner.getInstance(), 7L);
                            }
                        } else {
                            p.sendMessage(PurpleSpawner.pr + this.purpleSpawner.fileManager.getTranslation("messages.eggChangeNoPermission"));
                        }
                    }
                }
            }
        }
    }
}
