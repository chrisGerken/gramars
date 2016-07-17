package org.gramar.storm.gramar;

import org.gramar.Apply;
import org.gramar.exception.GramarException;
import org.gramar.util.PropertiesHelper;

public class ApplyG extends Apply {

	@Override
	public void defaultValues(PropertiesHelper pm) {
		super.defaultValues(pm);
	}

	public static void main (String[] args) {

		String[] a = { "gramar=org.gramar.storm.gramar" , "diagram" };
		try {
			new ApplyG().apply(a);
		} catch (GramarException e) {
			System.err.println(e.toString());
		}

	}

}
