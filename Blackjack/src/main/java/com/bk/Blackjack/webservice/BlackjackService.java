package com.bk.Blackjack.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/blackjack")
public class BlackjackService {

    @GET
    @Produces("text/plain")
    public String getCongrats() {
        return "hi:)";
    }

}
