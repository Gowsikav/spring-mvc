package com.xworkz.fastfood.service;

import com.xworkz.fastfood.dto.FastFoodDTO;
import com.xworkz.fastfood.entity.FastFoodEntity;

import java.util.List;

public interface FastFoodService {

    boolean saveData(FastFoodDTO fastFoodDTO);
    FastFoodDTO getDataByFoodName(String foodName);

    FastFoodDTO updateFoodByName(String foodName, FastFoodDTO updatedDto);

    boolean deleteByFoodName(String foodName);

    boolean saveAllFoods(List<FastFoodEntity> foods);

    int deleteFoods(List<Integer> ids);

    int updatePriceForFoods(Float price, List<Integer> ids);

    List<FastFoodEntity> getListByPrice(Float price);
}
