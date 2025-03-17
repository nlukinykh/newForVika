import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestAPI {
    @Test
    public void testStatusCode() {
        given().when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then()
                .assertThat()
                .statusCode(200);

        JsonPath response = given()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .jsonPath();
        List<String> messages = response.getList("name");
        System.out.println(messages);
    }

    @Test
    public void testGetSpecialPet() {
        // Specify the base URL to the RESTful web service
        String petId = "9223372036854744002";
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/" + petId;
        Response response = given().when().get().thenReturn();
        // Print the status and message body of the response received from the server
        System.out.println("Response=>" + response.prettyPrint());

        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testCreationPet() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
        String petId = "9223372036854744002";

        String newAnimal = "" +
                "{\n" +
                "  \"id\": " + petId + ",\n" +
                "  \"category\": {\n" +
                "    \"id\": " + petId + ",\n" +
                "    \"name\": \"home cat\"\n" +
                "  },\n" +
                "  \"name\": \"Masyanya\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": " + petId + ",\n" +
                "      \"name\": \"very nice\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Response response =  given()
                .header("accept", "application/json")
                //.accept(ContentType.JSON)
                .header("Content-Type", "application/json")
                //.contentType("application/json")
                .and()
                .body(newAnimal)
                .when()
                .post()
                .then()
                .extract().response();

        System.out.println("Response=>" + response.prettyPrint());

        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testRemovingPetFromList() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
        String petId = "9223372036854744002";

        Response response = given()
                .accept(ContentType.JSON)
                .when()
                .delete(petId)
                .then()
                .extract().response();

        System.out.println("Response=>" + response.prettyPrint());

        Assertions.assertEquals(200, response.statusCode());
    }
}
