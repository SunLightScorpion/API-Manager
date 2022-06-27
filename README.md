# API-Manager
new api manager for plugins and projects


    public static void main(String[] args) {

        Plugin api = new APIManager(new APITest(), ValueKey.getKey("test")).buildAPI();
        Lava.registerAPI(api);

        ManagerLoader loader = new ManagerLoader();

        loader.start();
        loader.shutdown();
    }

========================================================

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
