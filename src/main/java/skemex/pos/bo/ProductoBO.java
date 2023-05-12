package skemex.pos.bo;

import skemex.pos.vo.Product;

public class ProductoBO {

	public double calcularPrecio(Product producto, double revenuePercentage) {
		return (producto.buyPrice() / (100 - revenuePercentage)) * 100;
	}
}
