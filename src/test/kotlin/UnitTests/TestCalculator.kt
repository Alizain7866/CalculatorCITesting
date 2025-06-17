package UnitTests
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.example.classes.Calculator



class TestCalculator {
    private lateinit var calc: Calculator
    @BeforeEach
    fun setup() {
        calc = Calculator()
    }

    @Test
    fun testAdd()
    {
        assertEquals(3, calc.add(1, 2))
    }

    @Test
    fun testSubtract()
    {
        assertEquals(-1, calc.subtract(1, 2))
    }


    @Test
    fun testDivide()
    {
        assertEquals(2, calc.divide(4, 2))
    }


    @Test
    fun testMultiply()
    {
        assertEquals(4, calc.multiply(2, 2))
    }

}