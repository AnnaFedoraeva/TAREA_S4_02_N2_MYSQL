package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "fruits")
public class Fruit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "Kg")
	private int kg;

	public Fruit() {
	}

}
