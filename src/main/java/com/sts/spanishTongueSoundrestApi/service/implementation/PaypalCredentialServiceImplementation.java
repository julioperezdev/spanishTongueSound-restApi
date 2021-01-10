package com.sts.spanishTongueSoundrestApi.service.implementation;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import com.paypal.orders.OrdersCreateRequest;
import org.springframework.stereotype.Service;



@Service
public class PaypalCredentialServiceImplementation {

    static String clientId = "AdiPn6Pkg8PzLJyUZGY1TuydpF31Sl6CMaZ44O3dPkNFVuY_4rZiADMp1YHFSXoCy5aPX-VplxvpDTF7";
    static String secret = "EEwQ4lP9ljT0lPubkl1ghkmZcMpiuzqoyp8Be-JgNOPVW7Ij9WsE5_QXpaZ2VGyZFmuqGBAdCVs-xzeC";

    private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
            clientId,
            secret);

    PayPalHttpClient client = new PayPalHttpClient(environment);

    public PayPalHttpClient client(){
        return this.client;
    }


}
