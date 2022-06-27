# API-Manager
new api manager for plugins and projects


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

========================================================

package test.a;

import org.scorpion.plugin.Plugin;

public class APITest extends Plugin {

    public APITest() {
        super("test");
    }

    @Override
    public void enable() {
        System.out.println("ABC");
    }

    @Override
    public void init() {
        System.out.println("Max seine Ohren bluten");
    }

    @Override
    public void disable() {
        System.out.println("DISABLE!!!!!!!!!!");
    }

}
