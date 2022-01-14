package example.controller;

import example.model.Armor;
import example.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation._;

import java.util.List;

/**
 * @author ragcrix
 */
@RestController
@RequestMapping(Array("/armors"))
class ArmorController @Autowired() (itemService: GenericService[Armor])
{

  @GetMapping(Array("/name/{value}"))
  def getByName(@PathVariable("value") value: String): String = itemService.findByField(classOf[Armor], "name", value).toString()

  @GetMapping(Array("/"))
  def getAll(): String =
  {
    var sb = new StringBuilder();
    itemService.findAll(classOf[Armor]).forEach( x => sb.append(x.toString()+"\n") );
    return sb.toString();
  }
}
