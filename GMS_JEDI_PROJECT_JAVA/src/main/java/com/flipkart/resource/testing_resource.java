package com.flipkart.resource;

import com.flipkart.bean.GymOwner;
import com.flipkart.dao.AdminGMSDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("gym_owner")
public class testing_resource {
    @GET
    @Path("info")
    @Produces(MediaType.APPLICATION_JSON)
    public GymOwner getUserInfo(@QueryParam("id") String id) {
        AdminGMSDao x = new AdminGMSDao();
        return x.get_gym_owner_by_id(id);
    }
}
