package example.controller;

import example.model.Location;
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
@RequestMapping(Array("/locations"))
class LocationController  @Autowired() (itemService: GenericService[Location])
{

  @GetMapping(Array("/coor/{value}"))
  def getByName(@PathVariable("value") value: String): String = itemService.findByField(classOf[Location], "coordinate", value).toString()

  @GetMapping(Array("/"))
  def getAll(): String =
  {
    var sb = new StringBuilder();
    itemService.findAll(classOf[Location]).forEach( x => sb.append(x.toString()+"\n") );
    return sb.toString();
  }
}
