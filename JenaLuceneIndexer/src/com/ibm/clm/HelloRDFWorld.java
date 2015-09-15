package com.ibm.clm;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.*;

public class HelloRDFWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = ModelFactory.createDefaultModel();
		String NS = "http://example.com/test/";
		
		Resource r = m.createResource(NS + "r");
		Property p = m.createProperty(NS + "p");
		
		r.addProperty(p, "hellow world", XSDDatatype.XSDstring);
		
		m.write(System.out, "Turtle");
	}

}
