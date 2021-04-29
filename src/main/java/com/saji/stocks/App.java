package com.saji.stocks;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

//@Component
// class DataLoad{
//    @PostConstruct
//    void postConstruct() {
//        try (CSVReader reader = new CSVReader(new FileReader("/Equity.csv"))) {
//            List<String[]> r = reader.readAll();
//            r.forEach(x -> System.out.println(Arrays.toString(x)));
//        }catch (IOException | CsvException e){
//            e.printStackTrace();
//        }
//System.out.println("TEST");
//    }
}
