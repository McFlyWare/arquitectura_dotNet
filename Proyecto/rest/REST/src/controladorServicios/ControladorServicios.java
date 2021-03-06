package controladorServicios;

import java.io.IOException;
import java.util.HashMap;

public class ControladorServicios {

	ServiciosEnvios servicioEnvio;
	ServiciosBanco servicioBanco;
	ServiciosProveedores servicioProveedores;

	public ControladorServicios() {
		this.servicioEnvio = new ServiciosEnvios();
		this.servicioBanco = new ServiciosBanco();
		this.servicioProveedores = new ServiciosProveedores();
	}

	public String realizarEnvio(String dirOrigen, String dirDestino) throws IOException, InterruptedException {

		return (this.servicioEnvio.realizarEnvio(dirOrigen, dirDestino));
	}

	public Boolean realizarCobro(int cedula, String valor, int pasarelaPago) throws IOException, InterruptedException {

		return (this.servicioBanco.realizarCobro(cedula, valor, pasarelaPago));
	}

	public Boolean comprobarInformacionFinanciera(int cedula, String numTarjeta, String fecha, int pasarelaPago)
			throws IOException, InterruptedException {

		return (this.servicioBanco.comprobarInfomracionFinanciera(cedula, numTarjeta, fecha, pasarelaPago));
	}

	public HashMap<String, Integer> buscarMenorPrecioProducto(int id) throws IOException, InterruptedException {
		return (this.servicioProveedores.buscarMenorPrecioProducto(id));
	}

	public String productos(int idTienda) throws IOException, InterruptedException {
		return (this.servicioProveedores.productos(idTienda));
	}
/*
	public String agregarProducto(int id, String nombre, int precio, int unidades, String presentacion)
			throws IOException, InterruptedException {
		return (this.servicioProveedores.agregarProducto(id, nombre, precio, unidades, presentacion));
	}
	*/
	public String comprarProducto(int id, int cantidad, int idTienda)
			throws IOException, InterruptedException {
		return (this.servicioProveedores.comprarProducto(id, cantidad, idTienda));
	}

}
