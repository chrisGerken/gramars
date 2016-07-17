package org.gramar.eclipse.deploy.gramar;

import org.gramar.Apply;
import org.gramar.exception.GramarException;
import org.gramar.util.PropertiesHelper;

/**
 *
 * Command line applicator for gramar org.gramar.eclipse.deploy.gramar
 *
 */
public class UpdateSite extends Apply {

	public UpdateSite() {
		super();
	}

	public static void main(String[] args) {

		try {
			new UpdateSite().apply(args);
		} catch (GramarException e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void defaultValues(PropertiesHelper pm) {
		pm.setProperty(PropertiesHelper.PROPERTY_GRAMAR_ID, "org.gramar.eclipse.deploy.gramar", false);
	}

}
