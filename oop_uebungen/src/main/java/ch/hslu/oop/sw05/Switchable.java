package ch.hslu.oop.sw05;

/**
 * The {@code Switchable} interface represents a basic interface for a switch of any type.
 */
public interface Switchable {
    /**
     * Sets the switch to on.
     */
    void switchOn();

    /**
     * Sets the switch to off.
     */
    void switchOff();

    /**
     * Checks if it is switched on
     * @return Method returns true if it is switched on
     */
    boolean isSwitchedOn();

    /**
     * Checks if it is switched off
     * @return Method returns true if it is switched off
     */
    boolean isSwitchedOff();
}
