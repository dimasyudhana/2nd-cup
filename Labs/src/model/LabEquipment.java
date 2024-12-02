package model;

public abstract class LabEquipment {

    private String manufacturer;
    private String model;
    private int year;



    public static final int MIN_YEAR = 1950;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public LabEquipment(LabEquipment source) {
        setManufacturer(source.manufacturer);
        setModel(source.model);
        setYear(source.year);
    }

    public abstract LabEquipment clone();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        if (manufacturer == null || manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer tidak boleh kosong.");
        }

        this.manufacturer = manufacturer;
    
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model tidak boleh kosong.");
        }

        this.model = model;
    
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year <= MIN_YEAR) {
            throw new IllegalArgumentException("Year harus lebih besar atau sama dengan minimum tahun.");
        }

        this.year = year;
    
    }

    public abstract String performMaintenance();
    
}
