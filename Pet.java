public class Pet{
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Rani");
        pet1.setAge(3);
        pet1.setLocation("NC");
        pet1.setType("Dog");
        System.out.println("NAME= "+pet1.getName());
        System.out.println("Age= "+pet1.getAge());
        System.out.println("Type= "+pet1.getType());
        System.out.println("Location = "+pet1.getLocation());

        Pet pet3 = new Pet();
        System.out.println("NAME= "+pet3.getName());
        System.out.println("Age= "+pet3.getAge());
        System.out.println("Location = "+pet3.getLocation());



        Pet pet2 = new Pet("Jimmy","Boston","Cat",5);
        System.out.println("NAME= "+pet2.getName());
        System.out.println("Location = "+pet2.getLocation());
        System.out.println("Type= "+pet2.getType());
        System.out.println("Age= "+pet2.getAge());
}
    private String name,location,type;
    private int age;
    
    Pet(){
        this.age=9;
        this.name="Jhony";
        this.location="Chicago";
    }
    Pet(String name,String location,String type,int age){
        this.name=name;
        this.location=location;
        this.type=type;
        this.age=age;
    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
    public String getLocation(){
        return location;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setLocation(String location){
        this.location=location;
    }

}