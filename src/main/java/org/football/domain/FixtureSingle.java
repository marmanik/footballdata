package org.football.domain;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
public class FixtureSingle {

    private Fixture fixture;
    private Head2head head2head;

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Head2head getHead2head() {
        return head2head;
    }

    public void setHead2head(Head2head head2head) {
        this.head2head = head2head;
    }
}
