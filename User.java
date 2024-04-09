public class User {
    private String Name;
    private Integer Age;

    public void user(){
        this.Name = "";
        this.Age = 0;
    }

    public void setName(String name){
        this.Name = name;
    }

    public void setAge(Integer age){
        this.Age = age;
    }

    public void showUserData() {
        System.out.print("\n-------------------------------------------------------------------------\n");
        System.out.print("El usuario se llama:  " + Name + "\nTiene " + Age + " anos");
        System.out.print("\n-------------------------------------------------------------------------\n");
    }
}
