package pe.com.paxtravel.service;

import java.io.OutputStream;
import java.util.List;

import pe.com.paxtravel.bean.CiudadBean;
import pe.com.paxtravel.bean.ClienteBean;
import pe.com.paxtravel.bean.CotizacionBean;
import pe.com.paxtravel.bean.CotizacionDetalleBean;
import pe.com.paxtravel.bean.CotizacionDetalleTicketVueloBean;
import pe.com.paxtravel.bean.EmpleadoBean;
import pe.com.paxtravel.bean.FareInfoBean;
import pe.com.paxtravel.bean.MotivoViajeBean;
import pe.com.paxtravel.bean.PaisBean;
import pe.com.paxtravel.bean.ProduccionBean;
import pe.com.paxtravel.bean.ServicioAdicionalBean;

public interface CotizacionService {

	public List<CotizacionBean> listarCotizacion(CotizacionBean cotizacionBean);
	
	public String generarNumeroCotizacion();
	
	public List<CiudadBean> listarCiudad(CiudadBean ciudadBean);
	
	public List<PaisBean> listarPais(PaisBean paisBean);

	public int registrarCotizacion(CotizacionBean cotizacionBean);
	
	public int registrarMotivo(MotivoViajeBean motivoViajeBean);
	
	public int registrarServicio(ServicioAdicionalBean servicioAdicionalBean);

	public int registrarCotizacionTicket(CotizacionBean cotizacionBean);
	
	public int registrarCotizacionDetalleTicket(CotizacionDetalleBean cotizacionDetalleBean);

	public List<ClienteBean> obtenerNombreCliente(ClienteBean clienteBean);
	
	public FareInfoBean getConsolidador(FareInfoBean fareInfoBean);
	
	public int registrarConsolidador(CotizacionDetalleTicketVueloBean fareInfoBean);
	
}
