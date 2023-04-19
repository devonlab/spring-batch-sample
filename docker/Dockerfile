# J-Jobs
#
# Copyright (c) LG CNS and/or its affiliates. All rights reserved.

# Pull base image
# ---------------
#FROM public.ecr.aws/amazonlinux/amazonlinux:2022 as base
FROM amazoncorretto:19

# Maintainer
# ----------
MAINTAINER J-Jobs <j-jobs@lgcns.com>

# Environment variables required for this build (do NOT change)
# -------------------------------------------------------------

# Custom Environment variables
# -------------------------------------------------------------
ENV WORKING_DIR=/working

# Install Util
# -------------------------------------------------------------
RUN yum update; yum clean all

# Copy files needed during both installation and runtime
# -------------
COPY shell/*.sh $WORKING_DIR/
RUN chmod ug+x $WORKING_DIR/*.sh

# timezone setting
RUN ln -snf /usr/share/zoneinfo/Asia/Seoul /etc/localtime

ENTRYPOINT ["/working/execute-spring-batch.sh"]