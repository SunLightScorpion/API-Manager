package org.scorpion;

import org.scorpion.api.BaseAPI;

public class APIManager {

    private final BaseAPI api;

    public APIManager(BaseAPI api){
        this.api = api;
    }

    public BaseAPI buildAPI(){
        return api;
    }

    public APIManager enable(){
        api.enable();
        return this;
    }

}
