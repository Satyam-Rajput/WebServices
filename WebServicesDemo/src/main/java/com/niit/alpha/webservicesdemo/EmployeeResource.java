package com.niit.alpha.webservicesdemo;

import javax.ws.rs.*;

@Path("/employee")

public class EmployeeResource {
@GET
@Path("{empno}")
@Produces("application/json")
public String getJson(@PathParam("empno")int empno)
{
	
	switch(empno)
	{
	
	case 1: return "{'name':'satyam','age':21}";
	case 2: return "{'name':'Abhinav','age':30}";
	default: return "{'name':'Jack of All','age':18}";
	}
	
	

}
	
}
