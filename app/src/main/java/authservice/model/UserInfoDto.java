package authservice.model;

import authservice.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.security.core.userdetails.User;


/*
Notes:
In most Spring Boot projects, the model folder is used for:
1. Data Transfer Objects (DTOs)
2. Other plain Java objects (POJOs) that are not entities, but used to structure or move data between layers (e.g., between backend and frontend).

What is a DTO?
DTO = Data Transfer Object
1. A DTO is a simple object used to transfer data between layers (especially between the client and server).
2. It often contains a subset or a different shape of an Entity.
3. Unlike entities, DTOs do not have database logic or annotations like @Entity, @Id, etc.

Why Use a DTO (like UserInfoDto)?
1. Avoid exposing your JPA Entity directly to the client (e.g., over REST).
   Entities can leak sensitive fields (like passwords).
2.You may want to reshape or rename fields for the API response.
3. DTOs help with validation, security, and decoupling.
4. Easier to extend or adapt as your API evolves — without touching your core DB entity.
 */

@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo {

    private String firstName; // first_name

    private String lastName; // last_name

    private Long phoneNumber; // phone_number

    private String email;

}
