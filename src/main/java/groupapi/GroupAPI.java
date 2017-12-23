package groupapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class GroupAPI extends JavaPlugin {

    private static GroupAPI groupAPI;

    @Override
    public void onEnable() {
        groupAPI = this;

        getLogger().info(getName() + " enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info(getName() + " disabled.");
    }

    public static BukkitTask scheduleRepeatedTimer(Runnable runnable, long delay, long interval) {
        return Bukkit.getScheduler().runTaskTimer(groupAPI, runnable, delay, interval);
    }

}
