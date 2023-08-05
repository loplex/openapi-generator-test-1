### openapi-generator test1

This repo shows bug in openapi-generator when using `openap-yaml` generator
for merging more specifications into one.

If `skipValidateSpec`
- is set to `false` (default), it fails.
- is set to `true`, the resulting specification (in `target/openapi/openapi.yaml`)
  is not valid (contains non-existing ref).

For working solution, look at branch `fixed`.
