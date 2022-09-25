public class House {
    private int id;
    private int number;
    private int area;
    private int floor;
    private int rooms;
    private String street;

    public void setId(int id) {
        this.id = id;

    }
    public int getId() {
        return id;
    }

    public void setNumber(int number) {
        this.number = number;

    }
    public int getNumber() {
        return number;
    }

    public void setArea(int area) {
        this.area = area;

    }
    public int getArea() {
        return area;
    }

    public void setFloor(int floor) {
        this.floor = floor;

    }
    public int getFloor() {
        return floor;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;

    }
    public int getRooms() {
        return rooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }


    public String toString(){
        return "Айді: "+id+
                "\nНомер будинку: "+number+
                "\nПлоща будинку:"+area+
                "\nПоверх:"+floor +
                "\nКількість кімнат: "+rooms+
                "\nНазва вулиці: "+street+"\n";
    }
}
