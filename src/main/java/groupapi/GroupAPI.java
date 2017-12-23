package groupapi;

import org.bukkit.plugin.java.JavaPlugin;

public class GroupAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(getName() + " enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info(getName() + " disabled.");
    }

}
