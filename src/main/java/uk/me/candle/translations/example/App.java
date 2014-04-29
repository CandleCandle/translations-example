package uk.me.candle.translations.example;

import java.util.Locale;
import uk.me.candle.translations.conf.DefaultBundleConfiguration;
import uk.me.candle.translations.service.BasicBundleService;
import uk.me.candle.translations.service.BundleService;

public class App {

	public static void main(String[] args) {
		System.out.println("== == == == == == ==");
		System.out.println("FRENCH: ");
		printForLocale(Locale.FRENCH);

		System.out.println("== == == == == == ==");
		System.out.println("ENGLISH: ");
		printForLocale(Locale.ENGLISH);
	}

	private static void printForLocale(Locale locale) {
		BundleService service = new BasicBundleService(new DefaultBundleConfiguration(), locale);
		System.out.println("I know a bar called " + service.get(Foo.class).bar());
		System.out.println(service.get(Foo.class).pony("Sparky"));
		System.out.println(service.get(Foo.class).iHaveSomeOranges(5));
		System.out.println(service.get(Foo.class).iHaveAFewArguments("obj", true, (byte)4, 'q', (short)6, 1, 9999, 9.5f, 4.4d));
		
	}
}

