public class Cat{

//data variables, they describe our Cat object in the computer
private String name;
private int age;
private String breed;

//default constructor
public Cat () {
    this.name = "Tony";
    this.age = 1;
    this.breed = "Maine Coon";
}

//non-default constructor
public Cat (String name, int age, String breed) {
    this.name = name;
    this.age = age;
    this.breed = breed;
}

//setters - accessors
public void setName(String name) {
    this.name = name;
}

public void setAge(Integer age) {
    this.age = age;
}

public void setBreed(String breed) {
    this.breed = breed;
}

//getters - mutators
public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getBreed() {
    return breed;
}

public String toString() {
    return name + ", " + age + ", " + breed;
}

} //end of Cat class