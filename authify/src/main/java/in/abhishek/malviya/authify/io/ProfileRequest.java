package in.abhishek.malviya.authify.io;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequest {

    @NotBlank(message = "Name should not be empty")
    private String name;

    @Email(message = "Enter a valid Email address")
    @NotNull(message = "Email should not be empty")
    private String email;
    @Min(value = 8, message = "Password must be atleast 8 characters.")
    private String password;
}
