package groupapi.data;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Properties {

    private File file;
    private YamlConfiguration config;
    private String path;

    public Properties() {}

    public Properties(String path) {
        this.path = path;
        file = new File(path);
        config = YamlConfiguration.loadConfiguration(file);
    }

    public boolean createFile() {
        try {
            return file.getParentFile().mkdirs() && file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean createFile(String path) {
        this.path = path;
        file = new File(path);
        config = YamlConfiguration.loadConfiguration(file);
        return createFile();
    }

    public void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void set(String key, Object value) {
        config.set(key, value);
    }

    public Object get(String key) {
        return config.get(key);
    }

    public File getFile() {
        return file;
    }

    public YamlConfiguration getConfig() {
        return config;
    }

    public String getPath() {
        return path;
    }

}
