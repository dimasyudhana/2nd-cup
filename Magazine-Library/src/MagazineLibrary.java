import java.util.ArrayList;

public class MagazineLibrary {
    
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int idx) {
        Magazine magazine = magazines.get(idx);
        return new Magazine(magazine);
    }

    public void setMagazine(int idx,Magazine magazine) {
        magazines.set(idx,new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(new Magazine(magazine));
    }

}
