/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.distancecalculator.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 */
@Path("/hello-rs")
@Produces("text/plain")
public class HelloEndpoint {
    @GET
    public String greetings() {
        return "hello rest";
    }

}
