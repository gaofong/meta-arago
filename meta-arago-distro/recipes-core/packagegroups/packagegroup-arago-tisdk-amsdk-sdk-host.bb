DESCRIPTION = "Task to install additional scripts and applications into the SDK"
LICENSE = "MIT"
PR = "r2"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Choose the kernel and u-boot recipe sources to use
U-BOOT_SRC = ""
KERNEL_SRC = ""

U-BOOT_SRC_am335x-evm = "u-boot-src"
KERNEL_SRC_am335x-evm = "linux-am335x-src"

RDEPENDS_${PN} = "\
    pinmux-utility \
    ti-tisdk-setup \
    board-port-labs-src \
    ti-tisdk-makefile \
    ${U-BOOT_SRC} \
    ${KERNEL_SRC} \
"
