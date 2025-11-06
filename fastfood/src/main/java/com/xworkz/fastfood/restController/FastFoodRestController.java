package com.xworkz.fastfood.restController;

import com.xworkz.fastfood.dto.FastFoodDTO;
import com.xworkz.fastfood.entity.FastFoodEntity;
import com.xworkz.fastfood.service.FastFoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/fastFood")
public class FastFoodRestController {

    @Autowired
    private FastFoodService fastFoodService;

    public FastFoodRestController()
    {
        log.info("FastFoodRestController method in fastfood rest controller");
    }

    @PostMapping("/saveFoodData")
    public ResponseEntity<String> saveFoodDetails(FastFoodDTO fastFoodDTO)
    {
        log.info("food details {}",fastFoodDTO);
        if(fastFoodService.saveData(fastFoodDTO))
        {
            return ResponseEntity.ok("Data saved successfully");
        }else {
            return ResponseEntity.internalServerError().body("Not Saved");
        }
    }

    @GetMapping("getFoodDataByName")
    public ResponseEntity<FastFoodDTO> getDataByFoodName(@RequestParam String foodName)
    {
        log.info("getDataByFoodName method in FastFoodRestController");
        FastFoodDTO dto=fastFoodService.getDataByFoodName(foodName);
        if(dto==null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(dto);

    }

    @PutMapping("updateFood")
    public ResponseEntity<FastFoodDTO> updateFood(@RequestParam String foodName,
                                                  @RequestBody FastFoodDTO updatedDto) {
        log.info("updateFood method in FastFoodRestController");
        FastFoodDTO dto = fastFoodService.updateFoodByName(foodName, updatedDto);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("deleteByFoodName")
    public ResponseEntity<String> deleteByFoodName(@RequestParam String foodName)
    {
        log.info("deleteByFoodNme method in FastFoodRestController");
        if(fastFoodService.deleteByFoodName(foodName))
            return ResponseEntity.ok("Data Deleted");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not Deleted");
    }

    @PostMapping("/batchInsert")
    public ResponseEntity<String> saveAllFoods(@RequestBody List<FastFoodEntity> foods) {
        String saved;
        if(fastFoodService.saveAllFoods(foods))
            saved="Batch insert done";
        else saved="Batch insert failed";

        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/bulkDelete")
    public ResponseEntity<String> deleteFoods(@RequestBody List<Integer> ids) {
        int deleted = fastFoodService.deleteFoods(ids);
        return ResponseEntity.ok(deleted + " records deleted successfully.");
    }

    @PutMapping("/bulkUpdatePrice")
    public String updatePrice(@RequestParam Float price, @RequestBody List<Integer> ids) {
        int updated = fastFoodService.updatePriceForFoods(price, ids);
        return updated + " food items updated successfully.";
    }

    @GetMapping("/bulkListByPrice")
    public List<FastFoodEntity> getListByPrice(@RequestParam Float price)
    {
        return fastFoodService.getListByPrice(price);
    }
}
