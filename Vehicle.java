import java.util.Scanner;

public class Vehicle {
    // Aqui definimos los atributos de nuestra clase vehiculo
    private String Brand;
    private String Model;
    private Integer Cilindrada;
    private String TypeOfFuel;
    private Integer Capacity;
    private User user;

    public Vehicle(){
        this.Brand = "";
        this.Model = "";
        this.Cilindrada = 0;
        this.TypeOfFuel = "";
        this.Capacity = 0;
        this.user = new User();
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public Integer getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.Cilindrada = cilindrada;
    }

    public String getTypeOfFuel() {
        return TypeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.TypeOfFuel = typeOfFuel;
    }

    public Integer getCapacity() {
        return Capacity;
    }

    public void setCapacity(Integer capacity) {
        this.Capacity = capacity;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void showVehicleData() {
        System.out.print("\n-------------------------------------------------------------------------\n");
        System.out.print("El vehiculo cuenta con las siguientes caracteristicas:" + "\nEs de la marca: " + Brand + "\nEs el modelo: " + Model + "\nTiene una cilindrada de: " + Cilindrada + "\nTiene un combustible de tipo: " + TypeOfFuel + "\ny por ultimo cuenta con una capacidad para " + Capacity + " personas");
        System.out.print("\n-------------------------------------------------------------------------\n");
    }

    static void Main() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();

        System.out.print("Ingrese su nombre:  ");
        user.setName(scanner.nextLine());

        System.out.print("Ingrese su edad:  ");
        String ageInput = scanner.nextLine();
        int ageInt = Integer.parseInt(ageInput);
        user.setAge(ageInt);

        user.showUserData();
        vehicle.setUser(user);

        System.out.print("\nIngrese la Marca del Vehiculo:  ");
        vehicle.setBrand(scanner.nextLine());

        System.out.print("Ingrese el Modelo del vehiculo:  ");
        vehicle.setModel(scanner.nextLine());

        System.out.print("Ingrese la cilindrada del vehiculo:  "); 
        String cilindradaInput = scanner.nextLine();
        int cilindradaInt = Integer.parseInt(cilindradaInput);
        vehicle.setCilindrada(cilindradaInt);

        System.out.print("Ingrese el tipo de combustible del vehiculo:  "); 
        vehicle.setTypeOfFuel(scanner.nextLine());

        System.out.print("Ingrese la capacidad del vehiculo:  ");
        String capacityInput = scanner.nextLine();
        int capacityInt = Integer.parseInt(capacityInput);
        vehicle.setCapacity(capacityInt);

        vehicle.showVehicleData();
    }
}
