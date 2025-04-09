package example

import example.ExampleTest.*
import org.scalacheck.Gen
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

final class ExampleTest extends AnyFunSpec with ScalaCheckPropertyChecks with Matchers {
  describe("Example") {
    it("should generate an apple string") {
      forAll(fruitStringsGen) { string =>
        string.toLowerCase should ===("apple")
      }
    }
  }
}

object ExampleTest {
  private val fruitStringsGen: Gen[String] = Gen.oneOf("Apple", "APPLE", "ApPle")
}