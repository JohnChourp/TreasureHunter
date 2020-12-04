package org.codegrinders.treasure_hunter.repository;

import org.codegrinders.treasure_hunter.TreasureHunterApplication;
import org.codegrinders.treasure_hunter.model.Puzzle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TreasureHunterApplication.class)
@WebAppConfiguration
public class MongoTest {

    private EmbeddedMongoDb embeddedMongoDb;

    @Autowired
    private MongoTemplate mongoTemplate;

    private Puzzle puzzle;

    @Before
    public void setEmbeddedMongoDb() throws Exception {
        embeddedMongoDb = new EmbeddedMongoDb();
        embeddedMongoDb.startEmbeddedMongo();
    }

    @Test
    public void should_write_in_mongo() {
        Assert.assertNotNull(mongoTemplate);
        //Puzzle puzzle = new Puzzle();
        puzzle.setQuestion("how are you?");
        puzzle.setAnswer("good");
        puzzle.setPoints(0);


        mongoTemplate.save(puzzle);
        Puzzle newPuzzle = mongoTemplate.findAll(Puzzle.class).get(0);
       Assert.assertEquals("good", newPuzzle.getAnswer());

    }

    @After
    public void stopEmbeddedMongo() {
        embeddedMongoDb.stop();
    }
//    public static class Puzzle{
//        String question;
//
//    }

}