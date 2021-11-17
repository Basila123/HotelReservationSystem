import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;
public class HotelRecordTest extends TestCase {


    public void whenGivenHotel1NameTheHotelObjShouldBeAddedToHashMap() {
        Hotel obj = new Hotel();
        obj.setHotelName("Lakewood");
        Assert.assertEquals("Lakewood", obj.getHotelName());
    }

   /* @Test
    public void whenGivenHotel2NameTheHotelObjShouldBeAddedToHashMap() {
        Hotel obj = new Hotel();
        obj.setHotelName("Bridgewood");
        Assert.assertEquals("Bridgewood", obj.getHotelName());
    }

    @Test
    public void whenGivenHotel3NameTheHotelObjShouldBeAddedToHashMap() {
        Hotel obj = new Hotel();
        obj.setHotelName("Ridgewood");
        Assert.assertEquals("Ridgewood", obj.getHotelName());
    }*/

}