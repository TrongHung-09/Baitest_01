package bai1test;

import com.example.ktncbaitest.buoi9.Bai1Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBai1 {

    private Bai1Service service = new Bai1Service();

    @Test
    public void testAvgInValid1() {
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.avg(11, 10, 9));
        System.out.println(e.getMessage());
    }

    @Test
    public void testAvgInValid2() {
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.avg(-1, 10, 9));
        System.out.println(e.getMessage());
    }
    @Test
    public void testAvgInValid3() {
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.avg(9.0f, 11, 9));
        System.out.println(e.getMessage());
    }

    @Test
    public void testAvgInValid4() {
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.avg(9, 10, -1));
        System.out.println(e.getMessage());
    }

    @Test
    public void testAvgValid() {
        Assertions.assertEquals(6.0, service.avg(0, 10, 10));
    }

    @Test
    public void testTongChanInValid(){
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.tongChan(-9));
        System.out.println(e.getMessage());
    }

    @Test
    public void testTongChanValid1(){
        Assertions.assertEquals(service.tongChan(6), service.tongChan(5));
    }

    @Test
    public void testTongChanValid2(){
        Assertions.assertEquals(49, service.tongChan(10));
    }

}
