package skemex.pos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import skemex.pos.bo.ProductoBO;
import skemex.pos.vo.Product;

public class PrecioProductoTest {
	@Test
	public void testCalcularPrecio() {
		double resultadoEsperado = 266.66666666666663;

		ProductoBO productoBO = new ProductoBO();
		double precioVenta = productoBO.calcularPrecio(new Product("abc", "caracoles", 200.00, 0.00, 1), 25);
		assertEquals(resultadoEsperado, precioVenta, 0.001);
	}
}