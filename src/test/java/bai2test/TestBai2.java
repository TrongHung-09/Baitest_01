package bai2test;

import com.example.ktncbaitest.buoi9.XeOto;
import com.example.ktncbaitest.buoi9.XeOtoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestBai2 {

    private XeOtoService service = new XeOtoService();

    @Test
    public void testAddInValid1() {
        XeOto xeOto = new XeOto(1, "Vinfast VF9", "Vinfast", "Model 1", 1000000000000.0, 1, 2024, "Trắng");
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.addXeOto(xeOto));
        System.out.println(e.getMessage());
    }

    @Test
    public void testAddInValid2() {
        XeOto xeOto = new XeOto(10, "Vinfast VF9@", "Vinfast", "Model 1", 1000000000000.0, 1, 2024, "Trắng");
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.addXeOto(xeOto));
        System.out.println(e.getMessage());
    }

    @Test
    public void testAddInValid3() {
        XeOto xeOto = new XeOto(10, "Vinfast VF9@", null, "Model 1", 1000000000000.0, 1, 2024, "Trắng");
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> service.addXeOto(xeOto));
        System.out.println(e.getMessage());
    }

    @Test
    public void testAddValid() {
        XeOto xeOto = new XeOto(10, "Vinfast VF91", "Vinfast", "Model 1", 1000000000000.0, 1, 2024, "Trắng");
        Assertions.assertTrue(service.addXeOto(xeOto));
    }

    @Test
    public void testSearchByName1(){
        List<XeOto> list = service.search("Vinfast VF9", null);
        for (XeOto xeOto: list) {
            System.out.println(xeOto);
        }
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testSearchByName2(){
        List<XeOto> list = service.search("VF9", null);
        for (XeOto xeOto: list) {
            System.out.println(xeOto);
        }
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testSearchByBrand1(){
        List<XeOto> list = service.search(null, "Vinfast");
        for (XeOto xeOto: list) {
            System.out.println(xeOto);
        }
        Assertions.assertEquals(4, list.size());
    }

    @Test
    public void testSearchByBrand2(){
        List<XeOto> list = service.search(null, "Brand không tồn tại");
        for (XeOto xeOto: list) {
            System.out.println(xeOto);
        }
        Assertions.assertEquals(0, list.size());
    }

}
