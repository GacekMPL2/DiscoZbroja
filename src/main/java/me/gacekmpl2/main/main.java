package me.gacekmpl2.main;

import me.gacekmpl2.system.ArmorSystem;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin sie wlaczyl");
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            Random r = new Random();

            public void run() {
                Color c = Color.fromBGR(r.nextInt(255), r.nextInt(255), r.nextInt(255));
                ArmorSystem.setCustomArmor(c);
            }
        }, 0L, 5L);
    }
}
