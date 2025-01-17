package guessingnumber;

public record Number(int number) {
    public static Number from(final String value) {
        try {
            return new Number(Integer.valueOf(value));
        } catch (final NumberFormatException e) {
            throw new IllegalArgumentException(String.format("%s 는 숫자가 아닙니다.", value), e);
        }
    }

    public boolean isEqual(final Number other) {
        return this.number == other.number;
    }

    public boolean isGreaterThan(final Number other) {
        return this.number > other.number;
    }
}
