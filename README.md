### openapi-generator test1 - fixed

This repo shows bug in openapi-generator when using `openap-yaml` generator
for merging more specifications into one.

This is branch, where bug is **fixed**.

You have to run `git submodule update swagger-parser` to checkout required submodule.

For not working example, look at branch `main`:

If `skipValidateSpec`
- is set to `false` (default), it fails.
- is set to `true`, the resulting specification (in `target/openapi/openapi.yaml`)
  is not valid (contains non-existing ref).
