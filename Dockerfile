FROM jboss/wildfly
ENV DEPLOYMENT_DIR /opt/jboss/wildfly/standalone/deployments
COPY ./target/risico-rest-*.war ${DEPLOYMENT_DIR}/risico.war 
