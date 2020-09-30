package org.biq.group.SpringDataElasticSearchExample.repository;

import org.biq.group.SpringDataElasticSearchExample.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {

}
