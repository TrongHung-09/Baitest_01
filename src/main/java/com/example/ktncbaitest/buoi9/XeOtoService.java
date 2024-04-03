package com.example.ktncbaitest.buoi9;

import java.util.ArrayList;
import java.util.List;

public class XeOtoService {

    private List<XeOto> xeOtos;

    public XeOtoService() {
        xeOtos = new ArrayList<>();
        xeOtos.add(new XeOto(1, "Vinfast VF9", "Vinfast", "Model 1", 1000000000000.0, 1, 2024, "Trắng"));
        xeOtos.add(new XeOto(2, "Vinfast VF8", "Vinfast", "Model 1", 1000000000000.0, 2, 2024, "Đen"));
        xeOtos.add(new XeOto(3, "Vinfast VF7", "Vinfast", "Model 1", 1000000000000.0, 3, 2024, "Trắng"));
        xeOtos.add(new XeOto(4, "Vinfast VF6", "Vinfast", "Model 1", 1000000000000.0, 4, 2024, "Trắng"));
    }

    public boolean checkNull(XeOto oto) {
        if (oto == null || oto.getBrand() == null || oto.getCarID() == null
                || oto.getColor() == null || oto.getModel() == null
                || oto.getName() == null || oto.getPrice() == null
                || oto.getQuantity() == null || oto.getYear() == null) {
            return false;
        }
        return true;
    }

    public boolean checkName(String name) {
        String kytu[] = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", "{", "}", "[", "]", ":", ";", "/"};
        for (int i = 0; i < kytu.length; i++) {
            if (name.contains(kytu[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean addXeOto(XeOto xeOto) {
        if (!checkNull(xeOto)) {
            throw new IllegalArgumentException("Dữ liệu ô tô không hợp lệ");
        }

        if(!checkName(xeOto.getName())){
            throw new IllegalArgumentException("Tên không hợp lệ");
        }

        for (XeOto oto : xeOtos) {
            if (oto.getCarID() == xeOto.getCarID()) {
                throw new IllegalArgumentException("CardID đã tồn tại: " + oto.getCarID());
            }
        }

        xeOtos.add(xeOto);
        return true;
    }

    public List<XeOto> getAll() {
        return xeOtos;
    }

    public List<XeOto> search(String ten, String hang) {
        if (ten == null) {
            ten = "";
        }
        if (hang == null) {
            hang = "";
        }
        List<XeOto> result = new ArrayList<>();
        for (XeOto xeOto : xeOtos) {
            if (xeOto.getName().equalsIgnoreCase(ten) || xeOto.getBrand().equalsIgnoreCase(hang)) {
                result.add(xeOto);
            }
        }
        return result;
    }


}
