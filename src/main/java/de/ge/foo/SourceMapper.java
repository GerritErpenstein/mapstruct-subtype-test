package de.ge.foo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = { IdentifiableMapper.class })
public interface SourceMapper {

	@Mappings({ @Mapping(source = "nested", target = "nestedId") })
	Target toTarget(Source source);

}
