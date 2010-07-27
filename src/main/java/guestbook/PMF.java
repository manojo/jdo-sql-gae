package guestbook;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class PMF {
  //replace with datanucleus.gae.properties when wanting to test GAE
	private static final PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("datanucleus.sql.properties");

	private PMF() {
	}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}
}
