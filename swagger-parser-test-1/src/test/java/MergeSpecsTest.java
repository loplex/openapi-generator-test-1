import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;


class MergeSpecsTest {
	private static final File OUTPUT_FILE = new File("target", "output.yaml");

	@Test
	public void myTest() throws IOException {
		String resultYaml = new MergeSpecs().mergeSpecsDefault();

		System.out.println(resultYaml);

		boolean ignored = OUTPUT_FILE.getParentFile().mkdirs();
		FileUtils.writeStringToFile(OUTPUT_FILE, resultYaml, StandardCharsets.UTF_8);
	}
}
