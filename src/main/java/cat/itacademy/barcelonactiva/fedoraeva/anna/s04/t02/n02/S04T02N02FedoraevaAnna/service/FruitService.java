package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.domain.Fruit;

public interface FruitService {

	public Fruit save(Fruit fruit);

	public Optional<Fruit> findById(int id);

	public ResponseEntity<Fruit> update(int id, Fruit fruit);

	public ResponseEntity<?> delete(int id);

	public ResponseEntity<?> findAll();

	public ResponseEntity<?> getOne(int id);
}
