package comp.comp152;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Weekday deliveryDay = Weekday.Friday;
    var picker = new Random();
    var choice = picker.nextInt(Weekday.values().length);
    deliveryDay = Weekday.values()[choice];
    System.out.println("Your delivery will arrive on "+deliveryDay);
    }
}
