package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.IceCreamOrderDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IceCreamOrderServiceImpl implements IceCreamOrderService {

    public IceCreamOrderServiceImpl() {
        System.out.println("IceCreamOrderService Implementation constructor");
    }

    @Override
    public boolean validate(IceCreamOrderDTO iceCreamOrderDTO) {
        System.out.println("validate method in IceCreamOrderService Implementation");

        if (iceCreamOrderDTO != null) {
            System.out.println("Ice cream Dto is not null");
        } else {
            System.out.println("Ice cream Dto is null");
            return false;
        }

        String name = iceCreamOrderDTO.getName();
        if (name == null || name.length() < 3 || name.length() > 25) {
            System.out.println("Name is not valid");
            return false;
        } else {
            System.out.println("Name is valid");
        }

        String flavour = iceCreamOrderDTO.getFlavour();
        if (flavour == null) {
            System.out.println("Flavour is not valid");
            return false;
        } else {
            System.out.println("Flavour is valid");
        }

        int quantity = iceCreamOrderDTO.getQuantity();
        if (quantity < 0 || quantity > 15) {
            System.out.println("Quantity is invalid");
            return false;
        } else {
            System.out.println("Quantity is valid");
        }

        String couponCode = iceCreamOrderDTO.getCouponCode();
        if (couponCode != null) {
            List<String> couponList = couponList();
            boolean find = couponList.stream().anyMatch(code -> code.equals(couponCode));

            if(find){
            System.out.println("Coupon code is valid");
            }else {
                System.out.println("Coupon code is not present in list");
                return false;
            }
        } else {
            System.out.println("Coupon code is Invalid");
            return false;
        }

        System.out.println("All inputs are valid");
        return true;
    }

    public List<String> couponList() {
        List<String> coupon = new ArrayList<>();
        coupon.add("NEW50");
        coupon.add("FESTIVAL50");
        coupon.add("SALE75");
        coupon.add("ICE20");
        coupon.add("COOL40");
        coupon.add("BITES20");
        coupon.add("SHOP25");
        coupon.add("BOX20");
        coupon.add("FAMILY20");
        coupon.add("MELTS20");

        return coupon;
    }
}
