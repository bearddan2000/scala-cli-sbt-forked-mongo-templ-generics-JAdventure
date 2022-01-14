package example.repository;

import java.util.List;

/***
  Using generics to simplify our pattern
*/
trait GenericRepository[T]{

  def findAll(c: Class[T]): List[T];

  def findByField(c: Class[T], field: String, value: String): T;

}
