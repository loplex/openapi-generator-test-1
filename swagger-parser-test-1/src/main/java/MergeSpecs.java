import java.net.URL;
import java.util.Objects;

import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;
import io.swagger.v3.parser.core.models.SwaggerParseResult;


public class MergeSpecs {

	public String mergeSpecs(URL mergeSpecLocation) {
		ParseOptions parseOptions = new ParseOptions();
		parseOptions.setResolve(true);
		SwaggerParseResult swaggerParseResult = new OpenAPIV3Parser().readLocation(mergeSpecLocation.toString(), null, parseOptions);
		return Yaml.pretty(swaggerParseResult.getOpenAPI());
	}

	public String mergeSpecsDefault() {
		URL mergeSpecLocation = getClass().getClassLoader().getResource("merged_spec12.yaml");
		Objects.requireNonNull(mergeSpecLocation);
		return mergeSpecs(mergeSpecLocation);
	}
}
