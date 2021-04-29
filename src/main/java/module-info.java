/**
 * @author saji 06-Apr-2018
 */
module stocks.services {
    requires transitive stocks.core;
    requires transitive stocks.mongo;
    requires transitive stocks.redis;
    requires transitive stocks.candlesticks;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.context;
    requires spring.webmvc;
    exports com.saji.stocks to spring.web;
    opens com.saji.stocks to spring.core, spring.beans, spring.context;
}