package example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.repository.GenericRepository;

import java.util.List;

/**
 * @author ragcrix
 */
@Service
class GenericServiceImpl[T] @Autowired() (genericRepository: GenericRepository[T])
extends GenericService[T] {

  override def findAll(c: Class[T]): List[T] = genericRepository.findAll(c)

  override def findByField(c: Class[T], field: String, value: String): T = genericRepository.findByField(c, field, value)

}
