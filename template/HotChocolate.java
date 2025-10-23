// hw_07/template/HotChocolate.java
package hw_07.template;

public class HotChocolate extends Beverage {
    protected void brew() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет шоколада");
        System.out.println("Растапливание шоколада...");
    }
    protected void addCondiments() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет сливок");
        System.out.println("Добавление сливок и маршмеллоу...");
    }
}
