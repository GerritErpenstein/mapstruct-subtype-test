package de.ge.foo.test;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import de.ge.foo.Source;
import de.ge.foo.SourceMapper;
import de.ge.foo.SourceNested;
import de.ge.foo.Target;

public class SubtypeTest {

	@Test
	public void test1() {
		final Source mySource = new Source();
		final SourceNested mySourceNested = new SourceNested();
		final UUID uuid = UUID.randomUUID();
		mySourceNested.setId(uuid);
		mySource.setFoo(42);
		mySource.setNested(mySourceNested);

		final SourceMapper mapper = Mappers.getMapper(SourceMapper.class);
		final Target myTarget = mapper.toTarget(mySource);

		assertEquals(myTarget.getFoo(), mySource.getFoo());
		assertEquals(myTarget.getNestedId(), mySource.getNested().getId());
	}

}
