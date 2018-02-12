import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMood() throws Exception{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("robi hidayat",19);
        String mood = moodAnalyzer.analizer("this is sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void happyTest() throws Exception {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("robi hidayat",19);
        String mood = moodAnalyzer.analizer("this is happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void TestSingleton() throws Exception {
        SingletonMood moodAnalyzer = SingletonMood.getInstance();
        moodAnalyzer.setName("Robi Hidayat");
        String namaSaya = moodAnalyzer.getName();
        Assert.assertThat(namaSaya, CoreMatchers.is("Robi Hidayat"));



    }
}
