package am.picsart.lesson3.second_task;

public class Address {
    private String city;
    private String district;
    private int house;
    private int apartmentNumber;

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


    public String getFullAddress() {
        return "city:" + city + ", district:" + district +
                ", house:" + house + ", apartmentNumber:" + apartmentNumber;
    }
}
