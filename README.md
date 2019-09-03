# Duct database.mongodb.monger

[Integrant][] methods for middleware that captures errors to [Sentry][] via
[raven-clj][].

[integrant]: https://github.com/weavejester/integrant
[sentry]: https://sentry.io
[raven-clj]: https://github.com/sethtrain/raven-clj

## Installation

To install, add the following to your project `:dependencies`

    [viebel/sentry "0.1.0"]

## Usage

This library supports a single integrant key `duct.middleware.sentry/capture-error`. This keyword wraps the `raven-clj.ring/wrap-sentry` function. The sentry dsn is passed on the `:dsn` key:

```edn
{
:duct.middleware.sentry/capture-error {:dsn "my-dsn"}
}
```

Additional parameterrs are passed as parameters to `raven-clj.ring/wrap-sentry`.

For more information using raven-clj, see [raven-clj][].

## License

Copyright © 2019 Yehonathan Sharvit

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
