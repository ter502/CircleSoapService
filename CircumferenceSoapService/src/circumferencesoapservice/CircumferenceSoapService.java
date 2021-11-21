/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumferencesoapservice;

/**
 *
 * @author eiwte
 */
public class CircumferenceSoapService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("circumference = " + circumference(7.0));
    }
    
    private static double circumference(double r){
        serviceClient.CircleService_Service service = new serviceClient.CircleService_Service();
        serviceClient.CircleService port = service.getCircleServicePort();
        return port.circumference(r);
    }
}
