DESCRIPTION = "Oprofile demo applications for Matrix v2"
HOMEPAGE = "https://gitorious.org/matrix-gui-v2/matrix-gui-v2-apps"
LICENSE = "CC-BY-SA"

require matrix-gui-apps-git.inc

PR = "${INC_PR}.0"

inherit allarch

S = ${WORKDIR}/git/oprofile_apps

# Make sure profiling submenu and app images  has been installed
# Include am-sysinfo because that package has the sample
# executables for profiling.
RDEPENDS +=  "matrix-gui-apps-images matrix-gui-submenus-oprofile oprofile am-sysinfo"

FILES_${PN} += "${MATRIX_BASE_DIR}/*"
