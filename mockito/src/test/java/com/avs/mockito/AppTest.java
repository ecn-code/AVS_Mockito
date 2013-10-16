package com.avs.mockito;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        
        DAO mockDAO = Mockito.mock(DAO.class);
        Usuario mockUsuario1 = Mockito.mock(Usuario.class);
        Usuario mockUsuario2 = Mockito.mock(Usuario.class);
        Usuario mockUsuario3 = Mockito.mock(Usuario.class);
        
        Mockito.when(mockUsuario1.getEdad()).thenReturn(20);
        Mockito.when(mockUsuario2.getEdad()).thenReturn(10);
        Mockito.when(mockUsuario3.getEdad()).thenReturn(10);
        App app = new App(mockDAO);
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(mockUsuario1);
        usuarios.add(mockUsuario2);
        usuarios.add(mockUsuario3);
        Mockito.when(mockDAO.getUsuarios()).thenReturn(usuarios);
       assertEquals( (double)40/3,app.getMedia() );
    }
}
