package br.com.caelum.vraptor.serialization;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.serialization.gson.GsonDeserialization;

/**
 * Used by {@link Consumes} options to configure {@link Deserializee} and change
 * the {@link GsonDeserialization} behavior.
 * 
 * @author Renan Montenegro
 * @since REPLACE_ME_ON_NEXT_RELEASE
 *
 */
public interface DeserializerConfig {
	void config(Deserializee deserializee);
}
