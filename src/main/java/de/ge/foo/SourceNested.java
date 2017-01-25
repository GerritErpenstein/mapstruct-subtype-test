package de.ge.foo;

import java.util.UUID;

public class SourceNested implements Identifiable<UUID> {

	private UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(final UUID id) {
		this.id = id;
	}

}
