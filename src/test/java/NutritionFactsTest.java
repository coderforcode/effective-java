import chap1.NutritionFacts;
import chap1.NutritionFacts2;
import chap1.NutritionFacts3;
import org.testng.annotations.Test;

public class NutritionFactsTest {

    @Test
    public void test() {
        NutritionFacts nutritionFacts = new NutritionFacts(240, 8, 100, 0, 35, 27);
        NutritionFacts2 nutritionFacts2 = new NutritionFacts2();
        nutritionFacts2.setServingSize(240);
        nutritionFacts2.setServings(8);
        nutritionFacts2.setCalories(100);
        nutritionFacts2.setFat(0);
        nutritionFacts2.setSodium(35);
        nutritionFacts2.setCarbohydrate(27);

        // 推荐
        NutritionFacts3 facts3 = new NutritionFacts3.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27)
                .build();

    }
}
