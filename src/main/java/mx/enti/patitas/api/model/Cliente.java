package mx.enti.patitas.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
@Entity
@Table(name = "clientes")
public class Cliente  implements Serializable{
	private static final long serialVersionUID = -1211772560336405427L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "email")
    private String email;
	@Column(name = "telefono")
    private String telefono;

    //@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    //private List<Mascota> mascotas;

}
