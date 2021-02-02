package com.saji.stocks;

import com.saji.stocks.mongo.pojos.StockData;
import com.saji.stocks.mongo.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/stocks/services/")
public class CacheController {
    @Autowired
    private IService iService;

    @GetMapping("{symbol}/data")
    public StockData getSymbol(@PathVariable("symbol") String symbol) {
        Optional<StockData> value = iService.getStockById(symbol);
        return value.isPresent() ? value.get() : null;
    }

}
