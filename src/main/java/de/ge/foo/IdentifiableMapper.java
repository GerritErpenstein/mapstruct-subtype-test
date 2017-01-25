package de.ge.foo;

import java.util.UUID;

public class IdentifiableMapper {

	public UUID map(final Identifiable<UUID> value) {
		return value.getId();
	}

}
