package de.relativv.purplespawner.commands;

import de.relativv.purplespawner.main.PurpleSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;

public class ReloadConfig implements CommandExecutor {

    private PurpleSpawner purpleSpawner;
    public ReloadConfig(PurpleSpawner purpleSpawner) {
        this.purpleSpawner = purpleSpawner;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender.hasPermission("purplespawner.reloadConfig")) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("reloadconfig")) {
                    this.purpleSpawner.fileManager.cfg = YamlConfiguration.loadConfiguration(this.purpleSpawner.fileManager.config);
                    sender.sendMessage(this.purpleSpawner.fileManager.getTranslation("messages.configReloaded"));
                }
            }
        }
        return true;
    }
}
