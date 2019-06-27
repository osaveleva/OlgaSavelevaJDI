package base.jdi.enums;

public enum PagesNames {

    SERVICE("Service"),
    CONTACT_FORM("Contact form"),
    HOME("Home"),
    METALS_COLORS("Metals & Colors"),
    ELEMENTS_PACK("Elements packs"),
    DIFFERENT_ELEMENTS("Different elements"),
    DATES("Dates"),
    USER_TABLE("User Table");

    private String record;

    PagesNames(String record) {
        this.record = record;
    }

    public String getRecord() {
        return record;
    }

}
