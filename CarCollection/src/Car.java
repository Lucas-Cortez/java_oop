public class Car {
    private String Type;
    private String Color;
    private String Model;
    private int Doors;
    private boolean Traction4X4;
    private boolean LeatherSeat;
    private boolean Air;

    public Car(int Doors, String Color, String Model) {
        this.Type = "Casual";
        this.Color = Color;
        this.Model = Model;
        this.Doors = Doors;
        this.Traction4X4 = false;
        this.LeatherSeat = false;
        this.Air = false;
    }

    public Car(String Color, int Doors, String Model, boolean Traction) {
        this.Type = "Esporte";
        this.Color = Color;
        this.Model = Model;
        this.Doors = Doors;
        this.Traction4X4 = Traction;
        this.LeatherSeat = false;
        this.Air = false;
    };

    public Car(boolean Traction, String Color, int Doors, String Model, boolean LeatherSeat, boolean Air) {
        this.Type = "Luxo";
        this.Color = Color;
        this.Model = Model;
        this.Doors = Doors;
        this.Traction4X4 = Traction;
        this.LeatherSeat = LeatherSeat;
        this.Air = Air;
    };

    public void getdescription() {
        System.out.println(Type);
        System.out.println(Color);
        System.out.println(Model);
        System.out.println(Doors);
        System.out.println(Traction4X4);
        System.out.println(LeatherSeat);
        System.out.println(Air);
        System.out.println("---------------------------------");
    };

};