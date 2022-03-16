package com.pertevmeric.java;

import java.util.Properties;

public class Props {

    CredentialsLocked cLock = new CredentialsLocked();
    Properties props = cLock.getCreds();

    public String getProps(String propsWhich)
    {
        String result =  this.props.getProperty(propsWhich);

        return  result;
    }
}
