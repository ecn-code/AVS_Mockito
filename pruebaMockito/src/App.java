import java.util.List;




public class App {
private DAO dao;

	public App(DAO _dao){
	dao=_dao;
	}
	
	public double getMedia(){
		List<Usuario> usuarios=dao.getUsuarios();
		double media=0;
		for (Usuario u : usuarios){
			media+=u.getEdad();
		}
		media/=usuarios.size();
		return media;
	}
}
