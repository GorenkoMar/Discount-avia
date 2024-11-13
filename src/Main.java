//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticket_amount = 62140;
        int bonus = 20;
        int bonus_mile = ticket_amount / bonus;
        System.out.println("Начислено бонусных миль  " + bonus_mile);
    }
}
