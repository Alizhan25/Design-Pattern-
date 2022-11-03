public final class Singleton_Pattern {
    private static Singleton_Pattern instance;
    public String value;
    private Singleton_Pattern(String value){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }
    public static Singleton_Pattern getInstance(String value){
        if(instance == null){
            instance = new Singleton_Pattern(value);
        }
        return instance;
    }

}
