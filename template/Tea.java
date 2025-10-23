package hw_07.template;

public class Tea extends Beverage {
    protected void brew() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет чайных листьев");
        System.out.println("Заваривание чая...");
    }
    protected void addCondiments() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет лимона");
        System.out.println("Добавление лимона...");
    }
}
