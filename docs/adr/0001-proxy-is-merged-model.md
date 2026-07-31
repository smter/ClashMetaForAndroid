# 0001: Proxy is a merged model — groups are proxies

We model Proxy as one merged type covering both nodes and groups, with
`isGroup` as an attribute rather than splitting Node and ProxyGroup into
separate domain types. This matches the Clash Meta engine's `/proxies` API,
which returns a flat list where every entry is either a node or a group, and
keeps the app's view model aligned 1:1 with the engine's shape. The
alternative — distinct Node and ProxyGroup types — is conceptually cleaner
but forces a mapping layer at the API boundary for no behavioral gain;
`ProxyGroup` remains only as the detail-view payload (members + currently
selected member), not as a sibling type.
