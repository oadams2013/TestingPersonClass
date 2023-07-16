package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person(); // new means that a new object was created
        // this is calling a new object to the person constructor

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeightTest(){
        Person person = new Person();
        Integer expected = 198;

        //when
        person.setWeight(expected);
        Integer actual = person.getWeight();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setWeightTest(){
        Person person = new Person();
        Integer expected = 198;

        //when
        person.setWeight(expected);
        Integer actual = person.getWeight();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getHeightTest(){
        Person person = new Person();
        Integer expected = 67;

        //when
        person.setHeight(expected);
        Integer actual = person.getHeight();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHeightTest(){
        Person person = new Person();
        Integer expected = 67;

        //when
        person.setHeight(expected);
        Integer actual = person.getHeight();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getEyeColorTest(){
        Person person = new Person();
        String expected = "hazel";

        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEyeColorTest(){
        Person person = new Person();
        String expected = "hazel";

        //when
        person.setEyeColor(expected);
        String actual = person.getEyeColor();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRace(){
        Person person = new Person();
        String expected = "hazel";

        //when
        person.setRace(expected);
        String actual = person.getRace();

        //then
        Assert.assertEquals(expected, actual);

    }
    @Test

    public void setRace(){
        Person person = new Person();
        String expected = "Black";

        //when
        person.setRace(expected);
        String actual = person.getRace();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender(){
        Person person = new Person();
        String expected = "Woman";

        // when
        person.setGender(expected);
        String actual = person.getGender();

        //then
        Assert.assertEquals(expected, actual);
    }
    @Test

    public void setGender(){
        Person person = new Person();
        String expected = "Woman";

        //when
        person.setGender(expected);
        String actual = person.getGender();

        //then
        Assert.assertEquals(expected, actual);
    }

}
