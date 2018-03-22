/***
 *  @author hieung
 *  @email hieunt1912@gmail.com
 */

package hieung.boot.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hieung.boot.restful.model.Customer;
import hieung.boot.restful.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	public void simulate() {
		for (int i = 0; i < 100; i++) {
			customerRepository.save(new Customer("name_" + i, "developer_" + i, System.currentTimeMillis()));
		}
	}

}
