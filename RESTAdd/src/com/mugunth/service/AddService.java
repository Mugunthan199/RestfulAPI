package com.mugunth.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mugunth.model.*;

@Path("/Examples")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class AddService {

	public AddService() {
		// TODO Auto-generated constructor stub
	}
	
	@POST
    @Path("/add")
	public Response add(Add p) {
		//Response response = new Response();
		Integer res;
		res=(Integer)(p.getA()+p.getB());
		Result r=new Result();
			r.setSum(res);
			return Response.ok(r).build();
		}
	@POST
	@Path("/mark")
	public Response verify(Student studentdetails)
	{
		String status;
		if(studentdetails.getTotalmarks()>500)
		{
			status="Qaulified";
		}
		else
		{
			status="not Qaulified";
		}
		StudentResult sr=new StudentResult();
		sr.setStatus(status);
		sr.setStudentdetails(studentdetails);
		return Response.ok(sr).build();
	}
	}

