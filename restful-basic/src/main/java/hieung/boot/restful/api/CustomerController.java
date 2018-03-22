/***
 *  @author hieung
 *  @email hieunt1912@gmail.com
 */
package hieung.boot.restful.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hieung.boot.restful.model.Customer;
import hieung.boot.restful.service.CustomerService;

@RestController
@RequestMapping(path="/api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/getAll")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		return new ResponseEntity<List<Customer>>(customerService.getAll(), HttpStatus.ACCEPTED);
	}
	
	@PostMapping(path="/simulateData")
	public ResponseEntity<HttpStatus> simulate(){
		customerService.simulate();
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
