# ClashMetaForAndroid

An Android VPN client for the Clash Meta proxy engine. The user imports and
switches between Clash configurations (profiles), and the app runs a local
VPN tunnel that routes device traffic through proxies defined by the active
profile.

## Language

### Configuration management

**Profile**:
A Clash configuration the user imports, manages, and applies to the tunnel.
Types: File (local file), Url (fetched over HTTP), External (provided by
another app). A newly imported profile is Pending; once fetched, validated,
and copied into place it becomes Imported. Exactly one Imported profile is
active at a time and is loaded into the running tunnel.
_Avoid_: config, subscription

**Provider**:
A named source of proxies or rules inside a profile, refreshed on a schedule
set by the profile. Carries proxies (Proxy provider) or rules (Rule provider)
over a vehicle: HTTP (fetched), File, Inline, or Compatible.
_Avoid_: subscription, upstream

**Subscription**:
Quota metadata reported by a URL profile's server in the fetch response:
upload, download, total, expire, and suggested update interval. Not a
synonym for Profile or Provider.
_Avoid_: using it for the Profile itself

**ProfileImporter**:
A mechanism that produces a new Pending profile: file picker, URL, QR code,
or an external app's intent. The design-layer code names this
`ProfileProvider`, which collides with Provider — the canonical term is
ProfileImporter.
_Avoid_: ProfileProvider (code name for this concept)

### Runtime state

**Proxy**:
Anything the tunnel can route traffic through, as listed by the running
engine. Either a Node or a ProxyGroup. The code models both as one type with
an `isGroup` flag.
_Avoid_: endpoint

**Node**:
A Proxy that is an actual upstream server (Shadowsocks, vmess, Trojan, ...),
not a selection device. The non-group case of Proxy.
_Avoid_: server, proxy (when the group case is meant)

**ProxyGroup**:
A Proxy whose job is selection rather than connection: it picks one of its
member Proxies per its policy (Selector, URLTest, ...). Has exactly one
currently selected member at any time.
_Avoid_: proxy list, selection

**RoutingMode**:
The tunnel's traffic routing policy: Direct (all traffic bypasses the
proxies), Global (all traffic goes through the currently selected Proxy),
Rule (per-rule decisions), or Script (decided by a script).
_Avoid_: mode on its own, tunnel mode

**Tunnel**:
The running VPN session that carries device traffic into the Engine and
routes it per the active Profile. Started and stopped by the user; the
app's central on/off concept.
_Avoid_: VPN connection, service

**Engine**:
The Clash Meta binary process that actually proxies and routes traffic
according to the active Profile. The app is a front end for it.
_Avoid_: core, backend

**Traffic**:
A cumulative byte count transferred through the Tunnel, tracked separately
for upload and download. Also tracked per Profile for quota display.
_Avoid_: data, usage (when byte count is meant)

**Override**:
Runtime settings the user layers on top of the active Profile without
editing it: ports, allow-lan, DNS, sniffer, external controller, and so
on. Survives Profile switches.
_Avoid_: runtime config, settings override

**AccessControl**:
The rule deciding which apps' traffic the Tunnel handles: all apps, only
selected apps, or all but selected apps. The app list backing the
selected modes is part of this concept.
_Avoid_: app filter, whitelist (for the whole concept)
