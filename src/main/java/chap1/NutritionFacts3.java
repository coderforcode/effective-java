package chap1;

/**
 * @author 糖小样的皮卡丘
 * 实现方式三（推荐）
 * 采用 建造者模式 实现。
 */
public class NutritionFacts3 {
    // required
    private final int servingSize;
    // required
    private final int servings;
    // optional
    private final int calories;
    // optional
    private final int fat;
    // optional
    private final int sodium;
    // optional
    private final int carbohydrate;

    public static class Builder {
        // required
        private final int servingSize;
        // required
        private final int servings;
        // optional
        private int calories;
        // optional
        private int fat;
        // optional
        private int sodium;
        // optional
        private int carbohydrate;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts3 build() {
            return new NutritionFacts3(this);
        }
    }

    public NutritionFacts3(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}
