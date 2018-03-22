/***
 *  @author hieung
 *  @email hieunt1912@gmail.com
 */

package hieung.boot.restful.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import hieung.boot.restful.model.Customer;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>{

}
