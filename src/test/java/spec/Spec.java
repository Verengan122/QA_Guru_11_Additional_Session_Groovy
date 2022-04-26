package spec;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.http.ContentType.JSON;
import static listner.CustomAllureListener.withCustomTemplates;

public class Spec {
    public static RequestSpecification request = RestAssured.with()
            .baseUri("https://reqres.in")
            .contentType(JSON)
            .log().uri()
            .log().body();
}
