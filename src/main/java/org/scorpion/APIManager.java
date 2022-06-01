package org.scorpion;

import de.sunlight.key.ValueKey;
import org.scorpion.plugin.Plugin;

public class APIManager {

    private final Plugin api;
    private final ValueKey<String> key;

    public APIManager(Plugin api, ValueKey<String> key) {
        this.api = api;
        this.key = key;
    }

    public Plugin buildAPI() {
        return api;
    }

    public ValueKey<String> getKey() {
        return key;
    }

    public APIManager init() {
        return this;
    }

    public APIManager disable() {
        api.disable();
        return this;
    }

}
