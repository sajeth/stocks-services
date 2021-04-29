package com.saji.stocks;

import com.saji.stocks.candle.pojo.StocksMetaData;
import com.saji.stocks.mongo.pojos.StockData;
import com.saji.stocks.mongo.services.IService;
import com.saji.stocks.redis.constants.DateConstant;
import com.saji.stocks.redis.services.IRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stocks/services/")
public class CacheController {
    @Autowired
    private IService iService;
    @Autowired
    private IRedis iRedis;

    @GetMapping("{symbol}/data")
    public Map<DateConstant, StocksMetaData> getSymbol(@PathVariable("symbol") String symbol) {
        return iRedis.getMetatData(symbol);
    }

    @GetMapping("/listStocks")
    public List<StockData> getStocks() {
        return iService.getStocks();
    }

}
