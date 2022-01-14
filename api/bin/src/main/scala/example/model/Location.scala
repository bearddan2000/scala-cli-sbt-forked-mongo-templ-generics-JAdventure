package example.model;

import java.util.{ArrayList, List};
import java.util.stream.Collectors.joining;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "locations")
case class Location (
    @Id id: String
    , danger: Int
    , title: String
    , description: String
    , locationType: String
    , @Indexed coordinate: String)
{

  var items :List[String] = new ArrayList[String]()
  var npcs :List[String] = new ArrayList[String]()

  override def toString(): String = {
    var sb = new StringBuilder()
    sb.append("{")
    sb.append(" 'id': '" + id + "'")
    sb.append(", 'danger': " + danger)
    sb.append(", 'title': '" + title + "'")
    sb.append(", 'description': '" + description + "'")
    sb.append(", 'locationType': '" + locationType + "'")
    sb.append(", 'coordinate': '" + coordinate + "'")
    sb.append(", 'items': [" + makeFoldLeftStr(items) + "]")
    sb.append(", 'npcs': [" + makeFoldLeftStr(npcs) + "]")
    sb.append("}")
    return sb.toString()
  }

  def makeFoldLeftStr(lst: List[String]): String = lst.stream().map(x => "'" + x + "'").collect(joining(","))

}
