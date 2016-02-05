package org.gramar.maven.gramar;

import org.gramar.Apply;
import org.gramar.exception.GramarException;
import org.gramar.util.PropertiesHelper;

/**
 *
 * Command line applicator for gramar org.gramar.maven.gramar
 *
 */
public class Artifact extends Apply {

	public Artifact() {
		super();
	}

	public static void main(String[] args) {

		try {
			new Artifact().apply(args);
		} catch (GramarException e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void defaultValues(PropertiesHelper pm) {
		pm.setProperty(PropertiesHelper.PROPERTY_GRAMAR_ID, "org.gramar.maven.gramar", false);
	}

}
