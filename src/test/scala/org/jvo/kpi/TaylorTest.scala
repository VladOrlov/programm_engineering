package org.jvo.kpi

import org.scalatest.funspec.AnyFunSpec

class TaylorTest extends AnyFunSpec {

  describe("Taylor functions for 0.3") {
    describe("with taylor series 4") {
      it("should be equal to 2.166240677847414") {
        assert(Taylor.calculate(0.3, 4) === 2.166240677847414)
      }
    }

    describe("with taylor series 0") {
      it("should produce IllegalArgumentException") {
        assertThrows[IllegalArgumentException] {
          Taylor.calculate(0.3, 0)
        }
      }
    }
  }

}
