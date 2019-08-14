package testbase.hotelbookingtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pages;
import testbase.base.TestBase;

public class HotelBookingTest extends TestBase {
    @Test
    public void shouldBeAbleToSearchForHotels(){
        Assert.assertTrue(Pages.hotelBookings().hotelBooking(),"failed to search");
    }
}
