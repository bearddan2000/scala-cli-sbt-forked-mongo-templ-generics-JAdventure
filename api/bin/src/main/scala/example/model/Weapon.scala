package example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weapon")
case class Weapon (
  @Id id: String
  , @Indexed name: String
  , description: String
  , position: String
  , level: Int
  , properties: Properties) {

    override def toString(): String = {
      var sb = new StringBuilder()
      sb.append("{")
      sb.append(" 'id': '" + id + "'")
      sb.append(", 'name': '" + name + "'")
      sb.append(", 'description': '" + description + "'")
      sb.append(", 'position': '" + position + "'")
      sb.append(", 'level': " + level)
      sb.append(", 'properties': " + properties.toString())
      sb.append("}")
      return sb.toString()
    }
  }
