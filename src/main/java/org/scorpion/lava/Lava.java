package org.scorpion.lava;

import org.scorpion.plugin.Plugin;

import java.util.LinkedList;

public class Lava {

    private static final LinkedList<Plugin> apis = new LinkedList<>();

    public static void registerAPI(Plugin api) {
        apis.add(api);
    }

    public static LinkedList<Plugin> getLavaAPIs() {
        return apis;
    }

}
