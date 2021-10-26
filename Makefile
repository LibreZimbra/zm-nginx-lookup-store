# SPDX-License-Identifier: AGPL-3.0-or-later

ANT_TARGET = jar

all: build-ant-autover

include build.mk

install:
	$(call mk_install_dir, lib/ext/nginx-lookup)
	cp build/zm-nginx-lookup-store*.jar $(INSTALL_DIR)/lib/ext/nginx-lookup/nginx-lookup.jar

clean: clean-ant
