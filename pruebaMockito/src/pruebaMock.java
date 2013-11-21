import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class pruebaMock {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
	
		DAO mockDao=Mockito.mock(DAO.class);
		Usuario mockUsuario1=Mockito.mock(Usuario.class);
		Usuario mockUsuario2=Mockito.mock(Usuario.class);
		Usuario mockUsuario3=Mockito.mock(Usuario.class);
		
		ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
		usuarios.add(mockUsuario1);
		usuarios.add(mockUsuario2);
		usuarios.add(mockUsuario3);
		
		App app=new App(mockDao);
		Mockito.when(mockUsuario1.getEdad()).thenReturn(20);
		Mockito.when(mockUsuario2.getEdad()).thenReturn(10);
		Mockito.when(mockUsuario3.getEdad()).thenReturn(30);
		
		Mockito.when(mockDao.getUsuarios()).thenReturn(usuarios);
		assertTrue("correcto", app.getMedia()==20);
		
	}

}
