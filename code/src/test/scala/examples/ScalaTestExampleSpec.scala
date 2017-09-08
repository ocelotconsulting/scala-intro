package examples

import org.scalatest.{Matchers, path}

class ScalaTestExampleSpec extends path.FunSpec with Matchers {
  def meaningOfLife = 42

  describe("meaning of life") {
    it("is forty two") {
      meaningOfLife shouldBe 42
    }
  }
}
