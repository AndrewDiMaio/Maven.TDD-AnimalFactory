package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void add(){
    Cat cat = new Cat(null,null,null);
        CatHouse.clear();
        CatHouse.add(cat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void remove(){
        Cat cat = new Cat(null,null, 6969);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(6969);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void remove1(){
        Cat cat = new Cat(null,null, 6969);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById(){
        Cat tony = new Cat(null,null, 6969);
        CatHouse.add(tony);

        Cat expected = tony;
        Cat actual = CatHouse.getCatById(6969);

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats(){
        Cat rich = new Cat(null,null, 6969);
        CatHouse.clear();
        CatHouse.add(rich);

        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }
}
