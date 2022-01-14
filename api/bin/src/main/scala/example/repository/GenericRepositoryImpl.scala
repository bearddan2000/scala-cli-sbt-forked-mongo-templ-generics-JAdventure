package example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
class GenericRepositoryImpl[T] @Autowired() (mongoTemplate: MongoTemplate)
extends GenericRepository[T]{

    override def findAll(c: Class[T]): List[T] = {
      val query = new Query();
      val list = mongoTemplate.find(query, c);
      return list;
    }

    override def findByField(c: Class[T], field: String, value: String): T = {
      val query = new Query();
      query.addCriteria(
          new Criteria().andOperator(
              Criteria.where(field).is(value)
          )
      );
      val list = mongoTemplate.find(query, c);

      return list.get(0);
    }
}
