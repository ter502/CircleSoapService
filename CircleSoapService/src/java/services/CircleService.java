/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author eiwte
 */
@WebService(serviceName = "CircleService")
public class CircleService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "area")
    public double area(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return 22.0 / 7 * Math.pow(r, 2);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "circumference")
    public double circumference(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return 2.0 * 22.0 / 7 * r;
    }







}
