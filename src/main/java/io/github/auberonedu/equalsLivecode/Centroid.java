package io.github.auberonedu.equalsLivecode;

public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public String getName() {
        return name;
    }
    

    // @Override
    // public int hashCode() {
    //     return r + c;
    // }

    // @Override
    // public boolean equals(Object other) {
    //     if (other == null) return false;
    //     if (!getClass().equals(other.getClass())) return false;
    //     Centroid otherCentroid = (Centroid) other;
    //     return (r == otherCentroid.r && c == otherCentroid.c);

    //     // if (this.name == null) {
    //     //     return otherCentroid.name == null;
    //     // }

    //     // return name.equals(otherCentroid.name);
    // }
}
