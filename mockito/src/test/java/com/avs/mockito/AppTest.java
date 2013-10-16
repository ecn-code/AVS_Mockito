package com.avs.mockito;

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
        App app = new App(mockDAO);
        Mockito.when(mockDAO.getA()).thenReturn(true);
       assertTrue( app.getInfo() );
    }
}
