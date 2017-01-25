package de.ge.foo;

public class Source {

	private int foo;

	private SourceNested nested;

	public int getFoo() {
		return foo;
	}

	public void setFoo(final int foo) {
		this.foo = foo;
	}

	public SourceNested getNested() {
		return nested;
	}

	public void setNested(final SourceNested nested) {
		this.nested = nested;
	}

}
