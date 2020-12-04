package org.codegrinders.treasure_hunter.repository;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

import java.io.IOException;

public class EmbeddedMongoDb {
    private int port;
     private MongodProcess mongodProcess;

    public EmbeddedMongoDb(int port) {
        this.port = port;
    }

    public EmbeddedMongoDb(){
        this.port=27017;

    }

    public void startEmbeddedMongo() throws IOException {
        MongodStarter mongodStarter=MongodStarter.getDefaultInstance();
        MongodExecutable mongodExecutable=mongodStarter.prepare(new MongodConfigBuilder()
        .version(Version.Main.PRODUCTION)
        .net(new Net(port, Network.localhostIsIPv6()))
        .build());
        mongodProcess=mongodExecutable.start();

    }

    public void stop(){
        mongodProcess.stop();
    }

}
