package app.estat.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@SpringApplicationConfiguration(classes =  Application.class)
@EnableTransactionManagement
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }

    public static class Constant {

        public static final String TABLE_COW = "COW";
        public static final String TABLE_BULL = "BULL";
        public static final String TABLE_LACTATION = "LACTATION";
        public static final String TABLE_INSEMINATION = "INSEMINATION";
        public static final String TABLE_GROUP = "GROUP";

        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_PUBLIC_ID = "PUBLIC_ID";
        public static final String COLUMN_NUMBER = "NUMBER";
        public static final String COLUMN_NAME = "NAME";
        public static final String COLUMN_DATE = "DATE";
        public static final String COLUMN_BIRTH = "BIRTH";
        public static final String COLUMN_BOOK = "BOOK";

        public static final String COLUMN_COW_PARENT = "cow_parent";
        public static final String COLUMN_LACTATION_COW = "lactation_cow";
        public static final String COLUMN_INSEMINATION_BULL = "insemination_bull";
        public static final String COLUMN_INSEMINATION_COW = "insemination_cow";

    }

}
