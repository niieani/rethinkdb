// Autogenerated by convert_protofile.py on 2015-05-06.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/ResponseDatum.java
package com.rethinkdb.response;

import com.rethinkdb.proto.DatumType;

public class Datum {
    private DatumType datumType;

    public Datum(){
        throw new RuntimeException("constructor for datum not written");
    }

    public DatumType getType() {
        return datumType;
    }

    public boolean isNull() {
        return datumType == DatumType.R_NULL;
    }

    public boolean isBool() {
        return datumType == DatumType.R_BOOL;
    }

    public boolean isNum() {
        return datumType == DatumType.R_NUM;
    }

    public boolean isStr() {
        return datumType == DatumType.R_STR;
    }

    public boolean isArray() {
        return datumType == DatumType.R_ARRAY;
    }

    public boolean isObject() {
        return datumType == DatumType.R_OBJECT;
    }

    public boolean isJson() {
        return datumType == DatumType.R_JSON;
    }


}
