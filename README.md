Notice regarding Scala 2.12 branch
----------------------------------

This migration to 2.12 cuts out everything to do with Kryo. It's only been tested for machine-local executions. Clustered applications are likely not supported.

Furthermore, this branch uses sbt for managing the build. To create a self-contained jar, run `sbt assembly`.


Signal/Collect
==============

Signal/Collect is a framework for computations on large graphs. The model allows to concisely express many iterated and data-flow algorithms, while the framework parallelizes and distributes the computation.

How to develop in Eclipse
-------------------------
Install the [Typesafe IDE for Scala 2.11](http://scala-ide.org/download/sdk.html).

Ensure that Eclipse uses a Java 8 library and JVM: Preferences → Java → Installed JREs → JRE/JDK 8 should be installed and selected.

Import the project into Eclipse: File → Import... → Maven → Existing Maven Projects → select "signal-collect" folder

Thanks a lot to
---------------
* [University of Zurich](http://www.ifi.uzh.ch/ddis.html) and the [Hasler Foundation](http://www.haslerstiftung.ch/en/home) have generously funded the research on graph processing and the development of Signal/Collect.
* GitHub helps us by hosting our [code repositories](https://github.com/uzh/signal-collect).
* Travis.CI offers us very convenient [continuous integration](https://travis-ci.org/uzh/signal-collect).
* Codacy gives us automated [code reviews](https://www.codacy.com/public/uzh/signalcollect).
