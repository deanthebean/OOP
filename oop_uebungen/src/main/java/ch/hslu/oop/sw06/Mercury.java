package ch.hslu.oop.sw06;

public class Mercury extends Element {
    public Mercury() {
        super(-38.9f, 356.7f, "mercury", "Hg");
    }

    @Override
    public String toString() {
        return super.toString() + " is GIFTIG";
    }
}
