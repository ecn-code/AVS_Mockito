package com.avs.mockito;

/**
 * Hello world!
 *
 */
public class App 
{
    private DAO dao;
    public App(DAO _dao){
    dao = _dao;
    }
    public boolean getInfo(){
    return dao.getA();
    }
}
