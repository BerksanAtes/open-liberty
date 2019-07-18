-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=com.ibm.websphere.appserver.restConnector-3.0
visibility=public
singleton=true
IBM-API-Package: com.ibm.websphere.jmx.connector.rest; type="ibm-api", \
 com.ibm.ws.jmx.connector.client.rest; type="ibm-api", \
 com.ibm.websphere.filetransfer; type="ibm-api"
IBM-ShortName: restConnector-3.0
Subsystem-Name: Admin REST Connector 3.0
-features=com.ibm.websphere.appserver.restHandler-1.0, \
 com.ibm.websphere.appserver.servlet-3.0; ibm.tolerates:="3.1, 4.0"
-bundles=com.ibm.ws.filetransfer.routing.archiveExpander, \
 com.ibm.ws.jmx.connector.server.rest, \
 com.ibm.ws.jmx.connector.client.rest, \
 com.ibm.ws.filetransfer, \
 com.ibm.websphere.filetransfer, \
 com.ibm.ws.jmx.request, \
 com.ibm.ws.rest.handler.config
-jars=com.ibm.websphere.appserver.spi.restHandler; location:=dev/spi/ibm/, \
 com.ibm.websphere.appserver.api.restConnector; location:=dev/api/ibm/
-files=clients/restConnector.jar, \
 clients/jython/restConnector.py, \
 dev/api/ibm/javadoc/com.ibm.websphere.appserver.api.restConnector_1.3-javadoc.zip, \
 clients/jython/README, \
 dev/spi/ibm/javadoc/com.ibm.websphere.appserver.spi.restHandler_2.0-javadoc.zip
kind=beta
edition=core