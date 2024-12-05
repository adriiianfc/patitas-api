package mx.enti.patitas.api.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8128403385119917574L;
	private String usuario;
    private String password;
    
}
