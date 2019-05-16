import gardening.fruits._

object PrintPlanted {
  def main(args: Array[String]): Unit = {
    for (fruit <- fruits.planted) {
      showFruit(fruit)
    }
  }
}
