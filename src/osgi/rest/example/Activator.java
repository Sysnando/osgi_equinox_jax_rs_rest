package osgi.rest.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	  private ServiceRegistration registration;

	  @Override
	  public void start( BundleContext context ) throws Exception {
		  RestServiceExample exampleService = new RestServiceExample();
	    registration = context.registerService( RestServiceExample.class.getName(), exampleService, null );
	  }
	  //testando o jenkins
	  //testando o jenkins1
	  //testando o jenkins2
	  //testando o jenkins3
	  //testando o jenkins4
	  @Override
	  public void stop( BundleContext context ) throws Exception {
		  
	    registration.unregister();
	  }

}
