package com.saji.stocks;

import com.saji.stocks.core.services.pojos.StockTAO;
import com.saji.stocks.core.services.stock.IStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author saji 09-Sep-2018
 */

@RestController
@RequestMapping("/stocks/services")
public class StockController {

    @Autowired
    private IStock istock;

    @GetMapping("/listStocks")
    public List<StockTAO> getAllActiveStocks() {
        return istock.listAllActiveStocks();
    }

    @GetMapping("/new/listStocks")
    public List<String> getAllNewActiveStocks() {
        return istock.listNewStocks();
    }


}
