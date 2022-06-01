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
