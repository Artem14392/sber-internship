package src;

public class City {
    private String name;
    private String region;
    private String distrist;
    private int population;
    private String foundation;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", distrist='" + distrist + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }

    public City(String name, String region, String distrist, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.distrist = distrist;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrist() {
        return distrist;
    }

    public void setDistrist(String distrist) {
        this.distrist = distrist;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

}
