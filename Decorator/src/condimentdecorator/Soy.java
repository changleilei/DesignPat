package condimentdecorator;

import beverage.Beverage;

public class Soy extends CondimentDecorator {  //soy  豆浆
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
