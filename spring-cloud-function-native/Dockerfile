FROM amazonlinux:2

ENV GRAALVM_VERSION=22.2.0
ENV FILE_NAME=graalvm-ce-java17-linux-amd64-${GRAALVM_VERSION}.tar.gz
ENV JAVA_HOME=./graalvm-ce-java17-${GRAALVM_VERSION}

RUN yum clean all \
    && yum update -y \
    && yum install -y wget tar gzip bzip2-devel ed gcc gcc-c++ gcc-gfortran \
    less libcurl-devel openssl openssl-devel readline-devel xz-devel \
    zlib-devel glibc-static libcxx libcxx-devel llvm-toolset-7 zlib-static \
    && rm -rf /var/cache/yum

COPY . /app
WORKDIR /app

RUN wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-${GRAALVM_VERSION}/${FILE_NAME}
RUN tar zxvf ${FILE_NAME}
RUN rm -f ${FILE_NAME}
RUN ${JAVA_HOME}/bin/gu install native-image

RUN ./mvnw -ntp package -P native-image