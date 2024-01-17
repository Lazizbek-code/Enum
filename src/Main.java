public class Main {
    public static void main(String[] args) {

        // DAY ENUM
        Day monday = Day.MONDAY;
        System.out.println(monday);

        Day[] days = Day.values();
        for(Day d: days){
            System.out.println(d.name().toLowerCase());
        }

        // Language enum
        Language language = Language.getByName("aa");
        System.out.println(language);

        // Planet
        System.out.println(Planet.EARTH.getPlanetMass());
        System.out.println(Planet.EARTH.getPlanetRadius());
    }
}
