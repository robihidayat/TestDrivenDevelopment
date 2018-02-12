public class MoodAnalyzer {
    private String name;
    private Integer umur;

    public MoodAnalyzer(String name, Integer umur) {
        this.name = name;
        this.umur = umur;
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

    public String analizer(String s){
        if (s.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MoodAnalyzer)) return false;

        MoodAnalyzer that = (MoodAnalyzer) o;

        if (!name.equals(that.name)) return false;
        return umur.equals(that.umur);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + umur.hashCode();
        return result;
    }

}
