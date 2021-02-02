package com.saji.stocks;

import com.saji.stocks.core.services.pojos.StockPojo;
import com.saji.stocks.core.services.stock.IStock;
import com.saji.stocks.mongo.services.IStockData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author saji 09-Sep-2018
 */

@RestController
@RequestMapping("/admin/services")
public class AdminController {

    @Autowired
    private IStock istock;
    @Autowired
    private IStockData iStockData;

    @PutMapping("/stock")
    public String createOrUpdateStock(@RequestBody StockPojo pojo) {
        pojo.setSymbol(pojo.getSymbol().concat(".").concat(pojo.getExchange()));
        String output = "Stock not listed in Yahoo Finance";
        try {
            if (iStockData.isStockValid(pojo.getSymbol())) {

                output = istock.createStock(pojo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

}
