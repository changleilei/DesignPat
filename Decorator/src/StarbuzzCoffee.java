import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Espresso;
import condimentdecorator.Mocha;
import condimentdecorator.Whip;

public class StarbuzzCoffee {

    public static void main(String args[]) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + "$" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.Size.TALL);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);


        System.out.println(beverage1.getDescription()
                + "$" + beverage1.cost());
    }

}
