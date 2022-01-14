package example.model;

 import java.lang.reflect._

class Properties {
    var armor: Int = -1
    var health: Int = -1
    var maxHealth: Int = -1
    var damage: Int = -1
    var weight: Int = -1
    var value: Int = -1

    override def toString(): String = {
      var sb = new StringBuilder()
      sb.append("{")
      sb.append(" 'armor': " + armor)
      sb.append(", 'health': " + health)
      sb.append(", 'maxHealth': " + maxHealth)
      sb.append(", 'damage': " + damage)
      sb.append(", 'weight': " + weight)
      sb.append(", 'value': " + value)
      sb.append("}")
      return sb.toString()
    }
}
