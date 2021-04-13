public class Dog {
    // Instance Variables
    private String breed;
    private String size;
    private int age;
    private String color;


    // method 1
    public String getInfo() {
        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
