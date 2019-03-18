#!/bin/bash

set -e

mkdir -p /usr/share/service

cat <<EOF >/usr/share/service/env.properties
APPLICATION_NAME=$APPLICATION_NAME
DEPLOYMENT_GROUP_NAME=$DEPLOYMENT_GROUP_NAME
DEPLOYMENT_ID=$DEPLOYMENT_ID
EOF
