package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.IceCreamOrderDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        if (quantity <= 0 || quantity > 15) {
            System.out.println("Quantity is Invalid");
        } else {
            System.out.println("Quantity is valid");
        }

        String couponCode = iceCreamOrderDTO.getCouponCode();
        if (couponCode != null && !couponCode.trim().isEmpty()) {
            List<String> couponList = couponList();
            boolean find = couponList.stream().anyMatch(code -> code.equals(couponCode));

            if (find) {
                System.out.println("Coupon code is valid");
            } else {
                System.out.println("Coupon code is not present in list");
                return false;
            }
        } else {
            System.out.println("Coupon code is empty");
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

    public double getPrice(String flavour, IceCreamOrderDTO iceCreamOrderDTO) {
        double totalPrice;
        Map<String, Double> price = new HashMap<>();
        price.put("Chocolate", 50d);
        price.put("Pista", 60d);
        price.put("Vanilla", 80d);
        price.put("ButterScotch", 30d);
        price.put("StrawBerry", 90d);
        price.put("Mango", 75d);
        int quantity = iceCreamOrderDTO.getQuantity();
        totalPrice = price.get(flavour) * quantity;
        boolean takeAway = iceCreamOrderDTO.isTakeAway();
        if (takeAway) {
            totalPrice += 20;
            System.out.println("Added take Away amount 20");
        }
        boolean addOn = iceCreamOrderDTO.isAddOn();
        if (addOn) {
            totalPrice = totalPrice + (15 * quantity);
            System.out.println("Added addon amount 15 for each quantity");
        }
        System.out.println("Total amount without discount: " + totalPrice);

        String couponCode = iceCreamOrderDTO.getCouponCode();
        if (couponCode == null || couponCode.trim().isEmpty()) {
            System.out.println("No discount Coupon code is null");
            return totalPrice;
        }
        System.out.println("Code: " + couponCode);
        couponCode = couponCode.replaceAll("[A-Z]", "");
        int coupon = Integer.parseInt(couponCode);
        System.out.println("discount: " + coupon);
        totalPrice = totalPrice - (totalPrice * ((double) coupon / 100));
        System.out.println("Total amount with discount: " + totalPrice);
        return totalPrice;
    }
}
