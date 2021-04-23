class physicalState{

/**
 * A simple GUI for the ID page
 * @author Taowu Zhang
 * @version 1.5.0
 * @since 4/7/2021
 */
 
private String id;
private String height;
private String weight;
private String age;

/**
 * The constructor of physicalState.java
 */
public physicalState(String id, String height, String weight, String age){
    this.id = id;
    this.height = height;
    this.weight = weight;
    this.age = age;
}
/**
 * reate setters and getters for ID, height, weight, and age
 */
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getHeight() {
    return height;
}
public void setHeight(String height) {
    this.height = height;
}
public String getWeight() {
    return weight;
}
public void setWeight(String weight) {
    this.weight = weight;
}
public String getAge() {
    return age;
}
public void setAge(String age) {
    this.age = age;
}
public String toString(){
    return "Height:" + height +"cm Weight:" + weight +"kg Age:" + age ;
    }
}