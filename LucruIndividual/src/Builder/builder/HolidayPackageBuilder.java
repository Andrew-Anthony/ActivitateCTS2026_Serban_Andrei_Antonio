package Builder.builder;

public class HolidayPackageBuilder implements AbstractHolidayPackage{
    private boolean hasTransport;
    private boolean hasCazare;
    private boolean hasActivitati;

    public HolidayPackageBuilder() {
        this.hasTransport = false;
        this.hasCazare = false;
        this.hasActivitati = false;
    }

    @Override
    public HolidayPackage build() {
        return new HolidayPackage(hasTransport,hasCazare,hasActivitati);
    }

    @Override
    public AbstractHolidayPackage setTransport(boolean hasTransport) {
        this.hasTransport = hasTransport;
        return this;
    }

    @Override
    public AbstractHolidayPackage setCazare(boolean hasCazare) {
        this.hasCazare = hasCazare;
        return this;
    }

    @Override
    public AbstractHolidayPackage setActivitati(boolean hasActivitati) {
        this.hasActivitati = hasActivitati;
        return this;
    }
}
