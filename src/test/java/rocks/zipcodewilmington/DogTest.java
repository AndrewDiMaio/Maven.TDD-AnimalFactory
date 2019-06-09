package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void Dog() {
        Date date = new Date(04 / 03 / 1992);
        String name = "Tony";
        Integer id = 6969;
        Dog dog = new Dog(name, date, id);

        Date expectedDate = date;
        String expectedName = name;
        Integer expectedId = id;

        Date actualDate = dog.getBirthDate();
        String actualName = dog.getName();
        Integer actualId = dog.getId();

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speak(){
        Dog dog = new Dog(null,null,null);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        Dog dog = new Dog(null,null,null);
        Date birthDate = new Date(04/03/1992);
        dog.setBirthDate(birthDate);

        Date expected = birthDate;
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Dog dog = new Dog(null,null,null);
        Food food = new Food();
        dog.eat(food);
        Integer expected = 1;
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        Dog dog = new Dog(null,null, 6969);
        Integer expected = 6969;
        Integer actual = dog.getId();

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
