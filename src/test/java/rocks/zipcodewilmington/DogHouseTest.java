package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void add(){
        Dog chip = new Dog(null,null,null);
        DogHouse.clear();
        DogHouse.add(chip);

        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);


    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void remove(){
        DogHouse.clear();
        Dog sam = new Dog(null,null,1234);
        DogHouse.add(sam);
        DogHouse.remove(1234);

        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void remove1(){
        DogHouse.clear();
        Dog sam = new Dog(null,null,1234);
        DogHouse.add(sam);
        DogHouse.remove(sam);

        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById(){
        DogHouse.clear();
        Dog sam = new Dog(null,null,1234);
        DogHouse.add(sam);

        Dog expected = sam;
        Dog actual = DogHouse.getDogById(1234);

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogs(){
        DogHouse.clear();
        Dog sam = new Dog("Sam",null,1234);
        DogHouse.add(sam);

        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
