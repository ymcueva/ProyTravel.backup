package pe.com.paxtravel.model.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pe.com.paxtravel.bean.CotizacionBean;
import pe.com.paxtravel.bean.PaqueteTuristicoBean;
import pe.com.paxtravel.model.dao.PaqueteTuristicoDAO;

public class SqlMapPaqueteTuristicoDAO extends SqlMapClientDaoSupport implements PaqueteTuristicoDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<PaqueteTuristicoBean> listaPaqueteTuristico(PaqueteTuristicoBean paqueteTuristicoBean) {
		List<PaqueteTuristicoBean> listaPaquete = null;
		listaPaquete = getSqlMapClientTemplate().queryForList("paqueteturistico.listarPaqueteTuristico", paqueteTuristicoBean);
		return listaPaquete;
	}

}
