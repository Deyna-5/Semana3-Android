import java.util.Scanner;

public class Vehicle {
    // Aqui definimos los atributos de nuestra clase vehiculo
    private String Brand;
    private String Model;
    private Integer Cilindrada;
    private String TypeOfFuel;
    private Integer Capacity;
    private User user;

    // Creamos el método para inicializar nuestro vehiculo con data por defecto
    public Vehicle(){
        this.Brand = "";
        this.Model = "";
        this.Cilindrada = 0;
        this.TypeOfFuel = "";
        this.Capacity = 0;
        this.user = new User();
    }

    // Creamos el getter para la marca
    public String getBrand() {
        return Brand;
    }
    
    // Creamos el setter para la marca
    public void setBrand(String brand) {
        this.Brand = brand;
    }

    //  Creamos el getter para modelo
    public String getModel() {
        return Model;
    }

    // Creamos el setter para modelo
    public void setModel(String model) {
        this.Model = model;
    }

    // Creamos el getter para cilindrada
    public Integer getCilindrada() {
        return Cilindrada;
    }

    // Creamos el setter para cilindrada
    public void setCilindrada(Integer cilindrada) {
        this.Cilindrada = cilindrada;
    }

    //  Creamos el getter para tipo de combustible
    public String getTypeOfFuel() {
        return TypeOfFuel;
    }

    // Creamos el setter para el tipo de combustible
    public void setTypeOfFuel(String typeOfFuel) {
        this.TypeOfFuel = typeOfFuel;
    }

    // Creamos el getter para la capacidad
    public Integer getCapacity() {
        return Capacity;
    }

    // Creamos el setter para la capacidad
    public void setCapacity(Integer capacity) {
        this.Capacity = capacity;
    }

    // Creamos el setter para el usuario
    public void setUser(User user) {
        this.user = user;
    }

    //  Creamos un método para imprimir la información del vehiculo
    public void showVehicleData() {
        System.out.print("\n-------------------------------------------------------------------------\n");
        System.out.print("El vehiculo cuenta con las siguientes caracteristicas:" + "\nEs de la marca: " + Brand + "\nEs el modelo: " + Model + "\nTiene una cilindrada de: " + Cilindrada + "\nTiene un combustible de tipo: " + TypeOfFuel + "\ny por ultimo cuenta con una capacidad para " + Capacity + " personas");
        System.out.print("\n-------------------------------------------------------------------------\n");
    }

    // Creamos el main donde se llevará acabo toda la ejecución
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
