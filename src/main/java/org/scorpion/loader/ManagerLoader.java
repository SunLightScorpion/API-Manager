package org.scorpion.loader;

import org.scorpion.api.LavaAPI;
import org.scorpion.lava.Lava;
import org.scorpion.plugin.Plugin;

public class ManagerLoader {

    public void start() {
        for (Plugin api : Lava.getLavaAPIs()) {
            System.out.println("Load the API: " + api.getKey().getKey());
            api.init();
            api.enable();
        }
    }

    public void shutdown() {
        for (LavaAPI api : Lava.getLavaAPIs()) {
            api.disable();
        }
    }

}
