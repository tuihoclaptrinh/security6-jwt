package platinum.box.jwt.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | AuthenticationResponse
 * @since : 3:50 PM | 4/13/2023
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

    private String token;

}
