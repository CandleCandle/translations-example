package uk.me.candle.translations.example;

import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.me.candle.translations.conf.DefaultBundleConfiguration;
import uk.me.candle.translations.maker.BundleMaker;

public class FooTest {

	@Test
	public void testFooBundle_en() throws Exception {
 		// Load the bundle with the check flags enabled.
		// this will throw an exception if there is an error
		// with either the abstract Class or the properties file
		Foo foo = BundleMaker.load(Foo.class, Locale.UK, new DefaultBundleConfiguration());
		assertNotNull(foo.bar());
	}

	@Test
	public void testFooBundle_fr() throws Exception {
		Foo foo = BundleMaker.load(Foo.class, Locale.FRENCH, new DefaultBundleConfiguration());
		assertNotNull(foo.bar());
	}
}
