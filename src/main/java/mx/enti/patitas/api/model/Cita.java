package mx.enti.patitas.api.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "citas")
public class Cita implements Serializable {
	private static final long serialVersionUID = 8323043203483410590L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;

	@Column(name = "razon")
    private String razon;

	@Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idmascota", nullable = false)
    private Mascota mascota;
}
