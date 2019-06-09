package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog(){
        Date date = new Date(04/03/1992);
        String name = "Tony";
        Dog dog = AnimalFactory.createDog(name, date);

        String expectedName = name;
        Date expectedDate = date;

        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);


    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat(){
        Date date = new Date(04/03/1992);
        String name = "Tony";
        Cat cat = AnimalFactory.createCat(name, date);

        String expectedName = name;
        Date expectedDate = date;

        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);


    }
}
