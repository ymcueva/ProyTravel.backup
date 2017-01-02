package pe.com.paxtravel.model.dao.ibatis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pe.com.paxtravel.bean.CiudadBean;
import pe.com.paxtravel.bean.ClienteBean;
import pe.com.paxtravel.bean.CotizacionBean;
import pe.com.paxtravel.bean.CotizacionDetalleBean;
import pe.com.paxtravel.bean.CotizacionDetalleTicketVueloBean;
import pe.com.paxtravel.bean.EmpleadoBean;
import pe.com.paxtravel.bean.FareInfoBean;
import pe.com.paxtravel.bean.InseminacionBean;
import pe.com.paxtravel.bean.MotivoViajeBean;
import pe.com.paxtravel.bean.PaisBean;
import pe.com.paxtravel.bean.ProduccionBean;
import pe.com.paxtravel.bean.ServicioAdicionalBean;
import pe.com.paxtravel.model.dao.CotizacionDAO;
import pe.com.paxtravel.model.dao.EmpleadoDAO;

public class SqlMapCotizacionDAO extends SqlMapClientDaoSupport implements CotizacionDAO{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CotizacionBean> listaCotizacion(CotizacionBean cotizacionBean){
		List<CotizacionBean> listaCotizacion = null;
		listaCotizacion = getSqlMapClientTemplate().queryForList("cotizacion.listarCotizacion", cotizacionBean);
		return listaCotizacion;
	}

	@Override
	public String generarNumeroCotizacion() {
		String numeroCotizacion = "";
		numeroCotizacion = (String) getSqlMapClientTemplate().queryForObject("cotizacion.obtenerNumeroCotizacion");
		return numeroCotizacion;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CiudadBean> listaCiudad(CiudadBean ciudadBean){
		List<CiudadBean> listaCiudad = null;
		listaCiudad = getSqlMapClientTemplate().queryForList("cotizacion.listarCiudad", ciudadBean);
		return listaCiudad;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PaisBean> listaPais(PaisBean paisBean){
		List<PaisBean> listaPais = null;
		listaPais = getSqlMapClientTemplate().queryForList("cotizacion.listarPais", paisBean);
		return listaPais;
	}
	
	@Override
	public int registrarCotizacion(CotizacionBean cotizacionBean) {
		new SqlMapClientTemplate(getSqlMapClientTemplate().getSqlMapClient()).update("cotizacion.insertarCotizacion", cotizacionBean);
		return 1;
	}
	
	@Override
	public int registrarMotivo(MotivoViajeBean motivoViajeBean) {
		new SqlMapClientTemplate(getSqlMapClientTemplate().getSqlMapClient()).update("cotizacion.insertarMotivoViaje", motivoViajeBean);
		return 1;
	}

	@Override
	public int registrarServicio(ServicioAdicionalBean servicioAdicionalBean){
		new SqlMapClientTemplate(getSqlMapClientTemplate().getSqlMapClient()).update("cotizacion.insertarServicioAdicional", servicioAdicionalBean);
		return 1;
	}

	@Override
	public int registrarCotizacionTicket(CotizacionBean cotizacionBean) {
		new SqlMapClientTemplate(getSqlMapClientTemplate().getSqlMapClient()).update("cotizacion.insertarCotizacionTicket", cotizacionBean);
		return 1;
	}

	@Override
	public int registrarCotizacionDetalleTicket(CotizacionDetalleBean cotizacionDetalleBean){
		new SqlMapClientTemplate(getSqlMapClientTemplate().getSqlMapClient()).update("cotizacion.insertarCotizacionDetalleTicket", cotizacionDetalleBean);
		return 1;
	}
//

	@SuppressWarnings("unchecked")
	@Override
	public List<ClienteBean> obtenerNombreCliente(ClienteBean clienteBean){
		List<ClienteBean> cliente = new ArrayList<ClienteBean>();
		cliente = getSqlMapClientTemplate().queryForList("cotizacion.obtenerNombreCliente", clienteBean);
		return cliente;
	}
	
	
	@Override
	public FareInfoBean getConsolidador(FareInfoBean fareInfoBean) {		
		return (FareInfoBean) getSqlMapClientTemplate().queryForObject("cotizacion.getConsolidador", fareInfoBean);		
	}
	
	@Override
	public int registrarConsolidador(CotizacionDetalleTicketVueloBean fareInfoBean){
		new SqlMapClientTemplate(getSqlMapClientTemplate().getSqlMapClient()).update("cotizacion.insertarCotizacionDetalleTicketVueloTab2", fareInfoBean);
		return 1;
	}
	
}