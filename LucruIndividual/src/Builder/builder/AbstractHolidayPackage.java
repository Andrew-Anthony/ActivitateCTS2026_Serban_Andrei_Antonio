package Builder.builder;

public interface AbstractHolidayPackage {
    HolidayPackage build();
    AbstractHolidayPackage setTransport(boolean hasTransport);
    AbstractHolidayPackage setCazare(boolean hasCazare);
    AbstractHolidayPackage setActivitati(boolean hasActivitati);
}
