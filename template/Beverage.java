package hw_07.template;

public abstract class Beverage {
    protected boolean hasIngredients = true;
    public final void prepareRecipe() {
        try {
            boilWater();
            brew();
            pourInCup();
            if (customerWantsCondiments()) addCondiments();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    protected void boilWater() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет ингредиентов для кипячения");
        System.out.println("Кипячение воды...");
    }
    protected abstract void brew() throws Exception;
    protected abstract void addCondiments() throws Exception;
    protected void pourInCup() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет ингредиентов для наливания");
        System.out.println("Наливание в чашку...");
    }
    protected boolean customerWantsCondiments() {
        return true;
    }
    public void setHasIngredients(boolean has) { this.hasIngredients = has; }
}
