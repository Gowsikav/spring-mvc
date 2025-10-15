package com.xworkz.fastfood.service;

import com.xworkz.fastfood.dto.FastFoodDTO;

public interface FastFoodService {

    boolean saveData(FastFoodDTO fastFoodDTO);
    FastFoodDTO getDataByFoodName(String foodName);

    FastFoodDTO updateFoodByName(String foodName, FastFoodDTO updatedDto);

    boolean deleteByFoodName(String foodName);
}
