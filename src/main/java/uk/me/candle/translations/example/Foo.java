package uk.me.candle.translations.example;

import java.util.Locale;
import uk.me.candle.translations.Bundle;

public abstract class Foo extends Bundle {

	public Foo(Locale locale) {
		super(locale);
	}

	public abstract String bar();
	public abstract String zit();
	public abstract String pony(String s);
	public abstract String iHaveSomeOranges(int i);
	public abstract String iHaveAFewArguments(Object o, boolean z, byte b, char c, short s, int i, long l, float f, double d);
}
