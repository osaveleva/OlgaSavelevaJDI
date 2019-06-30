package base.jdi.enums;

public enum ResultList {

    SUMMARY_BASE("Summary: "),
    ELEMENTS_BASE("Elements: "),
    COLOR_BASE("Color: "),
    METAL_BASE("Metal: "),
    VEGETABLES_BASE("Vegetables: ");

    public String base;

    ResultList(String base) {
        this.base = base;
    }

    public String getRecord(String value) {
        return String.format(base, value);
    }
}
