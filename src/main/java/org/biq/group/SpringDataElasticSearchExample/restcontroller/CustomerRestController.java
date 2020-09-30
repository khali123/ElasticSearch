package org.biq.group.SpringDataElasticSearchExample.restcontroller;

import org.biq.group.SpringDataElasticSearchExample.repository.CustomerRepository;
import org.biq.group.SpringDataElasticSearchExample.model.Customer;
import org.biq.group.SpringDataElasticSearchExample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/addCustomer")
    public Customer addCustomer(){
      return customerRepository.save(new Customer("a1","biq","khalid",11));
    }

}
