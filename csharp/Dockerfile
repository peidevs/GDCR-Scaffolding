FROM mono:4.6.1.3

ENV NUNIT_VERSION 2.6.4 

RUN apt-get update 
RUN apt-get install -y 
RUN apt-get install -y wget 
RUN nuget install NUnit.Runners -o /tmp/nunit -version $NUNIT_VERSION 
RUN mkdir /nunit 

RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/nunit-console.exe /nunit 
RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/nunit-console.exe.config /nunit 
RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/nunit.framework.dll /nunit 
RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/lib/nunit-console-runner.dll /nunit 
RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/lib/nunit.util.dll /nunit 
RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/lib/nunit.core.interfaces.dll /nunit 
RUN cp /tmp/nunit/NUnit.Runners.$NUNIT_VERSION/tools/lib/nunit.core.dll /nunit 

RUN apt-get clean
