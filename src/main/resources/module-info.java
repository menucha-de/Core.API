module havis.util.core.api {
    requires jackson.annotations;

    requires transitive java.logging;
    requires transitive java.rmi;

    exports havis.util.core;
    exports havis.util.core.app;
    exports havis.util.core.license;
    exports havis.util.core.log;
    exports havis.util.core.rmi;

}