package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.domain.Fruit;
import cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n02.S04T02N02FedoraevaAnna.service.FruitService;

@RestController
@RequestMapping("/fruit")
public class FruitController {

	@Autowired
	FruitService fruitService;

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Fruit fruit) {
		return new ResponseEntity<>(fruitService.save(fruit), HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable int id, @RequestBody Fruit fruit) {
		return fruitService.update(id, fruit);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		return fruitService.delete(id);

	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		return fruitService.findAll();
	}

	@GetMapping("getOne/{id}")
	public ResponseEntity<?> getOne(@PathVariable int id) {
		return fruitService.getOne(id);
	}

}
