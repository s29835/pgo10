public class Car implements Comparable {
    private String nameOfModel;
    private int yearOfProduction;

    public Car(String nameOfModel, int yearOfProduction) {
        this.nameOfModel = nameOfModel;
        this.yearOfProduction = yearOfProduction;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    @Override
    public int compareCars(Car other) {
        return Integer.compare(this.getYearOfProduction(),other.getYearOfProduction());
    }

    @Override
    public String toString() {
        return ("Car" +", " + "model: " + nameOfModel + "," + "year of production: " + yearOfProduction) ;
    }
}
