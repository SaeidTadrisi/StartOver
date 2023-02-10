package Vehicle;

public enum GearBoxType {
    AUTOMATIC ("Otomatic", "automatico"),
    MANUAL ("Dasti", "manuale");

    private final String toPersian;
    private final String toItalian;

    GearBoxType(String toPersian, String toItalian) {
        this.toPersian = toPersian;
        this.toItalian = toItalian;
    }

    public static void print (){
        GearBoxType[] values = GearBoxType.values();
        for (int index = 0; index < values.length; index++) {
            System.out.println(values[index]);
            System.out.println(values[index].toPersian);
            System.out.println(values[index].toItalian);
        }
    }

    public static void printInPersian (){
        GearBoxType[] values = GearBoxType.values();
        for (int index = 0; index < values.length; index++) {
            System.out.println(values[index].toPersian);
        }

    }

    public static void printInItalian() {
        GearBoxType[] values = GearBoxType.values();
        for (int index = 0; index < values.length; index++) {
            GearBoxType value = values[index];
            System.out.println(value.toItalian);
        }
    }

    public String toPersian() {
        return toPersian;
    }

    public String toItalian() {
        return toItalian;
    }
}
