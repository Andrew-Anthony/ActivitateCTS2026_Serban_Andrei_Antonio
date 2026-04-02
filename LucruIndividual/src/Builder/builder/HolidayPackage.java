package Builder.builder;

import java.util.StringJoiner;

public class HolidayPackage {
    private final boolean hasTranport;
    private final boolean hasCazare;
    private final boolean hasActivitati;

    public HolidayPackage(boolean hasTranport, boolean hasCazare, boolean hasActivitati) {
        this.hasTranport = hasTranport;
        this.hasCazare = hasCazare;
        this.hasActivitati = hasActivitati;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", HolidayPackage.class.getSimpleName() + "[", "]")
                .add("hasTranport=" + hasTranport)
                .add("hasCazare=" + hasCazare)
                .add("hasActivitati=" + hasActivitati)
                .toString();
    }
}