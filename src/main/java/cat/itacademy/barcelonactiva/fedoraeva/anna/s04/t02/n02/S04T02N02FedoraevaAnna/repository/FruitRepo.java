package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.domain.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Integer> {
	
	

}
