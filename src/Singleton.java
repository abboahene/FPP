public class Singleton {
    private static Singleton instance = null;
    private String name;
    private Singleton(){
    }

    private Singleton(String name){
        this.name = name;
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
