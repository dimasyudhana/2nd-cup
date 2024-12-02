package model;

public class Microscope extends LabEquipment {
    
    private int magnification;

    public static final int MIN_MAGNIFICATION = 1;

    public Microscope(String manufacturer, String model, int year,int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope src) {
        super(src);
        setMagnification(src.magnification);
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        this.magnification = magnification;
    }

    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

}
