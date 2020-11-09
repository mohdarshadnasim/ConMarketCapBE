package com.backend.runner;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BackEndTask_3 {

    @Test
    public void firstTenCurrenciesVerification() {

        /*
        * Retrieve the first 10 currencies from the cryptocurrency/info call (ID 1, 2, 3 … 10).
        * Check which currencies have the mineable tag associated with them.*/
        for (int i = 1; i <= 10; i++) {

            given()
                    .header("X-CMC_PRO_API_KEY", "3a452e95-acf9-482e-8964-3b7d1643ea60")
                    .param("id", i)
                    .when()
                    .get("https://pro-api.coinmarketcap.com/v1/cryptocurrency/info?id=1027")
                    .then()
                    .assertThat()
                    .statusCode(200)
                    .body("data.1027.tags[0]", equalTo("mineable"));

        }
    }
}
