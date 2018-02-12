public class SingletonMood {
    private String name;
    private Integer umur;
    private static SingletonMood ourInstance = new SingletonMood();

    public static SingletonMood getInstance() {
        return ourInstance;
    }

    private SingletonMood() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
