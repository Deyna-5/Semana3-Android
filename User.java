public class User {
    // Agregamos los atributos requeritos del usuario.
    private String Name;
    private Integer Age;

    // Creamos el método para inicializar el usuario con datos por defecto.
    public void user(){
        this.Name = "";
        this.Age = 0;
    }

    // Creamos el método setter para el nombre de usuario
    public void setName(String name){
        this.Name = name;
    }

    // Creamos el método setter para la edad del usuario
    public void setAge(Integer age){
        this.Age = age;
    }

    // Creamos un método para pintar la data del usuario.
    public void showUserData() {
        System.out.print("\n-------------------------------------------------------------------------\n");
        System.out.print("El usuario se llama:  " + Name + "\nTiene " + Age + " años");
        System.out.print("\n-------------------------------------------------------------------------\n");
    }
}
