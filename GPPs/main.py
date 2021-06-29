import pygeoip
gip = pygeoip.GeoIP("GeoLiteCity.dat")
res = gip.record_by_addr('73.134.107.153')
for key, val in res.items():
    print('%s : %s' % (key, val))