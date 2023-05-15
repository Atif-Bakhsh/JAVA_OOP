package Inheritance;

//Deparments that are composed in the university.
//University
public class Composition {
    private String composition2;
    private String uniName;

    public Composition(String composition2, String uniName) {
        this.composition2 = composition2;
        this.uniName = uniName;
    }

    public String getComposition2() {
        return composition2;
    }

    public void setComposition2(Composition2 composition2) {
        this.composition2 = String.valueOf(composition2);
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public String toString() {
        return "*****Composition{" +
                "composition2='" + composition2 + '\'' +
                ", uniName='" + uniName + '\'' +
                '}';
    }
}
