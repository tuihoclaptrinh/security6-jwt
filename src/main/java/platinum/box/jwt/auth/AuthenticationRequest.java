package platinum.box.jwt.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | AuthenticationRequest
 * @since : 3:52 PM | 4/13/2023
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    private String email;
    String password;

}
