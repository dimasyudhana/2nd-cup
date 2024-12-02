package model;

import java.util.ArrayList;

public class Lab {
    
    private ArrayList<LabEquipment> labEquipments;

    public Lab() {
        this.labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int idx) {
        return this.labEquipments.get(idx).clone();
    }
    
    public void setLabEquipment(int idx, LabEquipment labEquipment) {
        this.labEquipments.set(idx, labEquipment.clone());
    }

    public void addLabEquipment(LabEquipment labEquipment) {
        this.labEquipments.add(labEquipment.clone());
    }

}
