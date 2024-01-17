public enum Planet {
    MERCURY(1,2),
    VENUS(2,2),
    EARTH(3,2),
    MARS(4,2),
    JUPITER(5,2),
    SATURN(6,2),
    URANUS(7,2),
    NEPTUNE(8,2);

    private final double planetMass;
    private final double planetRadius;

    Planet(double planetMass, double planetRadius) {
        this.planetMass = planetMass;
        this.planetRadius = planetRadius;
    }

    public double getPlanetMass() {
        return planetMass;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }
}
