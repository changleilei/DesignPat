package condimentdecorator;

import beverage.Beverage;
import com.sun.jndi.ldap.Ber;

// 奶泡
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize().equals(Size.TALL))
            cost += .1;
        else if (getSize().equals(Size.GRANDE))
            cost += .2;
        else if(getSize().equals(Size.VENTI))
            cost += .3;
        return cost;
    }
}
