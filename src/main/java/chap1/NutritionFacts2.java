package chap1;

/**
 * @author 糖小样的皮卡丘
 * 实现方法二，不推荐
 */
public class NutritionFacts2 {
    // required
    private int servingSize = -1;
    // required
    private int servings = -1;
    // optional
    private int calories = 0;
    // optional
    private int fat = 0;
    // optional
    private int sodium = 0;
    // optional
    private int carbohydrate = 0;

    public NutritionFacts2() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
