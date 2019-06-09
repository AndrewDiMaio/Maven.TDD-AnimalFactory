package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
        Cat cat = new Cat(null,null,null);
        String givenName = "Tony";
        cat.setName(givenName);
        String expected = givenName;
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `speak`
    @Test
    public void speak(){
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        Cat cat = new Cat(null,null,null);
        Date date = new Date(04/03/1992);
        cat.setBirthDate(date);
        Date expected = date;
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        cat.eat(food);
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    public void getId(){
        Integer expected = 6969;
        Cat cat = new Cat(null,null,expected);
        Integer actual = cat.getId();
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
