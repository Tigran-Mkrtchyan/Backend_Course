package am.picsart.lesson3.second_task;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("Yerevan");
        address.setDistrict("Arapkir");
        address.setHouse(17);
        address.setApartmentNumber(42);

        Door apartmentDoor = new Door();
        apartmentDoor.setDoorColor("black");

        Door roomDoor = new Door();
        roomDoor.setDoorColor("white");

        Wall wall = new Wall();
        wall.setWallColor("gray");
        wall.setWallMaterial("monolith");

        Room room = new Room();
        room.setDoor(roomDoor);
        room.setWall(wall);
        room.setАреа(35);

        Apartment apartment = new Apartment();
        apartment.setAddress(address);
        apartment.setDoor(apartmentDoor);
        apartment.setFirstRoom(room);

        System.out.println("Apartment address: "+apartment.getAddress().getFullAddress());
        System.out.println("Apartment door color: "+apartment.getDoor().getDoorColor());

        System.out.println("Room area: "+apartment.getFirstRoom().getАреа());
        System.out.println("Room door color: "+apartment.getFirstRoom().getDoor().getDoorColor());
        System.out.println("Wall color: "+apartment.getFirstRoom().getWall().getWallColor());
        System.out.println("Wall Material: "+apartment.getFirstRoom().getWall().getWallMaterial());


    }
}
