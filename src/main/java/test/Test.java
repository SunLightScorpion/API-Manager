package test;

import de.sunlight.key.ValueKey;
import org.scorpion.APIManager;
import org.scorpion.lava.Lava;
import org.scorpion.loader.ManagerLoader;
import org.scorpion.plugin.Plugin;
import test.a.APITest;

public class Test {

    public static void main(String[] args) {

        Plugin api = new APIManager(new APITest(), ValueKey.getKey("test")).buildAPI();
        Lava.registerAPI(api);

        ManagerLoader loader = new ManagerLoader();

        loader.start();

        loader.shutdown();
    }

}
