// hw_07/template/Coffee.java
package hw_07.template;

import java.util.Scanner;

public class Coffee extends Beverage {
    private final boolean skipCondiments;
    public Coffee() { this(false); }
    public Coffee(boolean skipCondiments) { this.skipCondiments = skipCondiments; }
    protected void brew() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет кофе");
        System.out.println("Заваривание кофе...");
    }
    protected void addCondiments() throws Exception {
        if (!hasIngredients) throw new IllegalStateException("Нет молока/сахара");
        System.out.println("Добавление сахара и молока...");
    }
    protected boolean customerWantsCondiments() {
        if (skipCondiments) return false;
        return askUser();
    }
    private boolean askUser() {
        System.out.print("Добавлять добавки? (y/n): ");
        try {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("y") || s.equals("yes")) return true;
            if (s.equals("n") || s.equals("no")) return false;
            return true;
        } catch (Exception e) {
            return true;
        }
    }
}
