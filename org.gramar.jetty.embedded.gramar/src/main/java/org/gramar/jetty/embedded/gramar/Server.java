package org.gramar.jetty.embedded.gramar;

import org.gramar.Apply;
import org.gramar.exception.GramarException;
import org.gramar.util.PropertiesHelper;

/**
 *
 * Command line applicator for gramar org.gramar.jetty.embedded.gramar
 *
 */
public class Server extends Apply {

	public Server() {
		super();
	}

	public static void main(String[] args) {

		try {
			new Server().apply(args);
		} catch (GramarException e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void defaultValues(PropertiesHelper pm) {
		pm.setProperty(PropertiesHelper.PROPERTY_GRAMAR_ID, "org.gramar.jetty.embedded.gramar", false);
	}

}
