import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        int min = 1000;
        int max = 9999;
        int number = min + this.random.nextInt(max - min + 1);
        return "NCC-" + number;
    }

    double randomStardate() {
        double min = 41000.0;
        double max = 42000.0;
        return min + this.random.nextDouble(max - min );
    }
}
