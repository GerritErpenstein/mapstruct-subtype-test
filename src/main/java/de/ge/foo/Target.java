package de.ge.foo;

import java.util.UUID;

public class Target {

	private int foo;

	private UUID nestedId;

	public int getFoo() {
		return foo;
	}

	public void setFoo(final int foo) {
		this.foo = foo;
	}

	public UUID getNestedId() {
		return nestedId;
	}

	public void setNestedId(final UUID nestedId) {
		this.nestedId = nestedId;
	}

}
