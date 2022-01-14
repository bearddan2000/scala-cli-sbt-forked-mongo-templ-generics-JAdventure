package example.service;

import java.util.List;

/**
 * @author regcrix
 */
 trait GenericService[T] {

    def findAll(c: Class[T]): List[T];

    def findByField(c: Class[T], field: String, value: String): T;

}
