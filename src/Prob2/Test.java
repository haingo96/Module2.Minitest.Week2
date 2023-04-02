package Prob2;

import java.time.LocalDate;
public class Test {
    public static void main(String[] args) {
        CrispyFlour flour1 = new CrispyFlour("flour1", LocalDate.of(2022, 5, 1), 100, 2);
        CrispyFlour flour2 = new CrispyFlour("flour2", LocalDate.of(2022, 8, 3), 100, 3);
        CrispyFlour flour3 = new CrispyFlour("flour3", LocalDate.of(2022, 8, 2), 100, 2);
        CrispyFlour flour4 = new CrispyFlour("flour4", LocalDate.of(2022, 6, 2), 100, 1);
        CrispyFlour flour5 = new CrispyFlour("flour5", LocalDate.of(2022, 11, 4), 100, 3);

        Meat meat1 = new Meat("meat1", LocalDate.of(2023, 4, 1), 100, 1);
        Meat meat2 = new Meat("meat2", LocalDate.of(2023, 3, 31), 100, 2);
        Meat meat3 = new Meat("meat3", LocalDate.of(2023, 3, 28), 100, 3);
        Meat meat4 = new Meat("meat4", LocalDate.of(2023, 3, 30), 100, 1);
        Meat meat5 = new Meat("meat5", LocalDate.of(2023, 4, 2), 100, 2);

        MaterialManager materialManager = new MaterialManager();

        materialManager.editMaterial(flour1, "flour1.1");

        materialManager.addMaterial(flour1);
        materialManager.addMaterial(flour2);
        materialManager.addMaterial(flour3);
        materialManager.addMaterial(flour4);
        materialManager.addMaterial(flour5);
        materialManager.addMaterial(meat1);
        materialManager.addMaterial(meat2);
        materialManager.addMaterial(meat3);
        materialManager.addMaterial(meat4);
        materialManager.addMaterial(meat5);

        materialManager.removeMaterial(meat1);

        System.out.println(materialManager);

        for (Material materialItem : materialManager.materialList) {
            System.out.println(materialItem.getCost() - materialItem.getRealMoney());
        }
    }
}
