package fr.cpe;
import java.util.List;

import javax.ejb.Stateless;

import fr.cpe.IAdd;
@Stateless

public class Add implements IAdd
{
	
	public String add(List<Double> nombres){
		
		double resultat=0;
		for(int i=0;i<nombres.size();i++)
		{
			resultat+=nombres.get(i);
		}

		return "result : " +(nombres == null ||nombres.size()<=0 ? "world": resultat);
		
		//a.stream().mapToDouble(Double::doubleValue().sum());
		
		}
}