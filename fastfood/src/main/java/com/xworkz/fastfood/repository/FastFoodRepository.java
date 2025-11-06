package com.xworkz.fastfood.repository;

import com.xworkz.fastfood.entity.FastFoodEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FastFoodRepository extends JpaRepository<FastFoodEntity,Integer> {

    FastFoodEntity findByFoodName(String foodName);

    @Modifying
    @Transactional
    @Query("DELETE FROM FastFoodEntity f WHERE f.foodId IN :ids")
    int bulkDeleteByIds(@Param("ids") List<Integer> ids);

    @Modifying
    @Transactional
    @Query("UPDATE FastFoodEntity f SET f.price = :price WHERE f.foodId IN :ids")
    int bulkUpdatePriceByIds(@Param("price") Float price, @Param("ids") List<Integer> ids);

    @Query("SELECT f FROM FastFoodEntity f WHERE f.price= :price")
    List<FastFoodEntity> getListByPrice(@Param("price") Float price);
}
