package com.criss.miindicadorsolid.api;

import com.criss.miindicadorsolid.pojo.indicadorEconomico.IndicadorEconomico;

public class Response {

    public ResponseState state;
    public boolean hasError;
    public RequestType requestType;
    public IndicadorEconomico result;
    public String errorMessage;

    public enum ResponseState {
        SUCCESS,
        FAILURE,
        NO_CONNECTION
    }

    public enum RequestType {
        SEARCH_FOR_INDICADOR
    }
}
