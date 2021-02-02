/**
 * @author saji 06-Apr-2018
 */
module stocks.services {
    requires transitive stocks.core;
    requires transitive stocks.mongo;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    uses com.saji.stocks.core.services.stock.IStock;
    exports com.saji.stocks to spring.web;
    opens com.saji.stocks to spring.core, spring.beans, spring.context;
}