package utilidades;

import modelos.dispositivos.DispositivoInteligente;
import modelos.dispositivos.TipoDispositivo;

import java.util.List;

public class DispositivoInteligenteDAO {

    public TipoDispositivo getTipoDispositivo(String equipoConcreto){
        try {
            final String hql = "FROM TipoDispositivo where equipoConcreto = :nombre";
            List<TipoDispositivo> lista = DatabaseUtil.getSession().createQuery(hql,TipoDispositivo.class)
                    .setParameter("nombre",equipoConcreto).getResultList();

            if( lista != null) return lista.get(0); else return null;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public DispositivoInteligente getDispositivoInteligente( String nombre){
        try {
            final String hql = "FROM DispositivoInteligente where nombre = :nombre";
            List<DispositivoInteligente> lista = DatabaseUtil.getSession().createQuery(hql,DispositivoInteligente.class)
                    .setParameter("nombre",nombre).getResultList();

            if( lista != null) return lista.get(0); else return null;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
