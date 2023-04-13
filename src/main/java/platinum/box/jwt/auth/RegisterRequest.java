package platinum.box.jwt.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | RegisterRequest
 * @since : 3:51 PM | 4/13/2023
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstName;
    private String lassName;
    private String email;
    private String password;

}
