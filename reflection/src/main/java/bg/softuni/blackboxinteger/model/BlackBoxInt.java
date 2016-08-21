package bg.softuni.blackboxinteger.model;

public class BlackBoxInt {

    private static final int DEFFAULT_VALUE = 0;

    @SuppressWarnings("unused")
    private int innerValue;

    private BlackBoxInt(int innerValue) {
        this.innerValue = innerValue;
    }

    private BlackBoxInt() {
        this.innerValue = DEFFAULT_VALUE;
    }

    @SuppressWarnings("unused")
    private void add(int addend) {
        this.innerValue += addend;
    }

    @SuppressWarnings("unused")
    private void subtract(int subtrahend) {
        this.innerValue -= subtrahend;
    }

    @SuppressWarnings("unused")
    private void multiply(int multiplier) {
        this.innerValue *= multiplier;
    }

    @SuppressWarnings("unused")
    private void divide(int divider) {
        this.innerValue /= divider;
    }

    @SuppressWarnings("unused")
    private void leftShift(int shifter) {
        this.innerValue <<= shifter;
    }

    @SuppressWarnings("unused")
    private void rightShift(int shifter) {
        this.innerValue >>= shifter;
    }
}
