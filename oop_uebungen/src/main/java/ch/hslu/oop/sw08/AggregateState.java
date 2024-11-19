package ch.hslu.oop.sw08;

public enum AggregateState {
    SOLID("fest"),
    LIQUID("flüssig"),
    GAS("gasförmig");

    private final String germanTerm;
    private AggregateState(String term) {
        this.germanTerm = term;
    }

    public String getGermanTerm(){
        return this.germanTerm;
    }
}
