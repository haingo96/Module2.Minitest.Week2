package Prob2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialManager {
    public ArrayList<Material> materialList = new ArrayList<>();

    public void addMaterial(Material materialItem) {
        materialList.add(materialItem);
    }

    public void editMaterial(@NotNull Material materialItem, String name){
        materialItem.setName(name);
    }

    public void editMaterial(@NotNull Material materialItem, LocalDate manufacturingDate) {
        materialItem.setManufacturingDate(manufacturingDate);
    }

    public void editMaterial(@NotNull Material materialItem, int cost) {
        materialItem.setCost(cost);
    }

    public void editMaterial(@NotNull Material materialItem, String name, LocalDate manufacturingDate, int cost) {
        materialItem.setName(name);
        materialItem.setManufacturingDate(manufacturingDate);
        materialItem.setCost(cost);
    }

    public void removeMaterial(Material materialItem) {
        materialList.remove(materialItem);
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (Material materialItem : materialList) {
            result += materialItem.getName() + " ";
        }
        result += "]";
        return "MaterialManager{" +
                "materialList=" + result +
                '}';
    }
}
