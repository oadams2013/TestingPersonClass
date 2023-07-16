package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private int weight;
    private int height;
    private String eyecolor;
    private String race;
    private String gender;

    public Person() {
       name = "";
       age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        // since both variables share the same name we use "this.age" to call the one under the private field
        this.age = age;

    }

    public Person(String name) {  //this is your constructor
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

     public Integer getWeight() {
        return weight;}

    public void setWeight(int weight) {this.weight = weight; }

    public Integer getHeight() {return height;}

    public void setHeight(int height) { this.height = height;}

    public String getEyeColor() { return eyecolor;}

    public void setEyeColor(String eyecolor) {this.eyecolor = eyecolor;}

    public String getRace(){return race;}

    public void setRace(String race){this.race = race;}

    public String getGender(){return gender;}

    public void setGender(String gender){this.gender = gender;}

}
