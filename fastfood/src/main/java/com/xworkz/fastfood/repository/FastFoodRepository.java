package com.xworkz.fastfood.repository;

import com.xworkz.fastfood.entity.FastFoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FastFoodRepository extends JpaRepository<FastFoodEntity,Integer> {

    FastFoodEntity findByFoodName(String foodName);
}
