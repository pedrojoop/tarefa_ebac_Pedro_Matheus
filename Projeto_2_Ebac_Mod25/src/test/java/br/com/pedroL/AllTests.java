package br.com.pedroL;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author pmpedrolima@gmail.com
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
