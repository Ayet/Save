package fr.cpe;
import javax.ejb.Local;

@Local
public interface Hello {
	String sayHello(String name);
}
