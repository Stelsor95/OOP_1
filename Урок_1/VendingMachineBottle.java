package Урок_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottle implements VendingMachine {
    List<BottleOfWater> bottleOfWaterslList = new ArrayList<>();

    @Override
    public void initProducts() {
    }

    public void initProducts(List<BottleOfWater> bottle) {
        this.bottleOfWaterslList = bottle;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String string) {
        for (BottleOfWater el : bottleOfWaterslList) {
            if (el.getName().equals(string))
                return el.toString();
        }
        return "Не найдено";
    }
}
