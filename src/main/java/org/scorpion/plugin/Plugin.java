package org.scorpion.plugin;

import de.sunlight.key.ValueKey;
import org.scorpion.api.LavaAPI;

public abstract class Plugin implements LavaAPI {

    private final ValueKey<String> key;

    public Plugin(String name) {
        this.key = ValueKey.getKey(name);
    }

    public ValueKey<String> getKey() {
        return key;
    }

}
