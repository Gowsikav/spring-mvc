package com.xworkz.fastfood.service;

import com.xworkz.fastfood.dto.FastFoodDTO;
import com.xworkz.fastfood.entity.FastFoodEntity;
import com.xworkz.fastfood.repository.FastFoodRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class FastFoodServiceImpl implements FastFoodService{

    @Autowired
    private FastFoodRepository fastFoodRepository;

    @Override
    public boolean saveData(FastFoodDTO fastFoodDTO) {
        log.info("save data method in fast food service");
        FastFoodEntity fastFoodEntity=new FastFoodEntity();
        BeanUtils.copyProperties(fastFoodDTO,fastFoodEntity);
        fastFoodEntity=fastFoodRepository.save(fastFoodEntity);

        return fastFoodEntity != null;
    }

    @Override
    public FastFoodDTO getDataByFoodName(String foodName) {
        log.info("getDataByFoodName method in fast food service");
        FastFoodEntity fastFoodEntity=fastFoodRepository.findByFoodName(foodName);
        if(fastFoodEntity!=null) {
            FastFoodDTO dto=new FastFoodDTO();
            BeanUtils.copyProperties(fastFoodEntity,dto);
            return dto;
        }
        return null;
    }

    @Override
    public FastFoodDTO updateFoodByName(String foodName, FastFoodDTO updatedDto) {

        log.info("updateFoodByName method in fast food service");
        FastFoodEntity fastFoodEntity=fastFoodRepository.findByFoodName(foodName);
        if(fastFoodEntity!=null) {
            updatedDto.setFoodId(fastFoodEntity.getFoodId());
            BeanUtils.copyProperties(updatedDto,fastFoodEntity);
            fastFoodEntity=fastFoodRepository.save(fastFoodEntity);
            BeanUtils.copyProperties(fastFoodEntity,updatedDto);
            return updatedDto;
        }
        return null;
    }

    @Override
    public boolean deleteByFoodName(String foodName) {
        log.info("deleteByFoodName method in fast food service");
        FastFoodEntity fastFoodEntity=fastFoodRepository.findByFoodName(foodName);
        if(fastFoodEntity!=null)
        {
            fastFoodRepository.delete(fastFoodEntity);
            return true;
        }
        return false;
    }

    @Transactional
    public boolean saveAllFoods(List<FastFoodEntity> foods) {
        log.info("saveAllFoods method in fast food service");
        List<FastFoodEntity> list=fastFoodRepository.saveAll(foods);
        return !list.isEmpty();
    }

    @Override
    public int deleteFoods(List<Integer> ids) {
        return fastFoodRepository.bulkDeleteByIds(ids);
    }

    public int updatePriceForFoods(Float price, List<Integer> ids) {
        return fastFoodRepository.bulkUpdatePriceByIds(price, ids);
    }

    @Override
    public List<FastFoodEntity> getListByPrice(Float price) {
        return fastFoodRepository.getListByPrice(price);
    }
}
