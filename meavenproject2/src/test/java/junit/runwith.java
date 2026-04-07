package junit;

import org.junit.runners.Parameterized;

public @interface runwith {

	Class<Parameterized> value();

}
