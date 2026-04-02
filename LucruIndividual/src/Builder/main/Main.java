package Builder.main;

import Builder.builder2.Pacient;
import Builder.builder2.PacientBuilder;

public class Main {
    public static void main(String[] args) {
//        AbstractHolidayPackage builder = new HolidayPackageBuilder();
//
//        HolidayPackage holidayPackage1 = builder.setActivitati(true).setTransport(false).setCazare(false).build();
//        HolidayPackage holidayPackage2 = builder.setCazare(true).setActivitati(false).setTransport(true).build();
//        HolidayPackage holidayPackage3 = builder.setTransport(false).setCazare(false).setTransport(true).build();
//
//        System.out.println(holidayPackage1);
//        System.out.println(holidayPackage2);
//        System.out.println(holidayPackage3);

        Pacient marius = new PacientBuilder("marius").setHalat(true).setMicDejun(true).build();
        Pacient darius = new PacientBuilder("darius").setPat(true).setPapuci(true).build();

        System.out.println(marius);
        System.out.println(darius);
    }
}
