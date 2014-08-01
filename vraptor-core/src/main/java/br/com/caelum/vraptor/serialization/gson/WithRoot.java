package br.com.caelum.vraptor.serialization.gson;

import javax.enterprise.context.Dependent;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.serialization.Deserializee;
import br.com.caelum.vraptor.serialization.DeserializerConfig;

/**
 * A {@link Consumes} option to force deserialization with root element.
 * 
 * @author Renan Montenegro
 * @since REPLACE_ME_ON_NEXT_RELEASE
 *
 */
@Dependent
public class WithRoot implements DeserializerConfig {

	@Override
	public void config(Deserializee deserializee) {
		deserializee.setWithoutRoot(false);
	}

}
