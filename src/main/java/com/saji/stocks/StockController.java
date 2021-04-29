package com.saji.stocks;

import com.saji.stocks.core.services.watchlist.IWatch;
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
    private IWatch iWatch;

    @GetMapping("/watchlist")
    public List<String> getGoodStocks() {
        return iWatch.listGoodStocks();
    }


}
