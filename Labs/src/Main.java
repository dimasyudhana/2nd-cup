import model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
        Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

        Microscope microscopeCopy = new Microscope(microscope1);
        Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);
    
        System.out.println("original microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
        System.out.println("copied microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());

        System.out.println("original centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
        System.out.println("copied centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());

        Lab lab = new Lab();

        lab.addLabEquipment(microscope1);
        lab.addLabEquipment(centrifuge1);

        LabEquipment retrievedLabEquipment = lab.getLabEquipment(0);
        System.out.println("Retrieved Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());

        Microscope microscope2 = new Microscope("Olympus", "CX23", 2021, 400);
        lab.setLabEquipment(0, microscope2);

        retrievedLabEquipment = lab.getLabEquipment(0);
        // retrievedLabEquipment instanceof Microscope
        Microscope retrievedMicroscope = (Microscope) retrievedLabEquipment;
        System.out.println("Updated Lab Equipment ("+ retrievedLabEquipment.getClass().getSimpleName().toLowerCase() + ") : " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel() + " " + retrievedMicroscope.getMagnification());
        
    }
}
