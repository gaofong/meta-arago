# look for files in this layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR_append = "-arago16"

SRC_URI += " \
	file://inetd \
	file://inetd.conf \
"
